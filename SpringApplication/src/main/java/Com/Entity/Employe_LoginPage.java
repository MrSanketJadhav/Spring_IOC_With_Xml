package Com.Entity;

public class Employe_LoginPage {
	
	private String Emp_Email_id;
	private String Emp_Password;
	
	private EmployeeRegisterationPage Emp;

	public String getEmp_Email_id() {
		return Emp_Email_id;
	}

	public void setEmp_Email_id(String emp_Email_id) {
		Emp_Email_id = emp_Email_id;
	}

	public String getEmp_Password() {
		return Emp_Password;
	}

	public void setEmp_Password(String emp_Password) {
		Emp_Password = emp_Password;
	}

	public EmployeeRegisterationPage getEmp() {
		return Emp;
	}

	public void setEmp(EmployeeRegisterationPage emp) {
		Emp = emp;
	}

	public Employe_LoginPage(String emp_Email_id, String emp_Password, EmployeeRegisterationPage emp) {
		super();
		Emp_Email_id = emp_Email_id;
		Emp_Password = emp_Password;
		Emp = emp;
	}

	@Override
	public String toString() {
		return "Employe_LoginPage [Emp_Email_id=" + Emp_Email_id + ", Emp_Password=" + Emp_Password + ", Emp=" + Emp
				+ "]";
	}

	public Employe_LoginPage() {
		
	}
	
	
	

}
