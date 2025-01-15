package Com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Entity.Employe_LoginPage;

public class MainClass {
	public static void main(String[] args) {
		
	      ApplicationContext Ap=new ClassPathXmlApplicationContext();
	      Employe_LoginPage Ep= Ap.getBean("Emp",Employe_LoginPage.class);
	      
	      System.out.println();
	      
	      
		
	}

}
