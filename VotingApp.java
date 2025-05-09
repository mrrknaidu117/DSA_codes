public class VotingApp{
	
	public void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("under age");  // throw - explicitly
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
    
    VotingApp v1 = new VotingApp();

	try{
       v1.validate(23); // age>18
       v1.validate(16); // ag<18 -> exception must be thrown
     }
     catch(Exception e){
     	System.out.println(e);
     }
     finally{
     	System.out.println("Finally always gets executed");
     }
     System.out.println("Rst of the code ...follows!");

	}
}