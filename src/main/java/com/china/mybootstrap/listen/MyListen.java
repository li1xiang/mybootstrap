package com.china.mybootstrap.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListen implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized...web应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed...当前web项目销毁");
    }
}
