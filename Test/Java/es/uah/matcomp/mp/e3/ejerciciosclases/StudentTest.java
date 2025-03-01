package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("Carlos Pérez", "456 Maple St", "Computer Science", 2024, 1500.0);

@Test
public void testGetProgram() {
    assertEquals("Computer Science", student.getProgram());
}

@Test
public void testSetProgram() {
    student.setProgram("Mathematics");
    assertEquals("Mathematics", student.getProgram());
}

@Test
public void testGetYear() {
    assertEquals(2024, student.getYear());
}

@Test
public void testSetYear() {
    student.setYear(2025);
    assertEquals(2025, student.getYear());
}

@Test
public void testGetFee() {
    assertEquals(1500.0, student.getFee());
}

@Test
public void testSetFee() {
    student.setFee(2000.0);
    assertEquals(2000.0, student.getFee());
}

@Test
public void testToString() {
    String expected = "Student [Person [name=Carlos Pérez, address=456 Maple St], program=Computer Science, year=2024, fee=1500.0]";
    assertEquals(expected, student.toString());
}
}