package com.ynu;
import javax.servlet.http.HttpSession;

import com.ynu.dto.Admin;
import com.ynu.service.BackServce;
import com.ynu.dto.Goodsinformation;
import com.ynu.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/17.
 */
@Service
@Controller
public class BackControl {
    @Autowired
    private BackServce backServce;
    @RequestMapping(value = "/CheckUser", method = RequestMethod.GET)
    public String findUser(@RequestParam("userName") String userName, Model model, HttpSession session) {
        User user = backServce.findUser(userName);
        model.addAttribute("u_id", user.getu_id());
        model.addAttribute("ut_name", user.getut_name());
        model.addAttribute("u_name", user.getu_name());
        String u_birthday = null;
        if (user.getu_birthday() != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            u_birthday = formatter.format(user.getu_birthday());
        }
        System.out.print(u_birthday);
        model.addAttribute("u_birthday", u_birthday);
        model.addAttribute("u_Gender", user.getu_gender());
        model.addAttribute("u_description", user.getu_description());
        model.addAttribute("u_credits", user.getu_credits());
        model.addAttribute("u_balance", user.getu_balance());
        model.addAttribute("u_address", user.getu_address());
        model.addAttribute("u_card_no", user.getu_card_no());
        model.addAttribute("u_mobile", user.getu_mobile());
        model.addAttribute("u_isuse", user.getu_isuse());
        return "ManageUser";
    }
    @RequestMapping(value = "/ManageUserDetails", method = RequestMethod.POST)
    public String ManageUserInfo(@RequestParam("u_id") int u_id,
                                 @RequestParam("ut_name") String ut_name,
                                 @RequestParam("u_birthday") String u_birthday,
                                 @RequestParam("u_gender") int u_Gender,
                                 @RequestParam("u_description") String u_description,
                                 @RequestParam("u_mobile") String u_mobile,
                                 @RequestParam("u_card_no") String u_card_no,
                                 @RequestParam("u_address") String u_address,
                                 @RequestParam("u_isuse") int u_isuse,
                                 @RequestParam("u_balance") Double u_balance,
                                 @RequestParam("u_credits") int u_credits,
                                 Model model) throws ParseException {

        User user = new User();
        user.setu_gender(u_Gender);
        user.setu_mobile(u_mobile);
        user.setu_card_no(u_card_no);
        user.setu_address(u_address);
        user.setu_description(u_description);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sim.parse(u_birthday);
        user.setu_birthday(d);
        user.setu_id(u_id);
        user.setut_name(ut_name);
        user.setut_id(backServce.finTypeId(ut_name));
        user.setu_isuse(u_isuse);
        user.setu_balance(u_balance);
        user.setu_credits(u_credits);
        backServce.setUser(user);
        model.addAttribute("msg", "成功");
        System.out.print("asdasd");
        return "UserDetailsResult";
    }
    @RequestMapping(value = "/Admin", method = RequestMethod.GET)
    public String AdminLogin(){
        return "admin";
    }
    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public String loginCheck(@RequestParam("A_name") String A_name, @RequestParam("A_password") String A_pass, Model model, HttpSession session) {
        System.out.println(A_name + "..." + A_pass);
        if (A_name.equals("") || A_pass.equals("")) {
            model.addAttribute("msg", "用户名或密码不能为空");
            return "admin";
        } else {
            Admin admin = backServce.FindAdmin(A_name);
            if (admin == null) {
                model.addAttribute("msg", "用户名或密码错误");
                return "admin";
            } else {
                if (admin.getA_password().equals(A_pass)) {
                    session.setAttribute("sessionname", A_name);
                    return "success";
                } else {
                    model.addAttribute("msg", "用户名或密码错误");
                    return "admin";
                }
            }
        }
    }

    @RequestMapping(value = "/Index", method = RequestMethod.GET)
    public String JumpIndex(){
        return "index";
    }



}
