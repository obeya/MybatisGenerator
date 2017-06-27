package com.lagou.dao;

import com.lagou.vo.Hotsearch;
import com.lagou.vo.HotsearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotsearchMapper {
    long countByExample(HotsearchExample example);

    int deleteByExample(HotsearchExample example);

    int deleteByPrimaryKey(Integer hotsearchid);

    int insert(Hotsearch record);

    int insertSelective(Hotsearch record);

    List<Hotsearch> selectByExample(HotsearchExample example);

    Hotsearch selectByPrimaryKey(Integer hotsearchid);

    int updateByExampleSelective(@Param("record") Hotsearch record, @Param("example") HotsearchExample example);

    int updateByExample(@Param("record") Hotsearch record, @Param("example") HotsearchExample example);

    int updateByPrimaryKeySelective(Hotsearch record);

    int updateByPrimaryKey(Hotsearch record);
}