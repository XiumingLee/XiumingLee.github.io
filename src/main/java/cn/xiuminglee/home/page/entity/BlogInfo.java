package cn.xiuminglee.home.page.entity;

/**
 * @author Xiuming Lee
 * 博客信息数据
 */
public class BlogInfo {
    /** 文章类型：原创、转载、翻译 */
    private String articleType;
    /** 文章标题 */
    private String title;
    /** 文章摘要 */
    private String summary;
    /** 发布时间 */
    private String date;
    /** 阅读数量 */
    private Integer readNum = 0;
    /** 评论数量 */
    private Integer commentNum = 0;
    /** 链接地址 */
    private String hrefUrl;


    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getHrefUrl() {
        return hrefUrl;
    }

    public void setHrefUrl(String hrefUrl) {
        this.hrefUrl = hrefUrl;
    }

    @Override
    public String toString() {
        return "BlogInfo{" +
                "articleType='" + articleType + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", date='" + date + '\'' +
                ", readNum='" + readNum + '\'' +
                ", commentNum='" + commentNum + '\'' +
                ", hrefUrl='" + hrefUrl + '\'' +
                '}';
    }
}
