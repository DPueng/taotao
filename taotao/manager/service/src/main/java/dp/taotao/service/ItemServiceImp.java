package dp.taotao.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dp.taotao.mappers.TbItemDescMapper;
import dp.taotao.mappers.TbItemMapper;
import dp.taotao.pojo.TbItem;
import dp.taotao.pojo.TbItemDesc;
import dp.taotao.pojo.TbItemExample;
import dp.taotao.utils.IDUtils;
import dp.taotao.utilsBeans.EasyUIDataGridResult;
import dp.taotao.utilsBeans.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;
    @Autowired
    private TbItemDescMapper tbItemDescMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }


    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        PageHelper.startPage(page, rows);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(list);
        return result;
    }

    @Override
    public TaotaoResult createItem(TbItem item, String desc) {
        long itemId = IDUtils.genItemId();

//        tbItem插入
        item.setId(itemId);
        item.setStatus((byte) 1);
        Date date = new Date();
        item.setCreated(date);
        item.setUpdated(date);
        tbItemMapper.insert(item);
//插入商品描述
        TbItemDesc itemDesc = new TbItemDesc(itemId, date, date, desc);
        tbItemDescMapper.insert(itemDesc);
        return TaotaoResult.ok();
    }
}
