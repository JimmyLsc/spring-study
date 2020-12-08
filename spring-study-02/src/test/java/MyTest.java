import com.jimmy.dao.Hello;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.Applet;

public class MyTest {
    public static void main(String[] args) {
        //        get the context of the spring
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get the object from the context
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);;

    }
}
