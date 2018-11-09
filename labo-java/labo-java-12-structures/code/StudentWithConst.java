package esi.dev1.td12;

public class StudentWithConst {
    int id;
    String firstName;
    String lastName;

    public StudentWithConst(int anId, String aFirstName, String aLastName) {
        id = anId;
        firstName = aFirstName;
        lastName = aLastName;
    }

    public static void main(String[] args) {
        StudentWithConst s = new StudentWithConst( 101010, "Alan", "Turing");

        System.out.println(s.id + " : " + s.firstName + " " + s.lastName);
    }
}
