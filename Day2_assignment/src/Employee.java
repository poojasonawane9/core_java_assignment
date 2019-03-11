public class Employee{
	int employeeId;
	String employeeName;
	double employeeMonthlyBasic;

		public Employee(int employeeId,String employeeName,double employeeMonthlyBasic){
			this.employeeId = employeeId;
			this.employeeName=employeeName;
			this.employeeMonthlyBasic = employeeMonthlyBasic;
		}

		public double getAnnualBasic(){
			return 12 * this.employeeMonthlyBasic;
		}

		public double getMonthlyGrossSalary(){
			double hra =  employeeMonthlyBasic * 0.5f;
			double medical = 1250;
			double conveyance = 800;
			return (employeeMonthlyBasic + hra + medical + conveyance);
		}

		public double getAnnualGrossSalary(double annualGross){
			return 12 * annualGross;
		}

		public double getMonthlyDeductions(double monthlyGross){
			double PF = employeeMonthlyBasic * 0.1f;
			double pfValue;
			double ESIC = 0;
			double professionalTax;
			if(PF < 6500){
				pfValue = PF;
			}
			else{
				pfValue = 6500;
			}
			if(monthlyGross <= 10000){
				professionalTax = 50;
			}
			else{
				professionalTax = 100;
			}
			if(employeeMonthlyBasic<= 5000){
				ESIC = employeeMonthlyBasic * 0.0475f;
			} 
				return (pfValue + professionalTax + ESIC);
			}


		public double getMonthlyTakeHome(double monthlyGross,double monthlyDeducations){
			return (monthlyGross - monthlyDeducations);
		}

		public double getAnnualTakeHome(double monthlyTakeHome){
			return 12 * monthlyTakeHome;
		}					
}