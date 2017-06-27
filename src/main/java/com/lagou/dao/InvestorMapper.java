package com.lagou.dao;

import com.lagou.vo.Investor;
import com.lagou.vo.InvestorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestorMapper {
    long countByExample(InvestorExample example);

    int deleteByExample(InvestorExample example);

    int deleteByPrimaryKey(Integer investorid);

    int insert(Investor record);

    int insertSelective(Investor record);

    List<Investor> selectByExample(InvestorExample example);

    Investor selectByPrimaryKey(Integer investorid);

    int updateByExampleSelective(@Param("record") Investor record, @Param("example") InvestorExample example);

    int updateByExample(@Param("record") Investor record, @Param("example") InvestorExample example);

    int updateByPrimaryKeySelective(Investor record);

    int updateByPrimaryKey(Investor record);
}