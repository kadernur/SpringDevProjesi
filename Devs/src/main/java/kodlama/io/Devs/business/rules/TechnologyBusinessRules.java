package kodlama.io.Devs.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.core.exceptions.BusinessException;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TechnologyBusinessRules {
	
	private TechnologyRepository technologyRepository;
	
	public void checkIfTechnologyNameExist(String name)
	{
		if(technologyRepository.existsByName(name))
		{
			throw new BusinessException("Technology name already exists");
		}
	}

}
