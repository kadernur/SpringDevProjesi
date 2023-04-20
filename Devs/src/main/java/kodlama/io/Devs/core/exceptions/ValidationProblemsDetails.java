package kodlama.io.Devs.core.exceptions;

import java.util.Map;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationProblemsDetails extends ProblemDetails {
	
	private Map<String,String> validationErrors;

}
