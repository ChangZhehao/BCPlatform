import dao.MSInfoMapper;
import model.MSInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MSErrorService;
import service.MSManageService;
import service.MSMessageService;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public static void main(String[] args) throws IOException
    {
//        //TODO after learning spring, use spring to manage my class
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
//        MSManageService manageService =(MSManageService)applicationContext.getBean("MSManageService");
//        MSErrorService msErrorService = (MSErrorService)applicationContext.getBean("MSErrorService");
//        MSMessageService msMessageService = (MSMessageService)applicationContext.getBean("MSMessageService");

        //获取mybatis全局配置文件
        String resource = "config/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //读取配置文件的配置信息，利用SqlSessionFactoryBuilder创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //利用sqlSessionFactory打开与数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MSInfoMapper msInfoMapper = sqlSession.getMapper(MSInfoMapper.class);//通过sqlSession得到mapper

            MSInfo person = msInfoMapper.selectByPrimaryKey(0L);

            System.out.println(person.getId());

sqlSession.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }finally {
            sqlSession.close();
        }
    }


}
