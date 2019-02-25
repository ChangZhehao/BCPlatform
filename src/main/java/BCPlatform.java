import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: u6613739
 * Date: 2019/2/25
 * Time: 21:36
 * Description: the main class of BCPlatform
 */
public class BCPlatform
{
    /**
     * the main method of BCPlatform
     * all Exception should be throw to this method to deal.
     *
     * @param args args
     */
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();

    }
}
