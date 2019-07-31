package com.china.mybootstrap.dao;

import com.china.mybootstrap.entity.Usr;
import com.china.mybootstrap.entity.UsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrMapper {
    long countByExample(UsrExample example);

    int deleteByExample(UsrExample example);

    int deleteByPrimaryKey(Integer usrId);

    int insert(Usr record);

    int insertSelective(Usr record);

    List<Usr> selectByExample(UsrExample example);

    Usr selectByPrimaryKey(Integer usrId);

    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);
}