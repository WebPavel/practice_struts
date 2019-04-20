package action.usr.singer;

import com.opensymphony.xwork2.ActionSupport;
import entity.pub.company.Company;
import entity.usr.singer.Singer;

import java.util.ArrayList;
import java.util.List;

public class SingerAction extends ActionSupport {
    private List<Singer> singers;
    private Company company;

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String list() throws Exception {
        System.out.println("SingerAction list..");
        singers = new ArrayList<>();
        Singer singerItem = new Singer();
        singerItem.setName("孙燕姿");
        singerItem.setNickname("燕姿");
        singerItem.setProfile("女性歌手2000代表");
        singers.add(singerItem);
        Singer singerItem1 = new Singer();
        singerItem1.setName("罗大佑");
        singerItem1.setNickname("大佑");
        singerItem1.setProfile("男性歌手2000代表");
        singers.add(singerItem1);
        Singer singerItem2 = new Singer();
        singerItem2.setName("张靓颖");
        singerItem2.setNickname("靓颖");
        singerItem2.setProfile("超级女性代表");
        singers.add(singerItem2);
        company = new Company();
        company.setName("zv2");
        company.setWebsite("www.zv2.com.cn");
        company.setDescription("a video machine");
        company.setAddress("gz,黄埔区科学大道中");
        company.setTelephone("37885228");
        company.setScale(5);
        return SUCCESS;
    }
}
