package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int por){
        return (salary + ((salary * por) / 100));
    }
    public String toString(){
        return "Employee[ ID = " + id + "First name = " + firstName + " Last name = " + lastName + " Salary = " + salary + " ]";
    }


}
