package com.lagou.dao;

import com.lagou.vo.Companynews;
import com.lagou.vo.CompanynewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanynewsMapper {
    long countByExample(CompanynewsExample example);

    int deleteByExample(CompanynewsExample example);

    int deleteByPrimaryKey(Integer conewsid);

    int insert(Companynews record);

    int insertSelective(Companynews record);

    List<Companynews> selectByExample(CompanynewsExample example);

    Companynews selectByPrimaryKey(Integer conewsid);

    int updateByExampleSelective(@Param("record") Companynews record, @Param("example") CompanynewsExample example);

    int updateByExample(@Param("record") Companynews record, @Param("example") CompanynewsExample example);

    int updateByPrimaryKeySelective(Companynews record);

    int updateByPrimaryKey(Companynews record);
}