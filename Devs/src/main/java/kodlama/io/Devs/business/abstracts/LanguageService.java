package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateLanguageRequests;
import kodlama.io.Devs.business.requests.UpdateLanguageRequests;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdLanguagesResponse;


public interface LanguageService {
	
	List<GetAllLanguagesResponse> getAll();
	 GetByIdLanguagesResponse getById(int id);
	
	void add(CreateLanguageRequests createlanguageRequest ) throws Exception ;
	void delete(int id);
	void update(UpdateLanguageRequests updatelanguageRequest , int id) throws Exception;
	//public Language getById(int id);
	
	

}
