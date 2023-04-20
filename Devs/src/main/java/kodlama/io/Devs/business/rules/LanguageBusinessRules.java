package kodlama.io.Devs.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.core.exceptions.BusinessException;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Devs.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageBusinessRules {

	
	private LanguageRepository languageRepository;
	public void checkIfLanguageNameExists(String name)
	{
		if(languageRepository.existsByName(name))
		{
			throw new BusinessException("Language name already exists");
		}
	}
	
	
	
}
