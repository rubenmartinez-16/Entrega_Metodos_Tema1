package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    Staff staff = new Staff("Alice Smith", "789 Oak St", "High School", 3500.0);

@Test
public void testGetSchool() {
    assertEquals("High School", staff.getSchool());
}

@Test
public void testSetSchool() {
    staff.setSchool("University");
    assertEquals("University", staff.getSchool());
}

@Test
public void testGetPay() {
    assertEquals(3500.0, staff.getPay());
}

@Test
public void testSetPay() {
    staff.setPay(4000.0);
    assertEquals(4000.0, staff.getPay());
}

@Test
public void testToString() {
    assertEquals("Staff[Person [name=Alice Smith, address=789 Oak St] school:High Schoolpay:3500.0]", staff.toString());
}
}