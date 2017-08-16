# spring-boot
spring-boot简单的项目构建，学自慕课网


## 包括以下内容
- Spring Boot application.yml配置
- 数据库mysql配置
- spring Boot实现MVC结构，并对mysql进行数据增删改查
- @RestController注解等同于@Controller+@ResponseBody
- 通过继承hibernate的注解校验，完成数据库字段校验
- 异常封装，自定义异常返回，异常参数：code 和 msg 枚举化
- 单元测试，针对controller和service如何自动创建测试类
- 单元测试MockMvc的应用

## 注意：在mvn clean package打包的时候，测试test方法会被编译
         还有个自己记录的小坑，我Controller层的注解写了@RestController,导致我模板页面返回不了视图，只能返回字符串

## thymeleaf的配置文件说明
- spring.thymeleaf.cache = true ＃启用模板缓存。
- spring.thymeleaf.check-template = true ＃在呈现模板之前检查模板是否存在。
- spring.thymeleaf.check-template-location = true ＃检查模板位置是否存在。
- spring.thymeleaf.content-type = text / html ＃Content-Type值。
- spring.thymeleaf.enabled = true ＃启用MVC Thymeleaf视图分辨率。
- spring.thymeleaf.encoding = UTF-8 ＃模板编码。
- spring.thymeleaf.excluded-view-names = ＃应该从解决方案中排除的视图名称的逗号分隔列表。
- spring.thymeleaf.mode = HTML5 ＃应用于模板的模板模式。另请参见StandardTemplateModeHandlers。
- spring.thymeleaf.prefix = classpath：/ templates / ＃在构建URL时预先查看名称的前缀。
- spring.thymeleaf.suffix = .html ＃构建URL时附加到查看名称的后缀。
- spring.thymeleaf.template-resolver-order = ＃链中模板解析器的顺序。
- spring.thymeleaf.view-names = ＃可以解析的视图名称的逗号分隔列表。/ templates / ＃在构建URL时先查看名称的前缀。
- spring.thymeleaf.suffix = .html ＃构建URL时附加到查看名称的后缀。
- spring.thymeleaf.template-resolver-order = ＃链中模板解析器的顺序。
- spring.thymeleaf.view-names = ＃可以解析的视图名称的逗号分隔列表。/ templates / ＃在构建URL时先查看名称的前缀。
- spring.thymeleaf.suffix = .html ＃构建URL时附加到查看名称的后缀。
- spring.thymeleaf.template-resolver-order = ＃链中模板解析器的顺序。
- spring.thymeleaf.view-names = ＃可以解析的视图名称的逗号分隔列表。

## 阿里大鱼可以注册自己的APP认证信息，进行短信验证，代码已更新，可以参考这发送验证码

## log4jdbc用于显示全量的sql语句，不同于原来的hibernate jpa mybatis的sql显示，带有占位符？
