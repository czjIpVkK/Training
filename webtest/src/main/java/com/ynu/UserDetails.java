package com.ynu;

import javax.servlet.http.HttpSession;

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

import com.ynu.dto.User;
import com.ynu.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/7.
 */
@Service
@Controller
public class UserDetails {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/UserDetails", method = RequestMethod.POST)
    public String findUser(@RequestParam("userName") String userName, Model model, HttpSession session) {
        System.out.println(userName);

//		ApplicationContext ac = new ApplicationContext("ApplicationContext.cml");
//        UserService userService = (UserService) ac.getBean("UserServiceImpl");
        User user = userService.find(userName);
        model.addAttribute("u_id", user.getu_id());
        model.addAttribute("ut_name", user.getut_name());
        System.out.print(user.getut_name());
        model.addAttribute("u_name", user.getu_name());
        String u_birthday = null;
        if (user.getu_birthday() != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            u_birthday = formatter.format(user.getu_birthday());
        }

        model.addAttribute("u_birthday", u_birthday);
        model.addAttribute("u_Gender", user.getu_gender());
        model.addAttribute("u_description", user.getu_description());
        model.addAttribute("u_credits", user.getu_credits());
        model.addAttribute("u_balance", user.getu_balance());
        model.addAttribute("u_address", user.getu_address());
        model.addAttribute("u_card_no", user.getu_card_no());
        model.addAttribute("u_mobile", user.getu_mobile());
        System.out.print(user.getu_mobile());
        model.addAttribute("u_isuse", user.getu_isuse());
        return "UserDetails";
    }

    @RequestMapping(value = "/UpdateUserDetails", method = RequestMethod.POST)
    public String UpdateUserInfo(@RequestParam("u_id") int u_id,
                                 @RequestParam("ut_name") String ut_name,
                                 @RequestParam("u_birthday") String u_birthday,
                                 @RequestParam("u_gender") int u_Gender,
                                 @RequestParam("u_description") String u_description,
                                 @RequestParam("u_mobile") String u_mobile,
                                 @RequestParam("u_card_no") String u_card_no,
                                 @RequestParam("u_address") String u_address,
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
        userService.updateByPrimaryKeySelective(user);
        model.addAttribute("msg", "成功");
        return "UserDetailsResult";
    }
}
