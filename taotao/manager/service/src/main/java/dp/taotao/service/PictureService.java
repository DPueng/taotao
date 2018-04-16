package dp.taotao.service;

import dp.taotao.utilsBeans.PicResult;
import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
    public PicResult uploadPic(MultipartFile picFile);
}
