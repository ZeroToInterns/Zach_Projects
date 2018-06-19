
public class LoanApplicant {
	
	double annualSalary;
	int yearsOnJob;
	
	public LoanApplicant(double annualSalary, int yearsOnJob) {
		this.annualSalary = annualSalary;
		this.yearsOnJob = yearsOnJob;
	}
	
	public boolean qualifies() {
		boolean result = false;
		if( annualSalary > 100000) {
			result = true;
		}
		else if (annualSalary > 50000 && annualSalary <= 100000) {
			if (yearsOnJob >= 2) {
				result = true;
			}
			else {
				result = false;
			}
		}
		else if (annualSalary > 30000 && annualSalary <= 50000) {
			if(yearsOnJob >= 5) {
				result = true;
			}
			else {
				result = false;
			}
		}
		else {
			result = false; 
		}
		return result;
	}
	
	//mutator
	public void setYearsOnJob (int years) {
		this.yearsOnJob = years;
	}
	//accessor
	public int getYearsOnJob () {
		return this.yearsOnJob;
	}
	
	public void setAnnualSalary(int salary) {
		this.annualSalary = salary;
	}
}
