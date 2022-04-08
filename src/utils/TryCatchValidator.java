package utils;

import java.util.Scanner;

public class TryCatchValidator {

    public static String ValidateName01(Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNext()){
            throw new IndividualExceptions("Уупс...Что-то пошло не так");
        }
        return str;
    }
    public static String ValidateName02(Scanner scanner) throws IndividualExceptions{
        String str = scanner.next().trim();
        if (str.isEmpty()){
            throw new IndividualExceptions("Пусто...Заполните поле :)");
        }
        return str;
    }

    public static String ValidateQuota(Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNextInt()){
            throw new IndividualExceptions("Не число :(");

        }
        return str;
    }

    public static String ValidatePrice(Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNextDouble()){
            throw new IndividualExceptions("Попробуйте еще раз...");
        }
        return str ;
    }



}