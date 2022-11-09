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

import org.springframework.web.bind.annotation.RequestBody;
import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.LanguageRequest;
import kodlama.io.Devs.business.responses.LanguageResponse;


@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;
	
	
    @Autowired  //IOC
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
    
    
    
    @GetMapping("/getall")
    public List<LanguageResponse> getAll()
    {
    	return languageService.getAll();
    }
    
    
    
    
    //Düzenli ifadeler ile tanımlanan istekler dinamik URL olarak adlandırılır 
    //ve değeri almak için 
    //@PathVariable ifadesi kullanılır.
    
    @GetMapping("/getbyid/{id}")
    public LanguageResponse getById( @PathVariable int id)
    {
    	return languageService.getResponseById(id);
    }
    
    
    
    
    
    
    //RequestBody istekle birlikte(POST,PUT vb.) bize gelen veri
    //Gelen istekleri Java sınıfları ile eşlemek için @RequestBody kullanılır.
    
    @PostMapping("/add")
    public void add( @RequestBody LanguageRequest languageRequest) throws Exception
    {
    	languageService.add(languageRequest);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int   id)
    {
    	languageService.delete(id);
    }
    
    
    @PutMapping("/{id}")
    public void update(@RequestBody LanguageRequest languageRequest, @PathVariable int id) throws Exception
    {
    	languageService.update(languageRequest, id);
    }
    
    
  //Parametleri almak için @RequestParam kullanılır.
    
	
	

}
