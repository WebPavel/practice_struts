package action.biz.album;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.biz.album.Album;

public class AlbumAction extends ActionSupport implements ModelDriven<Album> {

    private Album album = new Album();

    public String add() {
        System.out.println(this.getText("album.album"));
        System.out.println(this.getText("album.name.message", new String[]{"ZJL Album"}));
        return null;
    }

    public String update() {
        System.out.println("AlbumAction update..");
        return null;
    }

    public String delete() {
        System.out.println("AlbumAction delete..");
        return null;
    }

    public String search() {
        System.out.println("AlbumAction search..");
        return null;
    }

    @Override
    public Album getModel() {
        return album;
    }
}
