package model;

public class MobileValidator {

    public static boolean isMobileValidator(String input) {
        if (input.matches("^(0{1}) (7{1}) ([0|1|2|3|4|5|6|7|8] {1}) ([0-9] {7})")){
        return true;
        }
        return false;
    }
}
