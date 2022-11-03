package ie.atu.PassengerWeek6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    Passenger pass;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTitle() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
      //  assertEquals("Hi", pass.test());
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms"))
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");
        }

    }
    @Test
    void testTitleFail() {
        String title = "Mar";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms"))
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");
        }

    }
    @Test
    void testName() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(name.length() >= 3)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of three characters required");
        }

    }
    @Test
    void testNameFail() {
        String title = "Mr";
        String name = "Te";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(name.length() >= 3)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of three characters required");
        }

    }

    @Test
    void testID() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(id.length() >= 10)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of ten characters required");
        }

    }

    @Test
    void testIDFail() {
        String title = "Mr";
        String name = "Ted";
        String id = "123";
        String phone = "123456789";
        int age = 20;
        if(id.length() >= 10)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of ten characters required");
        }

    }

    @Test
    void testPhone() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(id.length() >= 7)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of seven characters required");
        }

    }

    @Test
    void testPhoneFail() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "1234";
        int age = 20;
        if(id.length() >= 7)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Minimum of seven characters required");
        }

    }
    @Test
    void testage() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 20;
        if(age > 16)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }

    }

    @Test
    void testageFail() {
        String title = "Mr";
        String name = "Ted";
        String id = "123345";
        String phone = "123456789";
        int age = 15;
        if(age > 16)
        {
            pass = new Passenger(title, name, id, phone, age);
        }

        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }

    }



    @AfterEach
    void tearDown() {
    }

}