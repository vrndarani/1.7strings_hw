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
        System.out.print("Данные ФИО сотрудника — ");
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ё")) {
                words[i] = words[i].replace("ё", "е");
            }
            if (i == words.length - 1) {
                System.out.print(words[i]);
            } else {
                System.out.print(words[i] + " ");
            }
        }
    }
}