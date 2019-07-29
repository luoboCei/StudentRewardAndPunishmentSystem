package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Record;

public interface IRecordDAO {
	public int deleteByPrimaryKey(@Param("id")Integer id);

    public int insert(@Param("record")Record record);


    public Record selectByPrimaryKey(Integer id);


    public int updateByPrimaryKey(@Param("record")Record record);
    
    public List<Record> findRecordByStudent(String code);
    
    public List<Record> findRecordAll(@Param("code") String code,@Param("stu") String stu);
}