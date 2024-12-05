package org.miu.problem4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return  super.toString() +
                //", weeklySalary=" + weeklySalary +
                ", payment=" + getPayment();
    }
}
