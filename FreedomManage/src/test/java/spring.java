import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName spring
 * @Author hms
 * @Date 2024/1/22 22:36
 * @Description TODO
 */
public class spring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object hhh = applicationContext.getBean("hhh");
    }
}
