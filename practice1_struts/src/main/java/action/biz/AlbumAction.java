package action.biz;

import com.opensymphony.xwork2.ActionSupport;

public class AlbumAction extends ActionSupport {
    public String add() {
        System.out.println("albumAction add do.");
        return NONE;
    }
    public String update() {
        System.out.println("albumAction update do.");
        return NONE;
    }
    public String delete() {
        System.out.println("albumAction delete do.");
        return NONE;
    }
    public String search() {
        System.out.println("albumAction search do.");
        return NONE;
    }
}
