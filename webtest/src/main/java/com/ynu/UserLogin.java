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
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/logins", method = RequestMethod.POST)
    public String loginCheck(@RequestParam("u_name") String u_name, @RequestParam("pass") String u_pass, Model model, HttpSession session) {
        System.out.println(u_name + "..." + u_pass);
        if (u_name.equals("") || u_pass.equals("")) {
            model.addAttribute("msg", "用户名或密码不能为空");
            return "login";
        } else {
            User user = userService.find(u_name);
            if (user == null) {
                model.addAttribute("msg", "用户名或密码错误");
                return "login";
            } else {
                if (user.getu_pass().equals(u_pass)) {
                    session.setAttribute("sessionname", u_name);
                    session.setAttribute("type", "user");
                    return "success";
                } else {
                    model.addAttribute("msg", "用户名或密码错误");
                    return "login";
                }
            }

        }
    }
}
