package dp.taotao.service;

import dp.taotao.FastDFS.FastDFS;
import dp.taotao.utilsBeans.PicResult;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PictureServiceImp implements PictureService {

    @Override
    public PicResult uploadPic(MultipartFile picFile) {
        PicResult result = new PicResult();

        if (picFile.isEmpty()) {
            result.setError(1);
            result.setMessage("pic is null");
            return result;
        }
        FastDFS fastDFS = null;
        try {
            fastDFS = new FastDFS("/home/dpeng/IdeaProjects/taotao-master-77ebb73d8b10b230f05e22257aa5d00b4ba323c5/taotao/manager/web/src/main/resources/properties/fastdfs-client.properties");
            String picPath = picFile.getOriginalFilename();
            String fileType = picPath.substring(picPath.lastIndexOf(".") + 1);
            String string = fastDFS.uploadFile(picFile.getBytes(), fileType);
            result.setError(0);
            result.setUrl(string);
        } catch (IOException | MyException e) {
            e.printStackTrace();
            result.setError(1);
            result.setMessage("catch!catch!catch!");
        }
        return result;
    }
}
