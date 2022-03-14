package com.xingzhou.mybatisPlus.demo;

/**
 * @author xingzhou
 * @version 1.0.0
 * @ClassName CmfzAdmin.java
 * @Description TODO
 * @createTime 2022年03月14日 16:05:00
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @TableName("cmfz_admin") 将当前的实体类和数据库的表建立联系
 * 注解参数：表名
 */
@TableName("cmfz_admin")
@Data
@Setter
@Getter
public class CmfzAdmin implements Serializable {
    /**
     * 主键属性  @TableId
     *
     * value 该属性对应的数据库表中的字段名
     * type 主键自增的类型 AUTO 代表自动递增
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
     * 非主键属性  @TableField
     *  @TableField("username")  参数为该属性对应的数据库表中的字段名
     *
     */
    @TableField("user_name")
    private String username;

    @TableField("password")
    private String password;

}