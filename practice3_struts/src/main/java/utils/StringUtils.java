package utils;

public class StringUtils {
    public static boolean empty(String plainText) {
        if (plainText == null || plainText.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
