package org.miu.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        DeptEmployee prof1=new Professor("Renee Erikson",15000, LocalDate.parse("2000-10-10"),678);
        Professor prof2=new Professor("Renatu Mohanraj",18900, LocalDate.parse("2014-01-01"),403);
        Professor prof3=new Professor("Forgor Lempogo",12000, LocalDate.parse("2023-11-28"),515);
        Secretary secretary1=new Secretary("Gloria Adutwum",8200,LocalDate.parse("1999-12-26"),15);
        Secretary secretary2=new Secretary("Aurelia Lilyss",5800,LocalDate.parse("2019-06-26"),21);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0]=prof1;
        department[1]=prof2;
        department[2]=prof3;
        department[3]=secretary1;
        department[4]=secretary2;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you wish to see the sum of all Professors and Secretaries in the department?");
        if(br.readLine().toUpperCase().equals("Y")){
            double sumOfSalaries=0;
            for(DeptEmployee emp:department){
                sumOfSalaries+=emp.computeSalary();
            }
            System.out.printf("The sum of salaries is %.2f\n",sumOfSalaries);
            System.out.printf("The average salary is %.3f\n",sumOfSalaries/department.length);
        }
        br.close();
    }
}
