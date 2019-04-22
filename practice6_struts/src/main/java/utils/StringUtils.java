package utils;

import java.util.UUID;

public class StringUtils {
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    public static boolean isBlank(String plainText) {
        if (plainText == null || plainText.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
