package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<=10000&&salary>0){
            salary -= salary*0.15;
            System.out.println(salary);
        } else if (salary>10000&&salary<=20000) {
                salary -= salary*0.18;
                System.out.println(salary);
        } else if (salary>20000) {
                salary -= salary*0.20;
                System.out.println(salary);
        } else  {
            System.out.println("wrong input");
        }
    }
}
