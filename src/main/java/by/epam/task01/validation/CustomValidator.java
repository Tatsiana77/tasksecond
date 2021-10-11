package by.epam.task01.validation;


import java.util.regex.Pattern;

public class CustomValidator {
    private static final String  STRING_TO_ARRAY_REGEX = "^-?(\\d)+((\\s)+-?(\\d)+)*$";

    private CustomValidator() {
    }

    public static boolean validationToArray(String str) {
        var pattern = Pattern.compile(STRING_TO_ARRAY_REGEX);
        var matcher = pattern.matcher(str);
        return matcher.matches();
    }


}
