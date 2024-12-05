package org.miu.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary=baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", baseSalary=" + baseSalary +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", Payment=" + getPayment();
    }
}
