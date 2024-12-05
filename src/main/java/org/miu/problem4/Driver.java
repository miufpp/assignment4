package org.miu.problem4;

public class Driver {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee=new CommissionEmployee("Edith","Nyadeva","5432178",29500, 0.10);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Adiza","Gbevu","41977867",11200,8);
        SalariedEmployee salariedEmployee=new SalariedEmployee("John","Adamfo","5255645",6205.22);
        Employee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Rebecca","Ofui","329956",99909, 0.19,4200.15);
        CommissionEmployee basePlusCommissionEmployee1=new BasePlusCommissionEmployee("Joy","Aigbe","98998765",229909, 0.19,8720.11);
        Employee[] fellowGhanaian=new Employee[]{commissionEmployee,hourlyEmployee,salariedEmployee,basePlusCommissionEmployee1,basePlusCommissionEmployee};
        display(fellowGhanaian);
        System.out.println("Employee with highest salary : "+findMaxSalary(fellowGhanaian));
    }

    public static void display(Employee[] empArr){
        if(empArr==null||empArr.length==0) throw new IllegalArgumentException("Employee array should not be null or empty!");
        for(Employee emp:empArr){
            System.out.println(emp);
        }
    }
    public static Employee findMaxSalary (Employee[] col) {
        if(col==null||col.length==0) throw new IllegalArgumentException("Employee array should not be null or empty!");
        //todo what about multiple employees with same salary?
        Employee maxSalaryEmp=null;
        for(int i=0;i<col.length;i++){
            if(i==0){
                maxSalaryEmp=col[i];
            } else{
                if(col[i].getPayment()>maxSalaryEmp.getPayment()){
                    maxSalaryEmp=col[i];
                }
            }
        }
        return maxSalaryEmp;
    }
}
