package com.lagou.dao;

import com.lagou.vo.Skilltype;
import com.lagou.vo.SkilltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkilltypeMapper {
    long countByExample(SkilltypeExample example);

    int deleteByExample(SkilltypeExample example);

    int deleteByPrimaryKey(Integer skilltypeid);

    int insert(Skilltype record);

    int insertSelective(Skilltype record);

    List<Skilltype> selectByExample(SkilltypeExample example);

    Skilltype selectByPrimaryKey(Integer skilltypeid);

    int updateByExampleSelective(@Param("record") Skilltype record, @Param("example") SkilltypeExample example);

    int updateByExample(@Param("record") Skilltype record, @Param("example") SkilltypeExample example);

    int updateByPrimaryKeySelective(Skilltype record);

    int updateByPrimaryKey(Skilltype record);
}