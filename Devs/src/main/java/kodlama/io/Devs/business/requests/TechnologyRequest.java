package kodlama.io.Devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyRequest {
	
	private int languageId;
	private String name;

}
