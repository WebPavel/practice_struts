package utils;

public class FileUploadUtils {
    /**
     * 根据文件名生成随机文件名
     * @param filename
     * @return
     */
    public static String getUUIDFileName(String filename) {
        String extension = filename.substring(filename.lastIndexOf("."));
        return StringUtils.uuid() + extension;
    }
}
