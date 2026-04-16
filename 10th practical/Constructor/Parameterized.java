class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Parameterized {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Titan");
        s1.display();
    }
}