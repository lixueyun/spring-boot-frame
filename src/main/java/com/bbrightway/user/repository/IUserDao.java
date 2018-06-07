/**
 * Project Name:standard-web
 * File Name:IUserDao
 * Package Name:com.bbrightway.user.repository
 * Date:2018/6/1 11:06
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.user.repository;

import com.bbrightway.user.domain.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * ClassName:  IUserDao
 * Function:   TODO
 * Date:   2018/6/1 11:06
 *
 * @author lixueyun
 * @version 3.0
 */
//@Mapper 配置MapperScan可不写
public interface IUserDao {

    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    UserEntity getUserById(Integer id);

    @Select("SELECT * FROM tb_user")
    List<UserEntity> getUserList();

    @Insert("insert into tb_user(username, age, ctm) values(#{username}, #{age}, now())")
    int add(UserEntity user);

    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
    int update(Integer id, UserEntity user);

    @Delete("DELETE from tb_user where id = #{id} ")
    int delete(Integer id);
}
