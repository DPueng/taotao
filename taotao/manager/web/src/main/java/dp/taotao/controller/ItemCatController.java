package dp.taotao.controller;

import dp.taotao.service.ItemCatService;
import dp.taotao.utilsBeans.EasyUITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0") Long itemId){
        return itemCatService.getItemCatList(itemId);

    }

    @RequestMapping("/item/param/cid/{cid}")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatCList(@PathVariable Long cid){
        return itemCatService.getItemCatList(cid);
    }
}

