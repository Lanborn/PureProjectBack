package com.projectm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 * 
 * @author LanBorn
 */
@ComponentScan(basePackages={"com.framework","com.projectm"})
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class APPLauncher
{
    public static void main(String[] args)
    {
        SpringApplication.run(APPLauncher.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  任务协同项目管理系统启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }
}