package utils;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue (double value){
        DecimalFormat decForm = new DecimalFormat("#.00");
        return decForm.format(value);
    }
}
