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