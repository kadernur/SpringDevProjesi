package kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologiesReponse {
	
	private int id;
	private int languageId;
	private String languageName;
	private String name;

}
