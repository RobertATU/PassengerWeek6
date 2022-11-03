package ie.atu.PassengerWeek6;

public class Passenger {
    String title,name,id,phone;
    int age;

    public Passenger(String title, String name, String id, String phone, int age) {
        this.title = title;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }
}
