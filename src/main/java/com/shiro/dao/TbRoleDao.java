package com.shiro.dao;

import java.util.Set;

import com.shiro.pojo.TbRole;

public interface TbRoleDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
    
    Set<String> getRoles(String userName);
}