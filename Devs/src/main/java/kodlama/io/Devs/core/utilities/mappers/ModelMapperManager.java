package kodlama.io.Devs.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {

	private ModelMapper modelMapper;
	
	
	
	 public ModelMapper forResponse() {
		 this.modelMapper.getConfiguration()
         .setAmbiguityIgnored(true)
         .setMatchingStrategy(MatchingStrategies.LOOSE);
       return this.modelMapper;
	}

	
	public ModelMapper forRequest() {
		 this.modelMapper.getConfiguration()
         .setAmbiguityIgnored(true)
         .setMatchingStrategy(MatchingStrategies.STANDARD);
          return this.modelMapper;
	}

}
