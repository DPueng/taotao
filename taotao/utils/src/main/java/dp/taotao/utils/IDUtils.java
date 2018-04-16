package dp.taotao.utils;

import java.util.Random;

/**
 * 用来生成id到工具类
 */
public class IDUtils {

    /**
     * 生成图片id
     *
     * @return
     */
    public static String genImageName() {
        //取长整型，当前微秒
        long millis = System.currentTimeMillis();

//        加上三个随机数
        Random random = new Random();
        int nextInt = random.nextInt(999);
        return millis + String.format("%03d", nextInt);
    }

    /**
     * 生成商品id
     */
    public static long genItemId() {
        //取长整型，当前微秒
        long millis = System.currentTimeMillis();
//        加上2个随机数
        Random random = new Random();
        int nextInt = random.nextInt(99);
        long id = new Long(millis + String.format("%03d", nextInt));
        return id;
    }
}
