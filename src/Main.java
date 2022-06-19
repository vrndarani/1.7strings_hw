import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Empoyee's name for report filing is " + fullName);


        String fullNameUp = fullName.toUpperCase();
        System.out.println("NAME: " + fullNameUp);


        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace("ё", "е");
        System.out.println("Employee's name data: " + fullNameReplace);
    }
}