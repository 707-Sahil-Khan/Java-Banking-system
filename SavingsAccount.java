package com.company;
public class SavingsAccount {

    //declaring instance variable
    private long Sa_Ac_Num;
    private String Sa_Account_Holder_Name;
    private String Sa_Ac_Branch;
    private String Sa_Ac_City;
    private double Sa_Acc_Balance;


    public long getSa_Ac_Num() {
        return Sa_Ac_Num;
    }

    public void setSa_Ac_Num(long sa_Ac_Num) {
        Sa_Ac_Num = sa_Ac_Num;
    }



    public String getSa_Account_Holder_Name() {
        return Sa_Account_Holder_Name;
    }

    public void setSa_Account_Holder_Name(String sa_Account_Holder_Name) {
        Sa_Account_Holder_Name = sa_Account_Holder_Name;
    }


    public String getSa_Ac_Branch() {
        return Sa_Ac_Branch;
    }

    public void setSa_Ac_Branch(String sa_Ac_Branch) {
        Sa_Ac_Branch = sa_Ac_Branch;
    }



    public String getSa_Ac_City() {
        return Sa_Ac_City;
    }

    public void setSa_Ac_City(String sa_Ac_City) {
        Sa_Ac_City = sa_Ac_City;
    }


    public String getSa_Ifsc_Code() {
        return Sa_Ifsc_Code;
    }

    public void setSa_Ifsc_Code(String sa_Ifsc_Code) {
        Sa_Ifsc_Code = sa_Ifsc_Code;
    }

    private String Sa_Ifsc_Code;

    public double getSa_Acc_Balance() {
        return Sa_Acc_Balance;
    }

    public void setSa_Acc_Balance(double sa_Acc_Balance) {
        Sa_Acc_Balance = sa_Acc_Balance;
    }



}