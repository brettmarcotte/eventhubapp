package com.company.Account;

public class AccountDriver {

    public static int Account(){
        System.out.println("Select Event Type");
        System.out.println("1. Live Music Venue");
        System.out.println("2. Bars");
        System.out.println("3. Genre");
        System.out.println("4. Live Music Festival");

        int choice = 0;
        do {
            System.out.println("Enter Choice");
            //choice = keyboard.nextInt();
        } while (choice < 1 || choice > 4);

        return choice;
    }

    public static int searchAccount(Account account [], int count, int accountNumber) {
        //for (int i = 0; i < count ; i++) {
          //  if(account[i] == accountNumber){
            //    return i;
            //}
        //}
        return -1;
    }


}
