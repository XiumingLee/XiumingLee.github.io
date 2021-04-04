package cn.xiuminglee.home.page;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONArray;
import cn.xiuminglee.home.page.entity.BlogInfo;
import cn.xiuminglee.home.page.util.BlogUtils;

import java.io.*;
import java.net.URL;
import java.util.List;

/**
 * @author Xiuming Lee
 */
public class Main {
    public static void main(String[] args) {

        // 将classpath下的静态文件拷贝到dist文件夹中
        ClassLoader classLoader = Main.class.getClassLoader();
        URL url = classLoader.getResource("static");
        File src = new File(url.getFile());
        File dest = new File("dist");

        FileUtil.copyContent(src,dest,true);

        // 修改data.js
        List<BlogInfo> blogInfoList = BlogUtils.buildData();
        JSONArray jsonArray = new JSONArray(blogInfoList);

        String data = "let blog_data = " + jsonArray.toString();

        File dataFile = new File("dist/js/common/data.js");
        FileUtil.writeString(data,dataFile,"UTF-8");
        System.out.println("###############################################################");
        System.out.println("The blog data processed!");
        System.out.println("###############################################################");
    }


}
