package com.company;
import java.io.*;
import java.util.*;

public class P2demo{

    public static void sortArray(ArrayList<P2> arrli)
    {
        P2 temp;
        for (int a = 0; a < arrli.size(); a++) {
            for (int b = a; b < arrli.size(); b++) {
                if (arrli.get(a).averageMonthlyIncome() < arrli.get(b).averageMonthlyIncome()) {
                    temp = arrli.get(a);
                    arrli.set(a, arrli.get(b));
                    arrli.set(b, temp);
                } else if (arrli.get(a).averageMonthlyIncome() == arrli.get(b).averageMonthlyIncome()) {
                    int x = (arrli.get(a).getFirstName()).compareTo((arrli.get(b).getFirstName()));
                    if (x > 0) {
                        temp = arrli.get(a);
                        arrli.set(a, arrli.get(b));
                        arrli.set(b, temp);
                    }


                }
            }
        }
    }

    public static void main (String[] args) throws NullPointerException{
        Scanner keyboard = new Scanner (System.in);
        Scanner keyboard2= new Scanner (System.in);
        System.out.println("Please enter the number of employees");
        int number=keyboard2.nextInt();
        ArrayList<P2> arrli=new ArrayList<P2>(number);


        for(int i=0;i<number;i++){
            System.out.print("Please enter the employee the employee's type od compensation:(fixed or hourly), first name,the employee annual salary or hourly rate ");
            String input=keyboard.nextLine();
            String[] employee=input.split(",");

            if (employee[0].equalsIgnoreCase("fixed")){
                FixedSalary employee1= new FixedSalary(i+1,employee);
                arrli.add(employee1);
            }
            else if (employee[0].equalsIgnoreCase("hourly")){
                HourlyWage employee2= new HourlyWage(i+1,employee);
                arrli.add(employee2);
            }
            else{
                System.out.println("error,enter the right information again");
                i--;
            }
        }

        sortArray(arrli);


        for (P2 x:arrli) {
            System.out.println(x+"\n");

        }
    }



}


