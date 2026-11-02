package bankaccountapp;

public class Savings extends Account {
    //list props spec to savings acc
    int safetyDepositBoxID;
    int safetyDepositPIN;

    //constructor to initialise settings for savings props
    public  Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
     //   System.out.println("NAME IS: "+name);
    }
    //list any methods specific to savings acc
}
