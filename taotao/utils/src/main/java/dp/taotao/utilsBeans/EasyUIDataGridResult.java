package dp.taotao.utilsBeans;

import java.util.List;

public class EasyUIDataGridResult {

    private long total;
    private List<?> rows;

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public long getTotal() {

        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
