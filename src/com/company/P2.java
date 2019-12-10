package com.company;

abstract class P2{
    int id;
    String[] employee;
    String firstName;
    String compensation;
    String salary;

    public P2(int id,String[] employee){
        this.id=id;
        this.firstName =employee[1];
        this.compensation = employee[0];

    }
    public abstract double averageMonthlyIncome();
    public  String getFirstName()
    {
        return firstName;
    };
}



