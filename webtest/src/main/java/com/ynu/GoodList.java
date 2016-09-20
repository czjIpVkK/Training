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
public class GoodList {
    @Autowired
    private GoodinformationService goodinformationService;
    Goodsinformation Goodsinformation = new Goodsinformation();
    Page page = new Page();
    List<Goodsinformation> GoodsinformationList;

    @RequestMapping(value = "show")
    public String selectAllCustomer(Model model) {

        this.page = new Page();
        List<Goodsinformation> goods = goodinformationService.select();
        GoodsinformationList = goods;
        getPage(goods, model);
        getSubList(goods, model);
        return "goodlist";
    }
    @RequestMapping(value = "/showgoods", method = RequestMethod.GET)
    public String selectAllCustomer1(Model model) {

        this.page = new Page();
        List<Goodsinformation> goods = goodinformationService.select();
        GoodsinformationList = goods;
        getPage(goods, model);
        getSubList(goods, model);
        return "GoodsListsForAdmin";
    }
    @RequestMapping(value = "turnPage")
    public String turnPage(@ModelAttribute("page") @Valid Page page, Model model) {
        System.out.println("------------------------------->turnPage");
        this.page = page;
        getPage(GoodsinformationList, model);
        getSubList(GoodsinformationList, model);
        return "goodlist";
    }

    public void getSubList(List<Goodsinformation> goods, Model model) {
        int rowsCount = goods.size();
        int start = (page.getCurrentPage() - 1) * page.getRowsPerPage();
        int end = page.getCurrentPage() * page.getRowsPerPage();
        int startIndex = start > rowsCount ? 1 : start;
        int endIndex = end > rowsCount ? rowsCount : end;
        List<Goodsinformation> goodsList = GoodsinformationList.subList(startIndex, endIndex);
        model.addAttribute("goodsList", goodsList);
    }

    public void getPage(List<Goodsinformation> goods, Model model) {
        int rowsCount = goods.size();
        int totalPage = rowsCount / page.getRowsPerPage() + (rowsCount % page.getRowsPerPage() > 0 ? 1 : 0);
        page.setRowsCount(rowsCount);
        page.setTotalPage(totalPage);
        model.addAttribute("page", page);
    }
    @RequestMapping(value = "/deleteGoods", method = RequestMethod.GET)
    public void deleteGoods(@RequestParam("g_id") int g_id, Model model){
        goodinformationService.deleteGoods(g_id);
        selectAllCustomer1(model);
    }

}
