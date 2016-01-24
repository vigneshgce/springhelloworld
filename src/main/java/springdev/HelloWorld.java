package springdev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	public static void main(String args[]){
		
		//get spring context
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringBean bean=(SpringBean) context.getBean("springbean");
		bean.helloWorld();
		
	}

}
