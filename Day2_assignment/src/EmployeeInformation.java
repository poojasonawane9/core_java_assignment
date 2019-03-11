public class EmployeeInformation{
		public static void main(String[] args){
		
			Employee employee = new Employee(101,"John",20000.0);

			double annualBasic=employee.getAnnualBasic();
			System.out.println("Annual basic salary is= "+annualBasic);

			double monthlyGross = employee.getMonthlyGrossSalary();
			System.out.println("Monthly Gross salary is= "+monthlyGross);
	 	
			double annualGross =employee.getAnnualGrossSalary(monthlyGross);
			System.out.println("Annual gross salary= "+annualGross);

			double monthlyDeductions = employee.getMonthlyDeductions(monthlyGross);
			System.out.println("Monthly deducation= "+monthlyDeductions);

			double monthlyTakeHome = employee.getMonthlyTakeHome(monthlyGross, monthlyDeductions);
			System.out.println("Monthly Take home is= "+monthlyTakeHome);

			double annualTakeHome = employee.getAnnualTakeHome(monthlyTakeHome);
			System.out.println("Monthly Take home is= "+annualTakeHome);

		}
}