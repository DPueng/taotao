package dp.taotao.service;


import dp.taotao.utilsBeans.EasyUIDataGridResult;

public interface ItemParamService {
    /**
     * @param page get page num
     * @param rows determine how many rows in a page
     * @return
     */
    public EasyUIDataGridResult showItemParam(Integer page, Integer rows);

}
