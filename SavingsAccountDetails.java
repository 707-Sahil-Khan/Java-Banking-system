package com.company;

public class SavingsAccountDetails {
    public static void main(String[] args){
        SavingsAccount Account1 = new SavingsAccount();
        SavingsAccount Account2 = new SavingsAccount();
        SavingsAccount Account3 = new SavingsAccount();
        // Calling setter getter functions
        Account1.setSa_Ac_Branch("Wah Branch");
        Account1.setSa_Account_Holder_Name("Sahil Khan");
        Account1.setSa_Ac_City("Wah Cantt");
        Account1.setSa_Ifsc_Code("HDFC0000123");
        Account1.setSa_Acc_Balance(90000000.0d);
        Account1.setSa_Ac_Num(12899928);

        //Account 2
        Account2.setSa_Ac_Branch("Islam Branch");
        Account2.setSa_Account_Holder_Name("Sahil Khan");
        Account2.setSa_Ac_City("Islamabad");
        Account2.setSa_Ifsc_Code("HDFC0000124");
        Account2.setSa_Acc_Balance(99999999.0d);
        Account1.setSa_Ac_Num(12899929);

        //Account 3
        Account3.setSa_Ac_Branch("Gulberg Branch");
        Account3.setSa_Account_Holder_Name("Sahil Khan");
        Account3.setSa_Ac_City("Lahore");
        Account3.setSa_Ifsc_Code("HDFC0000125");
        Account3.setSa_Acc_Balance(99999999.0d);
        Account1.setSa_Ac_Num(12899100);


        //Calling getter methods
        System.out.println("_________________ Account 1 Details _________________");
        System.out.println("Account Number: " + Account1.getSa_Ac_Num());
        System.out.println("Account City: " + Account1.getSa_Ac_City());
        System.out.println("Account Code: " + Account1.getSa_Ifsc_Code());
        System.out.println("Account Holder: " + Account1.getSa_Account_Holder_Name());
        System.out.println("Account Balance: " + Account1.getSa_Acc_Balance());

        System.out.println("_________________ Account 2 Details _________________");
        System.out.println("Account Number: " + Account2.getSa_Ac_Num());
        System.out.println("Account City: " + Account2.getSa_Ac_City());
        System.out.println("Account Code: " + Account2.getSa_Ifsc_Code());
        System.out.println("Account Holder: " + Account2.getSa_Account_Holder_Name());
        System.out.println("Account Balance: " + Account2.getSa_Acc_Balance());

        System.out.println("_________________ Account 3 Details _________________");
        System.out.println("Account Number: " + Account3.getSa_Ac_Num());
        System.out.println("Account City: " + Account3.getSa_Ac_City());
        System.out.println("Account Code: " + Account3.getSa_Ifsc_Code());
        System.out.println("Account Holder: " + Account3.getSa_Account_Holder_Name());
        System.out.println("Account Balance: " + Account3.getSa_Acc_Balance());

    }

}

