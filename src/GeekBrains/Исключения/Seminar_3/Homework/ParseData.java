package GeekBrains.Исключения.Seminar_3.Homework;
/*
 * Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его 
и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них 
требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, 
соответствующее типу проблемы. Можно использовать встроенные типы java 
и создать свои. Исключение должно быть корректно обработано, пользователю выведено 
сообщение с информацией, что именно неверно.
 */

import java.time.LocalDate;


public class ParseData {
    private static String[] dataSet;
    private static String lastName;
    private static String firstName;
    private static String patronymic;
    private static LocalDate birthDate;
    private static int phoneMumber;
    private static char gender;

    public int parseData(String data) {
        int errorCode = 0;
        this.dataSet = data.split(" ");
        if (dataSet.length != 6) {
            errorCode = 1;
        }
        else {
            try {
                lastName = dataSet[0];
            } catch (Exception e) {
                System.out.println("Неверный формат фамилии"); 
            }
            try {
                firstName = dataSet[1];
            } catch (Exception e) {
                System.out.println("Неверный формат имени");
            }
            try {
                patronymic = dataSet[2];
            } catch (Exception e) {
                System.out.println("Неверный формат отчества");
            }
            try {
                birthDate = LocalDate.parse(dataSet[3]);
            } catch (Exception e) {
                System.out.println("Неверный формат дня рождения");
            }
            try {
                phoneMumber = Integer.parseInt(dataSet[4]);
            } catch (Exception e) {
                System.out.println("Неверный формат номера телефона");
            }
            try {
                gender = dataSet[5].charAt(0);
            } catch (Exception e) {
                System.out.println("Неверный формат символа пола");
            }
        }
        return errorCode;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getPatronymic() {
        return patronymic;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }

    public static int getPhoneMumber() {
        return phoneMumber;
    }

    public static char getGender() {
        return gender;
    }

    public static String[] getDataSet() {
        return dataSet;
    }
}
