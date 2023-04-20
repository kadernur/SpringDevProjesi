package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.CreateLanguageRequests;
import kodlama.io.Devs.business.requests.UpdateLanguageRequests;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
	
	private LanguageService languageService;
	
	
//    @Autowired  //IOC
//	public LanguagesController(LanguageService languageService) {
//		
//		this.languageService = languageService;
//	}
    
    
    
    @GetMapping("/getAll")
    public List<GetAllLanguagesResponse> getAll()
    {
    	return languageService.getAll();
    }
    
    
    
    
    //Düzenli ifadeler ile tanımlanan istekler dinamik URL olarak adlandırılır 
    //ve değeri almak için 
    //@PathVariable ifadesi kullanılır.
    
    @GetMapping("/getbyId/{id}")
    public GetByIdLanguagesResponse getById( @PathVariable int id)
    {
    	return languageService.getById(id);
    }
    
    
    
    
    
    
    //RequestBody istekle birlikte(POST,PUT vb.) bize gelen veri
    //Gelen istekleri Java sınıfları ile eşlemek için @RequestBody kullanılır.
    
    @PostMapping("/cerate")
    @ResponseStatus(code=HttpStatus.CREATED)
    public void add(@RequestBody @Valid()  CreateLanguageRequests createlanguageRequest) throws Exception
    {
    	this.languageService.add(createlanguageRequest);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int   id)
    {
    	this.languageService.delete(id);
    }
    
    
    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateLanguageRequests updatelanguageRequest, @PathVariable int id) throws Exception
    {
    	this.languageService.update(updatelanguageRequest, id);
    }
    
    
  //Parametleri almak için @RequestParam kullanılır.
    
	
	

}
