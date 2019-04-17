package utils.file.upload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;

public class FileUploadAction extends ActionSupport {
    private List<File> upload;
    private List<String> uploadContentType;
    private List<String> uploadFileName;

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        for (int i = 0; i < upload.size(); i++) {
            System.out.println("上传文件类型：" + uploadContentType.get(i));
            System.out.println("上传文件名称：" + uploadFileName.get(i));
            File destFile = new File("/upload", uploadFileName.get(i));
            System.out.println(destFile.getAbsolutePath());
            System.out.println(destFile.getCanonicalPath());
            FileUtils.copyFile(upload.get(i), destFile);
        }
        return null;
    }

    public List<File> getUpload() {
        return upload;
    }

    public void setUpload(List<File> upload) {
        this.upload = upload;
    }

    public List<String> getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(List<String> uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public List<String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(List<String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
}
