package com.lagou.dao;

import com.lagou.vo.Collectjob;
import com.lagou.vo.CollectjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectjobMapper {
    long countByExample(CollectjobExample example);

    int deleteByExample(CollectjobExample example);

    int deleteByPrimaryKey(Integer collectjobid);

    int insert(Collectjob record);

    int insertSelective(Collectjob record);

    List<Collectjob> selectByExample(CollectjobExample example);

    Collectjob selectByPrimaryKey(Integer collectjobid);

    int updateByExampleSelective(@Param("record") Collectjob record, @Param("example") CollectjobExample example);

    int updateByExample(@Param("record") Collectjob record, @Param("example") CollectjobExample example);

    int updateByPrimaryKeySelective(Collectjob record);

    int updateByPrimaryKey(Collectjob record);
}