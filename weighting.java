import java.util.Scanner; 
public class weighting {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("We will ask you for Weightage for each category and the sum of it. round the number you put into a whole number");
	
		System.out.println("Weightage for homework and classwork: ");
		double Weight= input.nextDouble(); 
		
		System.out.println("Weightage for test: ");
		double Weighttest= input.nextDouble(); 
		
		System.out.println("Weightage for change: ");
		double Weightchange= input.nextDouble(); 
		
		System.out.println("Weightage for Labs/projects: ");
		double Weightlabs= input.nextDouble(); 
		
		
		double total= (Weight+Weighttest+Weightchange+Weightlabs); 
		
		System.out.println("Average student weight in hw: ");
		double studenthw= input.nextDouble(); 
		
		System.out.println("Average student weight in test: ");
		double studenttest= input.nextDouble(); 
		
		System.out.println("Average student weight in change: ");
		double studentchange= input.nextDouble(); 
		
		System.out.println("Average student weight in labs/project: ");
		double studentlab= input.nextDouble(); 
		
		double fscorehw = (Weight*studenthw) ; 
		double fscorechange = (Weightchange*studentchange) ; 
		double fscorelabs = (Weightlabs*studentlab) ; 
		double fscoretest = (Weighttest*studenttest) ; 
		
		double finalscore = (fscorehw+fscorechange+fscorelabs+fscoretest); 
		double grade = (finalscore/total); 
		
		System.out.println("your grade is: "+ grade + "%"); 
		
		input.close(); 
		
		
		
		
		

	}

}
