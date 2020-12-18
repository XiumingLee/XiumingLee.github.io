let app = new Vue({
    el: '#index',
    data: {
        blog_data: blog_data,
        csdn_url: "https://blog.csdn.net/XiumingLee"
    },
    mounted(){
        this.loadBlog();
    },
    methods: {
        // 加载博客文章
        loadBlog(){
            console.log(`文章数据为：`)
            console.log(this.blog_data)
        },

        // 去csdn页面
        toCSDNPage(){
            window.open(this.csdn_url,'target');
        }
    }
})

