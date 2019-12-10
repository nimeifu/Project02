package com.company;

class FixedSalary extends P2{
    double annalSalary;
    public FixedSalary(int id,String[] employee){
        super(id, employee);
        this.annalSalary=Double.parseDouble(employee[2]);
    }
    public double averageMonthlyIncome(){
        return annalSalary/12;
    }

    public String toString(){
        return firstName+ " "+ "#"+id+" "+compensation+ " $"+averageMonthlyIncome();
    }
}