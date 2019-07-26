package com.hsbc.demo;

public class Demo1 {

	public static void main(String[] args) {
		String result = isEligibleForLoan(17,500000);
		System.out.println(result);
	}
		
	public static String isEligibleForLoan(int age,double income) {
			try{
				String res=processLoan(age,income);
				return res;
			}catch(AgeException|IncomeException e) {
				return e.getMessage();
			}finally {
				System.out.println("I am in finally block");
			}
			
		}
		public static String processLoan(int age ,double income) throws AgeException, IncomeException {
			if(age<20||age>50)
				throw new AgeException("age must be between 20 and 50");//checked exception is raised and do not want to handle then provoke by including throws
			if(income<400000)
				throw new IncomeException("Income must be min 4 lakhs");
			return "eligible for loan";
		}
	}

