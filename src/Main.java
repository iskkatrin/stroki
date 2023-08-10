public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задача 2");

        String firstName1 = "Ivanov";
        String middleName1 = "Ivan";
        String lastName1 = "Ivanovich";

        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1 ;

        System.out.println(fullName1.toUpperCase());

        System.out.println("Задача 3");

        String fullName3 = "Иванов Семён Семёнович" ;

        String replacedFullName3 = fullName3.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника - " + replacedFullName3);


    }
}