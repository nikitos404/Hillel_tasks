package utils;

import java.util.Scanner;

public class TryCatchValidator {

    static void ValidateName01 (Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNext()){
            throw new IndividualExceptions("Уупс...Что-то пошло не так");
        }
    }
    static void ValidateName02 (Scanner scanner) throws IndividualExceptions{
        String str = scanner.next().trim();
        if (str.isEmpty()){
            throw new IndividualExceptions("Пусто...Заполните поле :)");
        }
    }

    static void ValidateQuota (Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNextInt()){
            throw new IndividualExceptions("Не число :(");

        }
    }

    static  void ValidatePrice (Scanner scanner) throws IndividualExceptions{
        String str = scanner.nextLine().trim();
        if (!scanner.hasNextDouble()){
            throw new IndividualExceptions("Попробуйте еще раз...");
        }
    }



}