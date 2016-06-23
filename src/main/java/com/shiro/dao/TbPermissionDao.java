package com.shiro.dao;

import java.util.Set;

import com.shiro.pojo.TbPermission;

public interface TbPermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
    
    Set<String> getPermissions(String userName);
}