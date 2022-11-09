package kodlama.io.Devs.business.abstracts;

import java.util.List;


import kodlama.io.Devs.business.requests.TechnologyRequest;
import kodlama.io.Devs.business.responses.TechnologyResponse;


public interface TechnologyService {

	
	public List<TechnologyResponse> getAll();
	public TechnologyResponse getResponseById(int id);
	public void add(TechnologyRequest technologyRequest);
	public void update(TechnologyRequest technologyRequest, int id);
	public void delete(int id);
}