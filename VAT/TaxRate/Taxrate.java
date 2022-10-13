package TaxRate;

public class Taxrate {
    public static class Employee{
        double taxRate;
        double socialRate;
        double salary = 2000;
        String name;
        String surName;
        double tax = salary * taxRate + salary * socialRate;

        public Employee(double taxRate, double socialRate) {
            this.taxRate = taxRate;
            this.socialRate = socialRate;
        }
        public static Employee RezidentEmployee = new Employee(0.15, 0.1);
        public static Employee NoRezidentEmployee = new  Employee(0.2, 0.03);
        private static Employee Contractor = new Employee(0,0);

        public static void main(String[] args) {
            RezidentEmployee.name = "vasya";
            RezidentEmployee.salary = 1500;
            RezidentEmployee.tax = RezidentEmployee.salary * RezidentEmployee.taxRate + RezidentEmployee.salary * RezidentEmployee.socialRate;

            System.out.println(RezidentEmployee.name + " " + RezidentEmployee.tax);

            NoRezidentEmployee.name = "petya";
            NoRezidentEmployee.salary = 3500;
            NoRezidentEmployee.tax = NoRezidentEmployee.salary * NoRezidentEmployee.taxRate + NoRezidentEmployee.salary * NoRezidentEmployee.socialRate;
            System.out.println(NoRezidentEmployee.name + " " + NoRezidentEmployee.tax);

            Contractor.name = "dima";
            Contractor.salary = 2700;
            Contractor.tax = Contractor.salary * Contractor.taxRate + Contractor.salary * Contractor.socialRate;
            System.out.println(Contractor.name + " " + Contractor.tax);
        }

    }


}
