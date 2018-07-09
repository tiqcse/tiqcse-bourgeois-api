package sample;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class ModelMapperBean {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
