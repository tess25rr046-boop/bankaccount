package bankaccountapp;


public abstract class Account implements IBaseRate {
    //objects cant be created from abstract class but from classes that inherit accounts
    //parent and child class
    //Implements whatever is inside ibaserate is included here

    //listCommon props spec to savings and  checking  accounts

    //list any methods specific to savings acc
    String name; String sSN; String accountNumber; double balance; double rate;
    static int index =  10000;
    //constructor to initialise base settings for intialising accounts
    public Account(String name,String sSN, double initDeposit){
        this.name=name;
        this.sSN=sSN;
        balance=initDeposit;
        System.out.println("NAME IS: "+name+ "SSN IS: "+sSN+"Balance: $"+balance);

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println("ACCOUNT NUMBER IS: "+ this.accountNumber);

    }
    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
         return lastTwoOfSSN;
        }
}


