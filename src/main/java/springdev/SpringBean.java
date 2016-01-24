package springdev;

import org.springframework.stereotype.Service;

@Service("springbean")
public class SpringBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void helloWorld(){
		System.out.println("Hello World");
	}
	
}
