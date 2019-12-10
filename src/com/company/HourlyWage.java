package com.company;

class HourlyWage extends P2 {
    double hourly;

    public HourlyWage(int id, String[] employee) {
        super(id, employee);
        this.hourly = Double.parseDouble(employee[2]);
    }

    public double averageMonthlyIncome() {
        return 20.8 * 8 * hourly;
    }


    public String toString() {
        return firstName + " " + "#" + id + " " + compensation + " $" + averageMonthlyIncome();
    }
}