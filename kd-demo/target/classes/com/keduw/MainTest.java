package com.keduw;

import com.keduw.dao.UserDao;
import com.keduw.pojo.User;
import com.keduw.session.SqlSession;
import com.keduw.session.SqlSessionFactory;
import com.keduw.session.SqlSessionFactoryBuilder;
import com.keduw.util.Resource;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MainTest {

    @Test
    public void main() throws Exception {
        InputStream resourceAsSteam = Resource.getResourceAsStream("/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> all = userDao.findAll();
        for (User user1 : all) {
            System.out.println(user1);
        }
    }
}
