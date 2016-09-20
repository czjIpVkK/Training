package com.ynu;

import javax.servlet.http.HttpSession;

import com.ynu.dto.Goodstype;
import com.ynu.service.BackServce;
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
import javax.validation.constraints.Null;
import java.util.List;
import com.ynu.dto.Page;


@Service
@Controller
public class GoodsTypeLists {
    @Autowired
    private BackServce backServce;
    Goodstype Goodstype = new Goodstype();
    Page page = new Page();
    List<Goodstype> GoodstypeList;

    @RequestMapping(value = "showGoodsType",method = RequestMethod.GET)
    public String selectAllCustomer(@RequestParam("gt_id") int gt_id,Model model) {
        this.page = new Page();
        List<Goodstype> goodsType = backServce.selectChildren(gt_id);
        GoodstypeList = goodsType;
        getPage(goodsType, model);
        getSubList(goodsType, model);
        model.addAttribute("gt_father",backServce.findFather(gt_id));
        return "goodTypeList";
    }

    @RequestMapping(value = "turnTypePage")
    public String turnPage(@ModelAttribute("page") @Valid Page page, Model model) {
        System.out.println("------------------------------->turnPage");
        this.page = page;
        getPage(GoodstypeList, model);
        getSubList(GoodstypeList, model);
        return "goodTypeList";
    }

    public void getSubList(List<Goodstype> goodsType, Model model) {
        int rowsCount = goodsType.size();
        int start = (page.getCurrentPage() - 1) * page.getRowsPerPage();
        int end = page.getCurrentPage() * page.getRowsPerPage();
        int startIndex = start > rowsCount ? 1 : start;
        int endIndex = end > rowsCount ? rowsCount : end;
        List<Goodstype> goodsTypeList = GoodstypeList.subList(startIndex, endIndex);
        model.addAttribute("goodsTypeList", goodsTypeList);
    }

    public void getPage(List<Goodstype> goodsType, Model model) {
        int rowsCount = goodsType.size();
        int totalPage = rowsCount / page.getRowsPerPage() + (rowsCount % page.getRowsPerPage() > 0 ? 1 : 0);
        page.setRowsCount(rowsCount);
        page.setTotalPage(totalPage);
        model.addAttribute("page", page);
    }
    @RequestMapping(value = "/addType" ,method = RequestMethod.POST)
    public String addType(@RequestParam("gt_parent_id")  int gt_parent_id,
                                    @RequestParam("gt_name")  String gt_name,
                                    @RequestParam("gt_desc")  String gt_desc,
                                    @RequestParam("gt_isvisible")  int gt_isvisible,
                                    @RequestParam("gt_parent_name")  String gt_parent_name,
                                    Model model){
        Goodstype goodstype=new Goodstype();
        goodstype.setgt_desc(gt_desc);
       // goodstype.setgt_id(gt_id);
        goodstype.setgt_isvisible(gt_isvisible);
        goodstype.setgt_name(gt_name);
        goodstype.setgt_parent_id(gt_parent_id);
        goodstype.setgt_parent_name(gt_parent_name);
        System.out.print(gt_parent_id+"+"+gt_parent_name);
        model.addAttribute("gt_id",gt_parent_id);
        backServce.addType(goodstype);
        return "TypeSucess";
    }
    @RequestMapping(value = "addTypePage",method = RequestMethod.POST)
    public String addType(@RequestParam("gt_parent_name")  String gt_parent_name,
                          @RequestParam("gt_parent_id") Integer gt_parent_id, Model model){
        if(gt_parent_name==null||gt_parent_name=="")gt_parent_name="全部";
        if(gt_parent_id==null)gt_parent_id=0;
        System.out.print(gt_parent_id+"+"+gt_parent_name);
        model.addAttribute("gt_parent_name", gt_parent_name);
        model.addAttribute("gt_parent_id", gt_parent_id);
        return "addTypePage";
    }
    @RequestMapping(value = "deleteType",method = RequestMethod.GET)
    public String deleteType(@RequestParam("gt_id") int gt_id,
                             @RequestParam("parent_id") int gt_parent_id,Model model){
        backServce.deleteType(gt_id);
        model.addAttribute("gt_id",gt_parent_id);
        return "TypeSucess";

    }

}
