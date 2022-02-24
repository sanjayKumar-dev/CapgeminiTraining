package Question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Question10.Triangle;

public class mainClass {
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		triangle.draw();
		
	}

}
