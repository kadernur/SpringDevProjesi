package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateTechnologyRequests;
import kodlama.io.Devs.business.requests.UpdateTechnologyRequests;
import kodlama.io.Devs.business.responses.GetAllTechnologiesReponse;
import kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;


public interface TechnologyService {

	
	 List<GetAllTechnologiesReponse> getAll();
	GetByIdTechnologiesResponse getById(int id);
	 void add(CreateTechnologyRequests createtechnologyRequest);
	 void update(UpdateTechnologyRequests updatetechnologyRequest, int id);
	 void delete(int id);
}
