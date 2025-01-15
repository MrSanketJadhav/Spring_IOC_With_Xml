package Com.Entity;

public class EmployeeRegisterationPage {

	private int Emp_id;
	private String Emp_FullName;
	private String Emp_Address;
	private String Emp_Gender;
	private String Emp_Company_name;
	private String Emp_Job_Role;
	private int Emp_Salary;
	private String Emp_Work_location;
	private String Emp_Email_id;
	private String Emp_Password;
	
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_FullName() {
		return Emp_FullName;
	}
	public void setEmp_FullName(String emp_FullName) {
		Emp_FullName = emp_FullName;
	}
	public String getEmp_Address() {
		return Emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		Emp_Address = emp_Address;
	}
	public String getEmp_Gender() {
		return Emp_Gender;
	}
	public void setEmp_Gender(String emp_Gender) {
		Emp_Gender = emp_Gender;
	}
	public String getEmp_Company_name() {
		return Emp_Company_name;
	}
	public void setEmp_Company_name(String emp_Company_name) {
		Emp_Company_name = emp_Company_name;
	}
	public String getEmp_Job_Role() {
		return Emp_Job_Role;
	}
	public void setEmp_Job_Role(String emp_Job_Role) {
		Emp_Job_Role = emp_Job_Role;
	}
	public int getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(int emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	public String getEmp_Work_location() {
		return Emp_Work_location;
	}
	public void setEmp_Work_location(String emp_Work_location) {
		Emp_Work_location = emp_Work_location;
	}
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
	@Override
	public String toString() {
		return "EmployeeRegisterationPage [Emp_id=" + Emp_id + ", Emp_FullName=" + Emp_FullName + ", Emp_Address="
				+ Emp_Address + ", Emp_Gender=" + Emp_Gender + ", Emp_Company_name=" + Emp_Company_name
				+ ", Emp_Job_Role=" + Emp_Job_Role + ", Emp_Salary=" + Emp_Salary + ", Emp_Work_location="
				+ Emp_Work_location + ", Emp_Email_id=" + Emp_Email_id + ", Emp_Password=" + Emp_Password + "]";
	}
	public EmployeeRegisterationPage(int emp_id, String emp_FullName, String emp_Address, String emp_Gender,
			String emp_Company_name, String emp_Job_Role, int emp_Salary, String emp_Work_location, String emp_Email_id,
			String emp_Password) {
		super();
		Emp_id = emp_id;
		Emp_FullName = emp_FullName;
		Emp_Address = emp_Address;
		Emp_Gender = emp_Gender;
		Emp_Company_name = emp_Company_name;
		Emp_Job_Role = emp_Job_Role;
		Emp_Salary = emp_Salary;
		Emp_Work_location = emp_Work_location;
		Emp_Email_id = emp_Email_id;
		Emp_Password = emp_Password;
	}
	public EmployeeRegisterationPage() {
		
	}
	
	
	
	

}
