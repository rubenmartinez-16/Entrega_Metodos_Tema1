package es.uah.matcomp.mp.e1.ejerciciosclases;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account a1 = new Account("A101","Tan Ah Teck", 88);
    Account a2 = new Account("A103","Ruben");

    @org.junit.jupiter.api.Test
    void getID() {
        assertEquals("A101",a1.getID());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Tan Ah Teck",a1.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(88,a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        assertEquals(100,a1.credit(12));
    }

    @org.junit.jupiter.api.Test
    void debit() {
        assertEquals(88,a1.debit(89));
        assertEquals(76,a1.debit(12));
        assertEquals(0,a1.debit(76));

    }
    Account c1 = new Account("A102", "Paula", 100);

    @org.junit.jupiter.api.Test

    void transferTo() {
        a1.transferTo( c1, 50); // Transfiere 50 desde a1 a c1
        assertEquals(150, c1.getBalance()); // Verifica que c1 ahora tiene 150

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Account[id=A101, name=Tan Ah Teck, balance=88]",a1.toString());
    }
}