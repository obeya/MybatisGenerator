package com.lagou.dao;

import com.lagou.vo.Subscribejob;
import com.lagou.vo.SubscribejobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribejobMapper {
    long countByExample(SubscribejobExample example);

    int deleteByExample(SubscribejobExample example);

    int deleteByPrimaryKey(Integer subscribeid);

    int insert(Subscribejob record);

    int insertSelective(Subscribejob record);

    List<Subscribejob> selectByExample(SubscribejobExample example);

    Subscribejob selectByPrimaryKey(Integer subscribeid);

    int updateByExampleSelective(@Param("record") Subscribejob record, @Param("example") SubscribejobExample example);

    int updateByExample(@Param("record") Subscribejob record, @Param("example") SubscribejobExample example);

    int updateByPrimaryKeySelective(Subscribejob record);

    int updateByPrimaryKey(Subscribejob record);
}