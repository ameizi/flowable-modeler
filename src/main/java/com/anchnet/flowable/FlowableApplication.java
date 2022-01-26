package com.anchnet.flowable;

import com.anchnet.flowable.config.ApplicationConfiguration;
import com.anchnet.flowable.servlet.AppDispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
@SpringBootApplication
@EnableTransactionManagement
public class FlowableApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableApplication.class, args);
        System.out.print("程序正在运行。。。。。。。。。。。。。");
    }
}
