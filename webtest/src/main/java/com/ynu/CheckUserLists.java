package com.ynu;

import javax.servlet.http.HttpSession;

import com.ynu.dto.User;
import com.ynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import com.ynu.dto.Page;

/**
 * Created by Vivianus on 2016/9/12.
 */
@Service
@Controller
public class CheckUserLists {
    @Autowired
    private UserService userService;
    User user = new User();
    Page page = new Page();
    List<User> UserList;

    @RequestMapping(value = "showuser")
    public String selectAllCustomer(Model model) {

        this.page = new Page();
        List<User> users = userService.select();
        UserList = users;
        System.out.print(users);
        getPage(users, model);
        getSubList(users, model);
        return "userlist";
    }

    @RequestMapping(value = "turnUsersPage")
    public String turnPage(@ModelAttribute("page") @Valid Page page, Model model) {
        System.out.println("------------------------------->turnPage");
        this.page = page;
        getPage(UserList, model);
        getSubList(UserList, model);
        return "userlist";
    }

    public void getSubList(List<User> users, Model model) {
        int rowsCount = users.size();
        int start = (page.getCurrentPage() - 1) * page.getRowsPerPage();
        int end = page.getCurrentPage() * page.getRowsPerPage();
        int startIndex = start > rowsCount ? 1 : start;
        int endIndex = end > rowsCount ? rowsCount : end;
        List<User> usersList = UserList.subList(startIndex, endIndex);
        model.addAttribute("usersList", usersList);
    }

    public void    getPage(List<User> users, Model model) {
        int rowsCount = users.size();
        int totalPage = rowsCount / page.getRowsPerPage() + (rowsCount % page.getRowsPerPage() > 0 ? 1 : 0);
        page.setRowsCount(rowsCount);
        page.setTotalPage(totalPage);
        model.addAttribute("userpage", page);
    }
}
