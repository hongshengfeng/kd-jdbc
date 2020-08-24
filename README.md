### 一、简介
数据库持久层框架kd-jdbc，封装常见的jdbc操作

### 二、引入依赖
```
<dependency>
    <groupId>com.keduw</groupId>
    <artifactId>kd-engine</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### 三、例子
```
InputStream resourceAsSteam = Resource.getResourceAsStream("/SqlMapConfig.xml");
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
SqlSession sqlSession = sqlSessionFactory.openSession();

UserDao userDao = sqlSession.getMapper(UserDao.class);
List<User> all = userDao.findAll();
for (User user1 : all) {
    System.out.println(user1);
}
```
