package dp.taotao.service;

import dp.taotao.pojo.TbItem;
import dp.taotao.utilsBeans.EasyUIDataGridResult;
import dp.taotao.utilsBeans.TaotaoResult;

public interface ItemService {

    public TbItem getItemById(Long itemId);

    public EasyUIDataGridResult getItemList(int page, int rows);

    public TaotaoResult createItem(TbItem item, String desc);


}
