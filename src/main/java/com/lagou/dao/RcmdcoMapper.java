package com.lagou.dao;

import com.lagou.vo.Rcmdco;
import com.lagou.vo.RcmdcoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcmdcoMapper {
    long countByExample(RcmdcoExample example);

    int deleteByExample(RcmdcoExample example);

    int deleteByPrimaryKey(Integer rcmdcoid);

    int insert(Rcmdco record);

    int insertSelective(Rcmdco record);

    List<Rcmdco> selectByExample(RcmdcoExample example);

    Rcmdco selectByPrimaryKey(Integer rcmdcoid);

    int updateByExampleSelective(@Param("record") Rcmdco record, @Param("example") RcmdcoExample example);

    int updateByExample(@Param("record") Rcmdco record, @Param("example") RcmdcoExample example);

    int updateByPrimaryKeySelective(Rcmdco record);

    int updateByPrimaryKey(Rcmdco record);
}