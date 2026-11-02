package bankaccountapp;

public class Checking extends Account{
    //list props spec to Checkings  acc
    int debitCardNumber;
    int debitCardPIN;

    //constructor to initialise settings for checkings props
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        //to call the parent we need to explicitly invoke that with super keyword
        System.out.println("NEW CHECKING ACCOUNT");
     //   System.out.println("NAME IS: "+name);
    }
    //list any methods specific to checkings acc
}
