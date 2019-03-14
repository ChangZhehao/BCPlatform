package service;

import dao.MSInfoMapper;
import model.MSInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * User: u6613739
 * Date: 2019/3/13
 * Time: 17:04
 * Description:
 */
public class MSManageServiceImp extends MSAbstractService implements MSManageService
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("MSManageService");
        }
    }

    public void getProjectByProject(long projectId) throws IOException
    {

        //获取mybatis全局配置文件
        String resource = "config/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //读取配置文件的配置信息，利用SqlSessionFactoryBuilder创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //利用sqlSessionFactory打开与数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try
        {
            MSInfoMapper msInfoMapper = sqlSession.getMapper(MSInfoMapper.class);//通过sqlSession得到mapper
            MSInfo person = msInfoMapper.selectByPrimaryKey(projectId);
            System.out.println(person.getId());
            sqlSession.close();
        } catch (Exception e)
        {
            System.out.println(e);
        } finally
        {
            sqlSession.close();
        }
    }
}
