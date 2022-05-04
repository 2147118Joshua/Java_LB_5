// 1.Refer current class variable, method and constructor using 'this'
// 2.Pass a argument to a method and constructor using 'this'
// 3.Reusing constructor and constructor chaining using 'this'

package Java_Lab_5;

import javax.print.event.PrintEvent;

class RegisterList {
    String Name;
    int age;
    int ID;
    float Milk;
    String Center;

    RegisterList() {
        // System.out.println("\nCurrent Class Constructor");
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
        this.Center = Center; // reusing the constructor

    }

    void display() {
        System.out.println("\n" + "NAME : " + Name + "\n" + "AGE : " + age + " \n" + "ID : " + ID + "\n"
                + "Ltr of Milk : " + Milk + "\n" + "CENTER : " + Center + "\n");
    }
}

public class MemberData {

    public static void main(String args[]) {
        RegisterList r1 = new RegisterList("Joshua", 21, 111, 6.2f, "BTM");
        RegisterList r2 = new RegisterList("Rahul", 24, 112, 2.0f);
        RegisterList r3 = new RegisterList("Raju", 34, 113, 4.3f, "Shatinagar");
        System.out.println("\n\nList of Members of Dairy");

        r1.display();
        r2.display();
        r3.display();
    }
}
