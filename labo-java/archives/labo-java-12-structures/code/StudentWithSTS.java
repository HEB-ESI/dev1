package esi.dev1.td12;

public class StudentWithSTS {
    int id;
    String firstName;
    String lastName;

    public StudentWithSTS(int anId, String aFirstName, String aLastName) {
        id = anId;
        firstName = aFirstName;
        lastName = aLastName;
    }

    public static String toString(StudentWithSTS s) {
        return s.id + " : " + s.firstName + " " + s.lastName;
    }

    public static void main(String[] args) {
        StudentWithSTS s = new StudentWithSTS( 101010, "Alan", "Turing");

        System.out.println(toString(s));
    }
}
