let blog_data = [{"summary":"自JDK5以来，我们不应该直接与线程交互。正确的模式是将任务作为`Runnable`或`Callable`提交给`ExecutorService`或`Executor`，然后对返回的`Future`进行操作。Loom保留了这种模型，并添加了一些不错的功能。这里要介绍的第一个对象是`Scope`对象， 确切的类型是`StructuredTaskScope`。","date":"发布博客 2022.09.11 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/126803317","title":"Java 19新特性：Structured Concurrency (结构化并发编程)","commentNum":0,"articleType":"原创","readNum":460},{"summary":"JDK19马上就要发布了，今天我们来谈一谈JDK 19的新特性虚线程，它属于JEP 425 Project Loom(425:)。这可能是JDK 19中最值得期待的预览特性之一。我们知道Java阻塞平台线程的代价很高，这就是为什么要不惜一切代价避免这种情况，以及为什么要基于回调编写响应式代码。响应式代码做得很好，但它使代码难以阅读和测试，这显然不是理想的情况。使用DK9和虚拟线程，阻塞线程变得如此廉价，以至于我们不再需要编写响应式代码，我们 的老式阻塞同步代码也可以很好地工作！","date":"发布博客 2022.09.11 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/126803240","title":"Java 19新特性：虚拟线程(Virtual Threads )","commentNum":0,"articleType":"原创","readNum":2398},{"summary":"产生的背景作为一名程序员，平时记笔记时，总是要用一些图片来表达自己的思想，而我又比较喜欢将图片上传到七牛云，老是在网页中上传甚是麻烦，网上虽然也有不少相关的工具，但是我还是喜欢自己造轮子，而且并不复杂，所以就有了七牛云上传图片的功能。平时阅读电子书时，遇到精辟指出，总是情不自禁的想把它记录下来，奈何又懒得自己码字，OCR功能应运而生。有时候从网上下载的资源包，结尾总是带着小广告，赶紧试一下批量重命名功能吧。以后可能还有加其他的功能。当然你们如果有什么想法，也可以到这里留言哦。功能简介七牛云","date":"发布博客 2020.06.30 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/107041595","title":"基于SpringBoot和JavaFX桌面端工具集 包含:七牛云图片上传,截图转文字(OCR),翻译和批量文件重命名","commentNum":0,"articleType":"原创","readNum":341},{"summary":"推荐阅读官方手册起步安装鉴于国内的网速原因，@justjavac 大佬搞了国内的镜像加速：Mac/Linuxcurl -fsSL https://x.deno.js.cn/install.sh | shWindowsiwr https://x.deno.js.cn/install.ps1 -useb -outf install.ps1; .\\install.ps1# iwr https://x.deno.js.cn/install.ps1 -useb | iex设置环境变量den.","date":"发布博客 2020.05.15 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/106134375","title":"Deno极速入门","commentNum":0,"articleType":"转载","readNum":383},{"summary":"前言Deno 已经正式发布了????！官网地址我说这句话时候，是不是很多前端 和 NodeJS 工（码）程（农）师已经按不住自己的40米大刀了。心中的不仅感慨前端是真的会造轮子，有了 node 还不够吗，还没学会 node 又搞了个 deno，node 和 deno 啥区别？！的确，deno 和 node 形态很相似，要解决的问题似乎也相同，那他们到底有啥区别，这一切究竟是道德的沦丧还是 ry （作者）人性的扭曲，让我们走进本篇文章，一探究竟。Deno VS NodeNodeDeno","date":"发布博客 2020.05.14 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/106121966","title":"Deno正式发布，彻底弄明白和Node的区别","commentNum":0,"articleType":"转载","readNum":839},{"summary":"我一直觉得编程语言只是一种工具，重要的是思想。","date":"发布博客 2020.05.10 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/106014889","title":"抓取Bilibili哔哩哔哩网站视频(Java和Python双版本实现)","commentNum":26,"articleType":"原创","readNum":13643},{"summary":"1. 概述在这篇快速文章中，我们将介绍使用标准框架-JSR 380（也称为Bean验证2.0）来验证Java Bean的基础。在大多数应用程序中，验证用户输入是一个非常普遍的要求，并且Java Bean验证框架已成为处理这种逻辑的实际标准。2. JSR380JSR380是用于Java Bean验证的Java API规范，是Jakarta EE和JavaSE的一部分，它使用@ NotNull...","date":"发布博客 2020.03.11 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/104789869","title":"Java Bean验证基础","commentNum":0,"articleType":"翻译","readNum":288},{"summary":"原文地址1. 概述本文将介绍如何使用Jackson的ObjectMapper类将Java对象序列化为Json以及将Json反序列化为Java对象。2. Maven依赖 <dependency> <groupId>com.fasterxml.jackson.core</groupId> <...","date":"发布博客 2020.03.01 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/104594735","title":"Jackson ObjectMapper的使用","commentNum":0,"articleType":"原创","readNum":391},{"summary":"原文地址1 概述在本文中，我们将深入探讨Jackson注解。我们将看到如何使用Jackson现有的注解，如何创建自定义注解以及如何禁用它们。2 Jackson序列化注解2.1 @JsonAnyGetter@JsonAnyGetter注解提供了将Map字段转换为标准属性的灵活性。这是一个简单的示例– ExtendableBean实体具有name属性和一组以K/V对形式的可扩展属性：pu...","date":"发布博客 2020.02.25 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/104495559","title":"Jackson注解使用示例","commentNum":0,"articleType":"原创","readNum":287},{"summary":"CollectionsCollections 工具类常用方法:排序查找,替换操作同步控制(不推荐，需要线程安全的集合类型时请考虑使用 JUC 包下的并发集合)排序操作void reverse(List list)//反转void shuffle(List list)//随机排序void sort(List list)//按自然排序的升序排序void sort(List lis...","date":"发布博客 2020.02.12 ·","hrefUrl":"https://blog.csdn.net/XiumingLee/article/details/104280480","title":"Collections和 Arrays工具类常见方法","commentNum":0,"articleType":"转载","readNum":212}]