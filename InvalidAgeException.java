// Voting App
public class InvalidAgeException extends Exception{  // checked

     public InvalidAgeException(String errStr){

     	super(errStr);

     }

}

// BankApp
class InsufficientFundsException extends Exception{ // checked
 
    public InsufficientFundsException(String errStr){
     
     super(errStr);

    }
}