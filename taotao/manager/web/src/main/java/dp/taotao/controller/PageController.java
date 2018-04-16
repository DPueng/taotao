package dp.taotao.controller;

import dp.taotao.service.ItemService;
import dp.taotao.utilsBeans.EasyUIDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {


    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){
        return itemService.getItemList(page, rows);
    }
}
