package esi.dev1.td12;

public class StudentWithTS {
    int id;
    String firstName;
    String lastName;

    public StudentWithTS(int anId, String aFirstName, String aLastName) {
        id = anId;
        firstName = aFirstName;
        lastName = aLastName;
    }

    public String toString() {
        return this.id + " : " + this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        StudentCleared s = new StudentCleared( 101010, "Adams", "Douglas");

        System.out.println(s.toString());
    }
}
