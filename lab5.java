
class RegisterList {
    String Name;
    int age;
    int ID;
    float Milk;
    String Center;

    RegisterList() {
        System.out.println("Current Class Constructor");
    }

    RegisterList(String Name, int age, int ID, float Milk) {
        this();
        this.Name = Name;
        this.age = age;
        this.ID = ID;
        this.Milk = Milk;
    }

    RegisterList(String Name, int age, int ID, float Milk, String Center) {
        this(Name, age, ID, Milk);
        this.Center = Center;

    }

    void display() {
        System.out.println(Name + " " + age + " " + ID + " " + Milk + " " + Center);
    }
}

public class MemberData {

    public static void main(String args[]) {
        RegisterList r1 = new RegisterList("Joshua", 21, 111, 1.2f, "BTM");
        RegisterList r2 = new RegisterList("Joshua", 21, 111, 1.2f);

        r1.display();
        r2.display();
    }
}
