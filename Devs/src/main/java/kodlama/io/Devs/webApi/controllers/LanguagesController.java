package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;
	
	
    @Autowired  //IOC
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
    
    
    
    @GetMapping("/getall")
    public List<Language> getAll()
    {
    	return languageService.getAll();
    }
    
    
    
    
    //Düzenli ifadeler ile tanımlanan istekler dinamik URL olarak adlandırılır 
    //ve değeri almak için 
    //@PathVariable ifadesi kullanılır.
    
    @GetMapping("/getbyid/{id}")
    public Language getById( @PathVariable int id)
    {
    	return languageService.getById(id);
    }
    
    
    
    
    
    
    //RequestBody istekle birlikte(POST,PUT vb.) bize gelen veri
    //Gelen istekleri Java sınıfları ile eşlemek için @RequestBody kullanılır.
    
    @PostMapping("/")
    public void add(@RequestBody Language language)
    {
    	languageService.add(language);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int   id)
    {
    	languageService.delete(id);
    }
    
    
    @PutMapping("/{id}")
    public void update(@RequestBody Language language, @PathVariable int id)
    {
    	languageService.update(language, id);
    }
    
    
  //Parametleri almak için @RequestParam kullanılır.
    
	
	

}
