package com.lagou.dao;

import com.lagou.vo.Recruitservice;
import com.lagou.vo.RecruitserviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitserviceMapper {
    long countByExample(RecruitserviceExample example);

    int deleteByExample(RecruitserviceExample example);

    int deleteByPrimaryKey(Integer recruitid);

    int insert(Recruitservice record);

    int insertSelective(Recruitservice record);

    List<Recruitservice> selectByExample(RecruitserviceExample example);

    Recruitservice selectByPrimaryKey(Integer recruitid);

    int updateByExampleSelective(@Param("record") Recruitservice record, @Param("example") RecruitserviceExample example);

    int updateByExample(@Param("record") Recruitservice record, @Param("example") RecruitserviceExample example);

    int updateByPrimaryKeySelective(Recruitservice record);

    int updateByPrimaryKey(Recruitservice record);
}