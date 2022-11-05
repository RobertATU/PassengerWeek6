package ie.atu.PassengerWeek6;

public class Passenger {
    String title,name,id,phone;
    int age;

    public Passenger(String title, String name, String id, String phone, int age) {
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms"))
        {
            this.title = title;
        }

        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");
        }

        if(name.length() >= 3)
        {
            this.name = name;
        }

        else{
            throw new IllegalArgumentException("Minimum of three characters required");
        }

        if(id.length() >= 10)
        {
            this.id = id;
        }

        else{
            throw new IllegalArgumentException("Minimum of ten characters required");
        }

        if(phone.length() >= 7)
        {
            this.phone = phone;
        }

        else{
            throw new IllegalArgumentException("Minimum of seven characters required");
        }

        if(age > 16)
        {
            this.age = age;
        }

        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }

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

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
