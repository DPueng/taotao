package dp.taotao.utilsBeans;

import java.sql.Timestamp;

public class ItemParamResult {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getItemCatName() {
        return itemCatName;
    }

    public void setItemCatName(String itemCatName) {
        this.itemCatName = itemCatName;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    //    <id column="id" jdbcType="BIGINT" property="id" />
    private long id;
//    <result column="item_cat_id" jdbcType="BIGINT" property="itemCatId" />
    private long itemCatId;
//    <result column="itemCatName" jdbcType="VARCHAR" property="itemCatName"/>
    private String itemCatName;
//    <result column="created" jdbcType="TIMESTAMP" property="created" />
    private Timestamp  created;
//    <result column="updated" jdbcType="TIMESTAMP" property="updated" />
    private Timestamp updated;
}
