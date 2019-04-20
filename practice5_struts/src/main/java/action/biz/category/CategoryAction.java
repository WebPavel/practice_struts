package action.biz.category;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import entity.biz.category.Category;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

public class CategoryAction extends ActionSupport {
    public String add() {
//        ValueStack valueStack = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        System.out.println(valueStack);
        valueStack.push("acg");
        valueStack.set("categoryName", "acg");
        List<Category> categories = new ArrayList<>();
        Category categoryItem = new Category();
        categoryItem.setName("acg");
        categoryItem.setSortedNumber(1);
        categoryItem.setDescription("漫画、动画、游戏");
        categories.add(categoryItem);
        Category categoryItem1 = new Category();
        categoryItem1.setName("light music");
        categoryItem1.setSortedNumber(2);
        categoryItem1.setDescription("轻音乐");
        categories.add(categoryItem1);
        Category categoryItem2 = new Category();
        categoryItem2.setName("populate");
        categoryItem2.setSortedNumber(0);
        categoryItem2.setDescription("流行音乐");
        categories.add(categoryItem2);
//        valueStack.push(categories);
        valueStack.set("categories", categories);
        return SUCCESS;
    }
}
