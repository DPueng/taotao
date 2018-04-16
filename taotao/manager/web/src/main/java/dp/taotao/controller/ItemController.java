package dp.taotao.controller;

import dp.taotao.pojo.TbItem;
import dp.taotao.service.ItemService;
import dp.taotao.utilsBeans.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    @ResponseBody
    @RequestMapping("/item/{itemId}")
    public TbItem getItemById(@PathVariable Long itemId){
        return  itemService.getItemById(itemId);
    }
    @RequestMapping(value = "/item/save", method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult createItem(TbItem item, String desc){
        return itemService.createItem(item, desc);
    }
}
