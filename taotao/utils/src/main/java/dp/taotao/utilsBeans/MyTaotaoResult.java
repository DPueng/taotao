package dp.taotao.utilsBeans;

public class MyTaotaoResult {
    private Integer status;
    private String msg;
    private Object data;

    public MyTaotaoResult() {
    }

    public MyTaotaoResult(Integer status, String msg, Object data) {

        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    public MyTaotaoResult(Integer status, Object data) {

        this.status = status;
        this.data = data;
    }
    public static MyTaotaoResult ok(){
        System.out.println(111);
        return new MyTaotaoResult(200, null);
    }
}
