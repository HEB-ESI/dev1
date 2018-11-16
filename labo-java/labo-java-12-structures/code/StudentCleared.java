package esi.dev1.td12;

public class StudentCleared {
    int id;
    String firstName;
    String lastName;

    public StudentCleared(int anId, String aFirstName, String aLastName) {
        id = anId;
        firstName = aFirstName;
        lastName = aLastName;
    }

    public String toString() {
        return id + " : " + firstName + " " + lastName;
    }

    public static void main(String[] args) {
        StudentCleared s = new StudentCleared( 101010, "Adams", "Douglas");

        System.out.println(s);
    }
}
