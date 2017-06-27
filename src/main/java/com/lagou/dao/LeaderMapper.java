package com.lagou.dao;

import com.lagou.vo.Leader;
import com.lagou.vo.LeaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaderMapper {
    long countByExample(LeaderExample example);

    int deleteByExample(LeaderExample example);

    int deleteByPrimaryKey(Integer leaderid);

    int insert(Leader record);

    int insertSelective(Leader record);

    List<Leader> selectByExample(LeaderExample example);

    Leader selectByPrimaryKey(Integer leaderid);

    int updateByExampleSelective(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByExample(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByPrimaryKeySelective(Leader record);

    int updateByPrimaryKey(Leader record);
}