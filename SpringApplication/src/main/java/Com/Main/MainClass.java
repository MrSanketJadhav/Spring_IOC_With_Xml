package Com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Entity.Employe_LoginPage;
import Com.Entity.EmployeeRegisterationPage;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext Ap = new ClassPathXmlApplicationContext("springbeans.xml");
		EmployeeRegisterationPage Ep = Ap.getBean(EmployeeRegisterationPage.class);
		
		System.out.println(Ep);	
		
		System.out.println("Register & Login Sucessfully");
         
	}

}
