;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MSErrorService;
import service.MSManageService;
import service.MSMessageService;

import java.io.IOException;


/**
 * User: u6613739
 * Date: 2019/2/25
 * Time: 21:36
 * Description: the main class of BCPlatform
 */
public class BCPlatform extends Object
{
    /**
     * the main method of BCPlatform
     * all Exception should be throw to this method to deal.
     *
     * @param args args
     */
    public static void main(String[] args) throws IOException
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        MSManageService msManageService = (MSManageService) applicationContext.getBean("MSManageService");
        MSErrorService msErrorService = (MSErrorService) applicationContext.getBean("MSErrorService");
        MSMessageService msMessageService = (MSMessageService) applicationContext.getBean("MSMessageService");
        msMessageService.run();

    }

}
