package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by Administrator on 2018/4/26.
 */
public class TestDao {
    private SqlSessionFactory sqlSessionFactory;

    public List<String> testDao(List<String> list){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<String> re=sqlSession.selectList("TestDaoName.test1",list);
        sqlSession.close();
        return re;
    }
  /*  public List<Map<String,Object>> testDao(String name){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<Map<String,Object>> re=sqlSession.selectList("TestDaoName.test1",name);
        sqlSession.close();
        return re;
    }*/
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
