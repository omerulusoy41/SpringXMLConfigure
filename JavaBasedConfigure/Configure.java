package JavaBasedConfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configure {
	
	@Bean("class1")
	public Class1 getClass1() {
		return new Class1(getName(),getClass2());
	}
	@Bean("class2")
	public Class2 getClass2() {
		return new Class2();
	}
	@Bean
	public String getName() {
		return "String Bean ile inject edildim";
	}
}
