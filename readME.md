##描述
用idea结合maven搭建的一个简单SSM实例，也就是SpringMVC + Spring + MyBatis

本项目参考的资料如下：

博客园：https://www.cnblogs.com/yeya/p/10320885.html

CSDN：https://blog.csdn.net/yeyazhishang/article/details/86650053

掘金：https://juejin.im/post/5c4adafaf265da6142743d47

简书：https://www.jianshu.com/p/e09adeba30d9

注意，用idea部署项目时，在配置tomcat时，里面的“Application context”一项应删除默认的，留空，如果不留空，在index页面再点击登录时，
会访问到http://localhost:8080/crux-module-exam_war_exploded/Manager
而真正的登录URL是：http://localhost:8080/Manager
因此就会出现：404，访问资源不存在  的提示