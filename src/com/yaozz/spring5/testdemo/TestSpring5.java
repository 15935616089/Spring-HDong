package com.yaozz.spring5.testdemo;

import com.yaozz.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author yaozz
 * @date 2020/8/27 17:18
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        //FileSystemXmlApplicationContext 代理路径
        //ClassPathXmlApplicationContext  src路径下
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }
}
