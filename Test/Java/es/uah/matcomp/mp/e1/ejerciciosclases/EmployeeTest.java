package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee e1 = new Employee(8, "Peter", "Tan", 2500);
    @Test
    void getId() {
        assertEquals(8, e1.getId());
    }

    @Test
    void getSalary() {
        assertEquals(2500, e1.getSalary());
    }
    Employee e2 = new Employee(9, "Lu", "T0n", 300);

    @Test
    void setSalary() {
        e2.setSalary(2500);
        assertEquals(2500, e2.getSalary());

    }

    @Test
    void getFirstName() {
        assertEquals("Peter", e1.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Tan", e1.getLastName());
    }

    @Test
    void getName() {
        assertEquals("Peter Tan", e1.getName());

    }

    @Test
    void getAnnualSalary() {
        assertEquals(2500*12, e1.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        e2.raiseSalary(10);
        assertEquals(300, e2.getSalary());
    }

    @Test
    void testToString() {
        assertEquals("Employee[ ID = 8First name = Peter Last name = Tan Salary = 2500 ]", e1.toString());

    }
}