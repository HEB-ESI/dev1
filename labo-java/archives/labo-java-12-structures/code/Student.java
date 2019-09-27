package esi.dev1.td12;

public class Student {
    int id;
    String firstName;
    String lastName;

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101010;
        s.firstName = "Alan" ;
        s.lastName = "Turing";

        System.out.println(s.id + " : " + s.firstName + " " + s.lastName);
    }
}
