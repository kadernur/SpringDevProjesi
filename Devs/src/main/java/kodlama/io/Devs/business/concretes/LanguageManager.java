package kodlama.io.Devs.business.concretes;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	LanguageRepository languageRepository;
	
	
    @Autowired //IOC yapısını sağlar.
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) {
		
		if(checkLanguageNameValid(language))
		{
			throw new RuntimeException("programming language cannot be empty");
		}
		
		if(isLanguageExist(language))
		{
			throw new RuntimeException("This programming language is available, please enter another name.");
		}
		
		languageRepository.add(language);
		
		
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public void update(Language language, int id) {
		if(checkLanguageNameValid(language))
			{
				throw new RuntimeException("programming language cannot be empty");
			}
	
		if(isLanguageExist(language))
			{
				throw new RuntimeException("This programming language is available, please enter another name.");
			}
		
		languageRepository.update(language,id);
		
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	
	//program ismi aynı olamaz
	//program ismi boş geçilemez
	//kurallarının kontrolünü bu fonksiyonlar sağlar.
	
	public boolean checkLanguageNameValid(Language language)
	{
		return language.getName().isEmpty() || language.getName().isBlank();
	}
	
	public boolean isLanguageExist(Language language)
	{
		return languageRepository.getAll().stream().anyMatch(x -> x.getName().equals(language.getName()));
	}
}
