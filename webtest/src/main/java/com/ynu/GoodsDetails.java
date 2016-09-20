package com.ynu;

import javax.servlet.http.HttpSession;

import com.ynu.dto.Goodsinformation;
import com.ynu.dto.Goodstype;
import com.ynu.service.BackServce;
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
import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
@Service
@Controller
public class GoodsDetails {
    @Autowired
    private GoodinformationService goodsService;
    @Autowired
    private BackServce backServce;
    @RequestMapping(value = "/GoodsDetails", method = RequestMethod.GET)
    public String findGoods(@RequestParam("g_id")String g_id, Model model,HttpSession session){
        System.out.println(g_id);
        Goodsinformation goods = goodsService.find(g_id);
        model.addAttribute("goods",goods);
        return "GoodsDetails";
    }
    @RequestMapping(value = "/EditGoodsDetails", method = RequestMethod.GET)
    public String editGoods(@RequestParam("g_id")String g_id, Model model,HttpSession session){
        System.out.println(g_id);
        Goodsinformation goods = goodsService.find(g_id);
        List<Goodstype> goodstypes=backServce.selectAllType();
        model.addAttribute("goods",goods);
        model.addAttribute("goodstypes",goodstypes);
        return "EditGoodsDetails";
    }
    @RequestMapping(value = "/UpdateGoodsDetails", method = RequestMethod.POST)
    public String UpdatetGoods(@RequestParam("g_id")Integer g_id,
                               @RequestParam("gt_id")Integer gt_id,
                               @RequestParam("gs_id")Integer gs_id,
                               @RequestParam("g_name")String g_name,
                               @RequestParam("g_number")Integer g_number,
                               @RequestParam("g_sellnumber")Integer g_sellnumber,
                               @RequestParam("g_now_number")Integer g_now_number ,
                               @RequestParam("g_price")Float g_price,
                               @RequestParam("g_description")String g_description,
                               @RequestParam("g_modfier")Integer g_modfier,
                               @RequestParam("g_modify_time")String g_modify_time,
                               @RequestParam("g_uper")Integer g_uper,
                               @RequestParam("g_uptime")String g_uptime,
                               @RequestParam("g_state")String g_state,
                               @RequestParam("g_pic")String g_pic,
                            Model model,HttpSession session) throws ParseException {
        Goodsinformation goods=new Goodsinformation();
        goods.setgt_id(gt_id);
        goods.setg_description(g_description);
        goods.setg_id(g_id);
        goods.setg_modfier(g_modfier);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sim.parse(g_modify_time);
        goods.setg_modify_time(d);
        goods.setg_name(g_name);
        goods.setg_now_number(g_now_number);
        goods.setg_number(g_number);
        goods.setgs_id(gs_id);
        goods.setg_pic(g_pic);
        goods.setg_price(g_price);
        goods.setg_sellnumber(g_sellnumber);
        goods.setg_state(g_state);
        goods.setg_uper(g_uper)  ;
        d = sim.parse(g_uptime);
        goods.setg_uptime(d);
        goodsService.UpdateGoods(goods);
        return "index";
    }

}
