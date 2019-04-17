package utils.file.download;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileDownloadAction extends ActionSupport {
    private String filename;
    @Override
    public String execute() throws Exception {
        System.out.println("FileDownloadAction execute..");
        return SUCCESS;
    }

    public String getContentType() {
        return ServletActionContext.getServletContext().getMimeType(filename);
    }

    /**
     * 解决乱码问题
     * @return
     */
    public String getFileName() throws Exception {
        String userAgent = ServletActionContext.getRequest().getHeader("user-agent");
        return DownloadUtils.getDownloadFileName(userAgent, filename);
    }

    public InputStream getInputStream() throws Exception {
        filename = new String(filename.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println("download file name:" + filename);
        FileInputStream fis = new FileInputStream("/upload/" + filename);
        return fis;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
