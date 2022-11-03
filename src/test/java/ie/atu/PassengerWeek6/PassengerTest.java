package ie.atu.PassengerWeek6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {
    Passenger pass;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTitle() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals("Mr", pass.getTitle());
        System.out.println(pass);
    }

    @Test
    void testTitleFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mar", "Ted", "1234567890", "1234567", 20));
        assertEquals("Title must be Mr, Mrs or Ms", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }



    @AfterEach
    void tearDown() {
    }

}