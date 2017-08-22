# SpringBootDemo
SpringBoot案例，包括部署到外部tomcat：
1.由于springboot自带内置tomcat，所以需要将内置tomcat的依赖包排除，不然产生冲突
2.如果本地开发的时候依然想要使用spring boot内嵌tomcat进行调试，添加如下依赖即可
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
