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
        //Elements elements = document.select("#articleMeList-blog > div.article-list > div");
        Elements elements = document.select("#floor-user-profile_485 > div > div.user-profile-body > div > div.user-profile-body-right > div > div:nth-child(2) > div > div > div");
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
        //Element aElement = element.selectFirst("h4 > a");
        Element aElement = element.selectFirst("article > a");
        // href
        String href = aElement.attr("href");
        blogInfo.setHrefUrl(href);


        // title
        //String title = aElement.ownText();
        Element titleElement = aElement.selectFirst("div.blog-list-box-top > h4");
        String title = titleElement.ownText();
        blogInfo.setTitle(title);


        // articleType
        //String articleType = element.selectFirst("h4 > a > span").ownText();
        String articleType = aElement.selectFirst("div.blog-list-footer > div.blog-list-footer-left > div.article-type").ownText();
        blogInfo.setArticleType(articleType);

        // summary
        //String summary = element.selectFirst("p").ownText();
        String summary = aElement.selectFirst("div.blog-list-content").ownText();
        blogInfo.setSummary(summary);

        // date
        String date = aElement.selectFirst("div.blog-list-footer > div.blog-list-footer-right").text();
        blogInfo.setDate(date);

        // readNum
        Element readNumElement = aElement.selectFirst("div.blog-list-footer > div.blog-list-footer-left > div.view-num-box > span");
        if (readNumElement != null) {
            String readNum = readNumElement.ownText();
            blogInfo.setReadNum(Integer.valueOf(readNum));
        }


        // commentNum
        Element commentNumElement = aElement.selectFirst("div.blog-list-footer > div.blog-list-footer-left > div.comment-box > span");
        if (commentNumElement != null){
            String commentNum = commentNumElement.ownText();
            blogInfo.setCommentNum(Integer.valueOf(commentNum));

        }
    }

}
