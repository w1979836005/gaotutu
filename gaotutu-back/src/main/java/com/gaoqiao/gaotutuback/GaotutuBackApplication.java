    package com.gaoqiao.gaotutuback;

    import org.mybatis.spring.annotation.MapperScan;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.EnableAspectJAutoProxy;

    @SpringBootApplication
    // 扫描指定包下的Mapper接口
    @MapperScan("com.gaoqiao.gaotutuback.demos.mapper")
    @EnableAspectJAutoProxy(proxyTargetClass = true)
    public class GaotutuBackApplication {

        public static void main(String[] args) {
            // 启动Spring Boot应用
            SpringApplication.run(GaotutuBackApplication.class, args);
        }

    }
