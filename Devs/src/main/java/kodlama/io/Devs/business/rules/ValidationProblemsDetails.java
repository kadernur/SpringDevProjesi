package kodlama.io.Devs.business.rules;

import java.util.Map;

import kodlama.io.Devs.core.exceptions.ProblemDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationProblemsDetails extends ProblemDetails {
	
	private Map<String,String> validationErrors;

}
