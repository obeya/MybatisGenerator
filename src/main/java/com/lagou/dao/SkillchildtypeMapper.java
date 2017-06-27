package com.lagou.dao;

import com.lagou.vo.Skillchildtype;
import com.lagou.vo.SkillchildtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkillchildtypeMapper {
    long countByExample(SkillchildtypeExample example);

    int deleteByExample(SkillchildtypeExample example);

    int deleteByPrimaryKey(Integer skillchildtypeid);

    int insert(Skillchildtype record);

    int insertSelective(Skillchildtype record);

    List<Skillchildtype> selectByExample(SkillchildtypeExample example);

    Skillchildtype selectByPrimaryKey(Integer skillchildtypeid);

    int updateByExampleSelective(@Param("record") Skillchildtype record, @Param("example") SkillchildtypeExample example);

    int updateByExample(@Param("record") Skillchildtype record, @Param("example") SkillchildtypeExample example);

    int updateByPrimaryKeySelective(Skillchildtype record);

    int updateByPrimaryKey(Skillchildtype record);
}