package dp.taotao.controller;

import dp.taotao.service.PictureService;
import dp.taotao.utilsBeans.PicResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("pic/upload")
    @ResponseBody
    public PicResult uploadFile(MultipartFile uploadFile){
        return pictureService.uploadPic(uploadFile);
    }
}
