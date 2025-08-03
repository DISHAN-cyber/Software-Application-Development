package lk.jiat.smarttrade.validation;

import javax.swing.JOptionPane;

public class Validator {

    public static boolean isEmailValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Email input can't be empty",
                    "Email Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.EMAIL.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Enter valid Email Address",
                    "Email Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isMobileValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Mobile field can't be empty",
                    "Mobile Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.MOBILE.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Enter a valid Mobile Number",
                    "Mobile Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isPasswordValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Password field can't be empty",
                    "Password Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!value.matches(Validation.PASSWORD.validate())) {
            JOptionPane.showMessageDialog(null,
                    "Password must include the following characters. \n"
                    + "At least one lowercase, \n"
                    + "at least one uppercase, \n"
                    + "a special character, \n"
                    + "and at least one digit. \n"
                    + "The password must be greater than 4 and less than 8 characters",
                    "Password Validation",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isInputFieldValid(String value) {
        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Input field can't be empty",
                    "Validation Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean isSelectedItemValid(int value) {
        if (value == 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a valid option",
                    "Validation Message",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
