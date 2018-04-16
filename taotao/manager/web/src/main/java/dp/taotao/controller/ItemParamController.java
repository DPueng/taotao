package dp.taotao.controller;

import dp.taotao.service.ItemParamService;
import dp.taotao.utilsBeans.EasyUIDataGridResult;
import dp.taotao.utilsBeans.ItemParamResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;
    @RequestMapping("/item/param/list")
    public EasyUIDataGridResult showItemParam(Integer page, Integer rows){
        return itemParamService.showItemParam(page, rows);
    }


}
