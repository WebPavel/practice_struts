package action.biz.album;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.biz.album.Album;

public class AlbumAction extends ActionSupport implements ModelDriven<Album> {
    private Album album = new Album();

    public String add() {
        System.out.println(album.getName());
        System.out.println(album.getAuthor());
        return null;
    }

    @Override
    public Album getModel() {
        return album;
    }
}
