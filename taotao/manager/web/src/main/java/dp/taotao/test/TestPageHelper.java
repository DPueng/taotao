package dp.taotao.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dp.taotao.mappers.TbItemMapper;
import dp.taotao.pojo.TbItem;
import dp.taotao.pojo.TbItemExample;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestPageHelper {

    @RequestMapping("/testPageHelper")
    public void testPageHelper(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 30);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("total:" + total);
        int pages = pageInfo.getPages();
        System.out.println("pages:" + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);

    }


}
