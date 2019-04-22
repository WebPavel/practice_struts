package utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FileDownloadUtils {
    public static String getDownloadFileName(String userAgent, String filename) throws UnsupportedEncodingException {
        if (userAgent.contains("MSIE")) {
            filename = URLEncoder.encode(filename, "UTF-8");
        } else {
            filename = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        }
        return filename;
    }
}
