package kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.CreateLanguageRequests;
import kodlama.io.Devs.business.requests.UpdateLanguageRequests;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;
import kodlama.io.Devs.business.rules.LanguageBusinessRules;
import kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
	
	LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;
	private LanguageBusinessRules languageBusinessRules;
	
	
   

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages=languageRepository.findAll();
		
		//List<LanguageResponse> languageResponse=new ArrayList<LanguageResponse>();
		
		/*
		 * for(Language language: languages) { LanguageResponse responseItem=new
		 * LanguageResponse(); responseItem.setId(language.getId());
		 * responseItem.setName(language.getName()); languageResponse.add(responseItem);
		 * }
		 */
		
		List<GetAllLanguagesResponse> languagesResponse=languages.stream()
				.map(language->this.modelMapperService.forResponse().
						map(language,GetAllLanguagesResponse.class )).collect(Collectors.toList());
		
		return languagesResponse;
		
	}

	@Override
	public void add(CreateLanguageRequests createlanguageRequest) {
		this.languageBusinessRules.checkIfLanguageNameExists(createlanguageRequest.getName());
		//checkNameValid(createlanguageRequest.getName());
		//Language language=new Language();
		//language.setName(createlanguageRequest.getName());
		
		 Language language= this.modelMapperService.forRequest().map(createlanguageRequest, Language.class);
		
		languageRepository.save(language);
		
		
	}

	@Override
	public void delete(int id) {
		languageRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateLanguageRequests updatelanguageRequest,int id) throws Exception {
		//checkNameValid(updatelanguageRequest.getName());
		languageBusinessRules.checkIfLanguageNameExists(updatelanguageRequest.getName());
		Language language=languageRepository.findById(id);
		//	language.setName(languageRequest.getName());
			
		language=this.modelMapperService.forRequest().map(updatelanguageRequest, Language.class);
		
		this.languageRepository.save(language);
	}

	/*
	 * @Override public Language getById(int id) { return
	 * languageRepository.findById(id); }
	 */

	
	//program ismi aynı olamaz
	//program ismi boş geçilemez
	//kurallarının kontrolünü bu fonksiyonlar sağlar.
/*	private void checkNameValid(String name) throws Exception
	{
		Language isExist= languageRepository.findByName(name);
		if(isExist !=null)
		{
			throw new Exception("Bu isim zaten Var!!!");
		}
		
		if(name.isBlank())
		{
			throw new Exception("İsim boş Geçilemez!!!");
		}
		
	}
	*/
	

	@Override
	public GetByIdLanguagesResponse getById(int id) {
		Language language = this.languageRepository.findById(id);
		/*
		 * LanguageResponse languageResponse=new LanguageResponse();
		 * languageResponse.setName(language.getName());
		 * languageResponse.setId(language.getId());
		 */
		
		
		GetByIdLanguagesResponse response=this.modelMapperService.forResponse().map(language,GetByIdLanguagesResponse.class);
		
		return response;
	}

	
	
}
