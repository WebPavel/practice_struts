package ognl;

import entity.biz.album.Album;
import entity.biz.category.Category;
import entity.usr.singer.Singer;
import org.junit.Test;

public class OgnlTest {
    @Test
    public void testOgnlValue() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        // 通过ognl调用实例对象方法
        Object ret = Ognl.getValue("'abc'.length()", ognlContext, ognlContext.getRoot());
        System.out.println(ret);
        // 通过ognl调用类的静态方法和属性
        ret = Ognl.getValue("@java.lang.Math@max(10, 20)", ognlContext.getRoot());
        System.out.println(ret);
        ret = Ognl.getValue("@java.lang.Math@PI", ognlContext.getRoot());
        System.out.println(ret);
    }

    @Test
    public void testOgnlContext() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        Singer singer = new Singer();
        singer.setName("张靓颖");
        Album album = new Album();
        album.setName("populate 2019");
        album.setSinger(singer);
        ognlContext.setRoot(album);
        Category category = new Category();
        category.setName("acg");
        ognlContext.put("category", category);
        ognlContext.put("locale", "China");
        // 获取根中数据
        System.out.println(Ognl.getValue("name", ognlContext, ognlContext.getRoot()));
        System.out.println(Ognl.getValue("singer.name", ognlContext, ognlContext.getRoot()));
        // 获取非根中数据
        System.out.println(Ognl.getValue("#category.name", ognlContext, ognlContext.getRoot()));
        System.out.println(Ognl.getValue("#locale", ognlContext, ognlContext.getRoot()));
    }
}
