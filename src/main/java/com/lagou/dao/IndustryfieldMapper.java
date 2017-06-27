package com.lagou.dao;

import com.lagou.vo.Industryfield;
import com.lagou.vo.IndustryfieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryfieldMapper {
    long countByExample(IndustryfieldExample example);

    int deleteByExample(IndustryfieldExample example);

    int deleteByPrimaryKey(Integer industryfieldid);

    int insert(Industryfield record);

    int insertSelective(Industryfield record);

    List<Industryfield> selectByExample(IndustryfieldExample example);

    Industryfield selectByPrimaryKey(Integer industryfieldid);

    int updateByExampleSelective(@Param("record") Industryfield record, @Param("example") IndustryfieldExample example);

    int updateByExample(@Param("record") Industryfield record, @Param("example") IndustryfieldExample example);

    int updateByPrimaryKeySelective(Industryfield record);

    int updateByPrimaryKey(Industryfield record);
}