package cn.xiuminglee.home.page.util;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.xiuminglee.home.page.entity.BlogInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiuming Lee
 */
public class BlogUtils {
    /** CSDN博客地址 */
    private static final String CSDN_BLOG_URL = "https://blog.csdn.net/XiumingLee";

    public static List<BlogInfo> buildData(){
        List<BlogInfo> blogInfoList = new ArrayList<>();
        String blogHtml = HttpUtil.get(CSDN_BLOG_URL);
        //    解析字符串
        Document document = Jsoup.parse(blogHtml);
        Elements elements = document.select("#articleMeList-blog > div.article-list > div");
        elements.forEach(element -> {
            if (blogInfoList.size() >= 10){
                return;
            }
            BlogInfo blogInfo = new BlogInfo();
            buildBlogInfo(element,blogInfo);
            blogInfoList.add(blogInfo);
        });
        return blogInfoList;
    }

    private static void buildBlogInfo(Element element,BlogInfo blogInfo){
        Element aElement = element.selectFirst("h4 > a");
        // href
        String href = aElement.attr("href");
        blogInfo.setHrefUrl(href);
        // title
        String title = aElement.ownText();
        blogInfo.setTitle(title);
        // articleType
        String articleType = element.selectFirst("h4 > a > span").ownText();
        blogInfo.setArticleType(articleType);
        // summary
        String summary = element.selectFirst("p").ownText();
        blogInfo.setSummary(summary);
        // date
        String date = element.selectFirst("div.info-box.d-flex.align-content-center > p > span").ownText();
        blogInfo.setDate(date);
        // readNum
        Element readNumElement = element.selectFirst("div.info-box.d-flex.align-content-center > p > span.read-num");
        if (readNumElement != null) {
            String readNum = readNumElement.ownText();
            blogInfo.setReadNum(Integer.valueOf(readNum));
        }
        // commentNum
        Element commentNumElement = element.selectFirst("div.info-box.d-flex.align-content-center > p > span:nth-child(3)");
        if (commentNumElement != null){
            String commentNum = commentNumElement.ownText();
            blogInfo.setCommentNum(Integer.valueOf(commentNum));

        }
    }

}
