package com.sprongcloud.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

}
