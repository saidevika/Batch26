import jrout.tutorial.spring.core.employee.service.IEmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainAppCoreContainer {

	public static void main(String[] args) {
//		Resource res = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(res);

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

//		IEmployeeService empService1 = (IEmployeeService) factory.getBean("employeeServiceNew");
//		IEmployeeService empService2 = (IEmployeeService) factory.getBean("employeeServiceNew");
//
//		System.out.println(empService1 == empService2);
//		System.out.println("HasCode on 1 " +empService1.hashCode());
//		System.out.println("HasCode on 2 "+ empService2.hashCode());

//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
//				"com/tutorial/spring/core_01/advancedContainer/_01FirstApplicationContext/spring.cfg.xml");
		//IEmployeeService empService = (IEmployeeService)factory.getBean("employeeServiceNew");
		
	}
}