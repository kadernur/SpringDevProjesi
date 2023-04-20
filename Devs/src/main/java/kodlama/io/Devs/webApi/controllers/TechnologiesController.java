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

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.CreateTechnologyRequests;
import kodlama.io.Devs.business.requests.UpdateTechnologyRequests;
import kodlama.io.Devs.business.responses.GetAllTechnologiesReponse;
import kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/technologies")
@AllArgsConstructor
public class TechnologiesController {
	
	private TechnologyService technologyService;

	
	
//	public TechnologiesController(TechnologyService technologyService) {
//		
//		this.technologyService = technologyService;
//	}
//	
	
	@GetMapping("/getall")
	public List<GetAllTechnologiesReponse> getAll()
	{
		return technologyService.getAll();
	}
	
	
	@GetMapping("/getbyId/{id}")
	public GetByIdTechnologiesResponse getById(@PathVariable int id)
	{
		return technologyService.getById(id);
	}
	
	
	@PostMapping("/create/")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add( @RequestBody @Valid()CreateTechnologyRequests createtechnologyRequest)
	{
		technologyService.add(createtechnologyRequest);
	}
	
	
	@PutMapping("/update/{id}")
	public void update(  @RequestBody UpdateTechnologyRequests updatetechnologyRequest, int id)
	{
		technologyService.update(updatetechnologyRequest, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		this.technologyService.delete(id);
	}
	

}
