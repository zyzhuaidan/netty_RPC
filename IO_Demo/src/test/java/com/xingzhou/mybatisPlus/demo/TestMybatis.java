package com.xingzhou.mybatisPlus.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xingzhou
 * @version 1.0.0
 * @ClassName TestMybatis.java
 * @Description TODO
 * @createTime 2022年03月14日 16:17:00
 */

public class TestMybatis {

    @Autowired
    private CmfzAdminDao cmfzAdminDao;

    @Test
    public void contextLoads() {
//        根据id查询
        CmfzAdmin cmfzAdmin = cmfzAdminDao.selectById(1);
//        System.out.println(cmfzAdmin);

//        查询所有  selectList(null);
        List<CmfzAdmin> cmfzAdmins = cmfzAdminDao.selectList(null);
        for (CmfzAdmin admin : cmfzAdmins) {
            System.out.println(admin);
        }
    }

    /**
     * 添加
     */
    @Test
    public void test1() {
//        创建一个对象
        CmfzAdmin cmfzAdmin = new CmfzAdmin();
        cmfzAdmin.setUsername("hhhh");
        cmfzAdmin.setPassword("123456");

//        添加  返回值是成功的条数
        int insert = cmfzAdminDao.insert(cmfzAdmin);
        System.out.println(insert);
    }

    /**
     * 将id为5的管理员名字修改为lisi
     */
    @Test
    public void test2() {
        CmfzAdmin cmfzAdmin = new CmfzAdmin();
        cmfzAdmin.setId(5);
        cmfzAdmin.setUsername("lisi");

//        根据id更新数据
        int i = cmfzAdminDao.updateById(cmfzAdmin);

//        删除
        /**
         * deleteById() 根据id删除
         * deleteBatchIds() 批量删除 参数是要删除的id的集合
         */

    }

}
