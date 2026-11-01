package bankaccountapp;

public abstract class Account implements IBaseRate {
    //objects cant be created from abstract class but from classes that inherit accounts
    //parent and child class
    //Implements whatever is inside ibaserate is included here

    //listCommon props spec to savings and  checking  accounts
    //constructor to initialise base settings for intialising accounts
    public Account(String name){
        System.out.println("NAME IS: "+name);
        }
    //list any methods specific to savings acc

}
