package com.ynu;

import javax.servlet.http.HttpSession;

import com.ynu.dto.Goodsinformation;
import com.ynu.service.GoodinformationService;
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
 * Created by Administrator on 2016/9/9.
 */
@Service
@Controller
public class GoodsDetails {
    @Autowired
    private GoodinformationService goodsService;
    @RequestMapping(value = "/GoodsDetails", method = RequestMethod.GET)
    public String findGoods(@RequestParam("g_id")String g_id, Model model,HttpSession session){
        System.out.println(g_id);
        Goodsinformation goods = goodsService.find(g_id);
        model.addAttribute("goods",goods);
        return "GoodsDetails";
    }


}
