package cn.edu.guet;

import cn.edu.guet.mapper.TreeMapper;
import cn.edu.guet.model.Tree;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class TreeTest
{
    private SqlSessionFactory sqlSessionFactory;
    /*
    相当于JDBC中的Connection
     */
    private SqlSession sqlSession;

    @Before
    public void init() throws ClassNotFoundException {
        InputStream in=Class.forName("cn.edu.guet.TreeTest").getResourceAsStream("/mybatis-config.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(in);
        sqlSession=sqlSessionFactory.openSession();
    }
    @Test
    public void testGetTreeById(){
        TreeMapper treeMapper=sqlSession.getMapper(TreeMapper.class);
        List<Tree> treelist=treeMapper.getTreeByRole("r1000");
        //System.out.println("父菜单："+tree.getParentTree().getTitle());
        for (Tree tree:treelist){
            System.out.println(tree.getTitle());
        }
    }
    @After
    public void destroy(){
        sqlSession.close();
    }
}