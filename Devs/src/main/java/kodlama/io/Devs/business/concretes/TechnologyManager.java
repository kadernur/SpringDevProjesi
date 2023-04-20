package kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.CreateTechnologyRequests;
import kodlama.io.Devs.business.requests.UpdateTechnologyRequests;
import kodlama.io.Devs.business.responses.GetAllTechnologiesReponse;
import kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import kodlama.io.Devs.business.rules.TechnologyBusinessRules;
import kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

	TechnologyRepository technologyRepository;
	LanguageService languageService;
	private ModelMapperService modelMapperService;
	public TechnologyBusinessRules technologyBusinessRules;
	
	

//	/*
//	 * @Autowired //IOC public TechnologyManager(TechnologyRepository
//	 * technologyRepository, LanguageService languageService) {
//	 * 
//	 * this.technologyRepository = technologyRepository; this.languageService =
//	 * languageService; }
//	 */
	
	
	
	
	@Override
	public List<GetAllTechnologiesReponse> getAll() {
		
		List<Technology> technologies=technologyRepository.findAll();
		/*
		 * List<TechnologyResponse> technologyResponse=new
		 * ArrayList<TechnologyResponse>();
		 * 
		 * for(Technology technology: technologies) { TechnologyResponse
		 * responseItem=new TechnologyResponse();
		 * responseItem.setId(technology.getId());
		 * responseItem.setName(technology.getName());
		 * responseItem.setLanguageId(technology.getLanguage().getId());
		 * responseItem.setLanguageName(technology.getLanguage().getName());
		 * 
		 * technologyResponse.add(responseItem); }
		 */
		List<GetAllTechnologiesReponse> technologiesResponse =technologies.stream().
				map(brand->this.modelMapperService.forResponse().
						map(brand,GetAllTechnologiesReponse.class)).collect(Collectors.toList());
		
		
		
		return technologiesResponse;
	}

	
	
	
	@Override
	public GetByIdTechnologiesResponse getById(int id) {
		
		Technology technology=technologyRepository.findById(id);
		/*
		 * TechnologyResponse technologyResponse=new TechnologyResponse();
		 * technologyResponse.setId(technology.getId());
		 * technologyResponse.setName(technology.getName());
		 * technologyResponse.setLanguageName(technology.getLanguage().getName());
		 */
		
		
        GetByIdTechnologiesResponse response=this.modelMapperService.forResponse().map(technology,GetByIdTechnologiesResponse.class);
		
		return response;
		
		
		
		
	}

	@Override
	public void add(CreateTechnologyRequests createtechnologyRequest) {
		//Technology technology=new Technology();
		//Language language=languageService.getById(createtechnologyRequest.getLanguageId());
	//technology.setName(technologyRequest.getName());
		//technology.setLanguage(language);
	
	technologyBusinessRules.checkIfTechnologyNameExist(createtechnologyRequest.getName());
    Technology technology =this.modelMapperService.forRequest().map(createtechnologyRequest,Technology.class);
		
				
		
		this.technologyRepository.save(technology);
		//technologyRepository.save(technology);
		
		
	}

	@Override
	public void update(UpdateTechnologyRequests updatetechnologyRequest, int id) {
		
		/*
		 * Technology technology=technologyRepository.findById(id); 
		 * Language updateLanguageId =languageService.getById(technologyRequest.getLanguageId());
		 * technology.setName(technologyRequest.getName());
		 * technology.setLanguage(updateLanguageId);
		 */
		
		
		technologyBusinessRules.checkIfTechnologyNameExist(updatetechnologyRequest.getName());
		Technology technology=this.modelMapperService.forRequest().map(updatetechnologyRequest, Technology.class);
		technologyRepository.save(technology);
		
	}

	@Override
	public void delete(int id) {
		technologyRepository.deleteById(id);
		
	}

}
