import com.jimmy.dao.UserDao;
import com.jimmy.dao.UserDao1Impl;
import com.jimmy.service.UserService;
import com.jimmy.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.showUser();
    }
}
