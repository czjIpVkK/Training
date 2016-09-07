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
/**
 * Created by Vivianus on 2016/9/7.
 */
import com.ynu.dto.User;
import com.ynu.service.UserService;

@Service
@Controller
public class UserRegister {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public ModelAndView del() {
        return new ModelAndView("register", "command", new User());
    }

    @RequestMapping(value = "/userreg", method = RequestMethod.POST)
    public String regester(@RequestParam("u_name") String u_name, @RequestParam("pass") String u_PassWord,@RequestParam("pass1") String pass1, Model model, HttpSession session) {
        System.out.println(u_name + "..." + u_PassWord + "..." + pass1);
        if (u_name.equals("") || u_PassWord.equals("") || pass1.equals("")) {
            model.addAttribute("msg", "用户名或密码不能为空");
            return "register";
        } else {
            User user = userService.find(u_name);
            if (user != null) {
                model.addAttribute("msg", "用户名已经被占用");
                return "register";
            } else {
                if (!u_PassWord.equals(pass1)) {
                    model.addAttribute("msg", "两次输入的密码不一致！");
                    return "register";
                } else {
                    User user1 = new User();
                    user1.setuName(u_name);
                    user1.setuPassword(u_PassWord);
                    userService.add(user1);
                    return "login";
                }
            }
        }
    }
}
