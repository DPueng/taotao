package dp.taotao.service;

import dp.taotao.mappers.TbItemCatMapper;
import dp.taotao.pojo.TbItemCat;
import dp.taotao.pojo.TbItemCatExample;
import dp.taotao.utilsBeans.EasyUITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImp implements ItemCatService {



    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(long itemId) {

        List<TbItemCat> list = tbItemCatMapper.selectByParentId(itemId);
        ArrayList<EasyUITreeNode> treeNodeArrayList = new ArrayList<>();
        for(TbItemCat tbItemCat:list){
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            treeNodeArrayList.add(node);
        }
        return treeNodeArrayList;
    }
}
