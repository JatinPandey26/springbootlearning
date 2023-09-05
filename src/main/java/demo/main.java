package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Engineer engineer = context.getBean(Engineer.class);

        engineer.doWork();

        engineer.setName("Jatin");

        System.out.println(engineer.toString());;

        Engineer engineer1 = context.getBean(Engineer.class);

        System.out.println(engineer1.toString());;

    }
}
