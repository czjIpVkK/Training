package com.ynu;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ynu.dto.User;
import com.ynu.service.UserService;
/**
 * Created by Vivianus on 2016/9/6.
 */
@Service
@Controller
public class UserLogin {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/logins", method = RequestMethod.POST)
    public String loginCheck(@RequestParam("u_name") String u_name, @RequestParam("pass") String u_PassWord, Model model, HttpSession session) {
        System.out.println(u_name + "..." + u_PassWord);
        if (u_name.equals("") || u_PassWord.equals("")) {
            model.addAttribute("msg", "用户名或密码不能为空");
            return "login";
        } else {
            User user = userService.find(u_name);
            System.out.println("customer");
            if (user == null) {
                System.out.println("yonghumingcuowu");
                model.addAttribute("msg", "用户名或密码错误");
                return "login";
            } else {
                if (user.getuPassword().equals(u_PassWord)) {
//					model.addAttribute("name",name);
                    session.setAttribute("sessionname", u_name);
                    return "success";
                } else {
                    model.addAttribute("msg", "用户名或密码错误");
                    return "login";
                }
            }

        }
    }
}
