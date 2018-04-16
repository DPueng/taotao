package dp.taotao.utilsBeans;

public class PicResult {
    private int error;
    private String url;

    public PicResult() {
    }

    public int getError() {

        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PicResult(int error, String url, String message) {

        this.error = error;
        this.url = url;
        this.message = message;
    }

    private String message;
}
