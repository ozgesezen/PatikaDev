package Classes.MaasHesaplayici;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        setSalary();
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';

    }

    public double tax(){
        if (this.salary<=1000){
            return 0;
        } else if (this.salary>1000) {
            return this.salary*0.03;
        }
        return 0;
    }

    public double bonus(){
        if (this.workHours>40){
            double bonusUcret =(this.workHours-40)*30;
            return bonusUcret;
        }
        return 0;
    }

    public double raiseSalary(){
        int calismaYili = 2021-this.hireYear;
        if (calismaYili<10){
            double maasArtisi =this.salary*0.05;
            return maasArtisi;
        } else if (calismaYili>9 && calismaYili<20) {
            double maasArtisi = this.salary*0.1;
            return maasArtisi;
        } else if (calismaYili>19) {
            double maasArtisi = this.salary*0.15;
            return maasArtisi;
        }
        return 0;
    }

    public void setSalary(){
        double totalSalary = this.salary-tax()+bonus()+raiseSalary();
        System.out.println("Vergi \t:"+tax());
        System.out.println("Bonus \t:"+bonus());
        System.out.println("Maas Artisi \t:"+raiseSalary());
        System.out.println("Toplam Maas \t:"+totalSalary);

    }
}
