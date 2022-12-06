package week2.day1assignment;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{
		
			System.out.println(empName);
			System.out.println(empId);
			}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println(empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{
			
			System.out.println(empSalary);
		}
		public void printEmployeeMobileNumber(long mobileNum)
		{
			System.out.println(mobileNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails emp=new EmployeeDetails();
			emp.printEmployeeName("Divya",18);
		    emp.getEmployeeAddress("Tiruvallur");
			emp.printEmployeeSalary(35000.10);
			emp.printEmployeeMobileNumber(9159160785L);

		
	}

		
}


	

		
	
