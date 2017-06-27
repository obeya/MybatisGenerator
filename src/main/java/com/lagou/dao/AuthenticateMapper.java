package com.lagou.dao;

import com.lagou.vo.Authenticate;
import com.lagou.vo.AuthenticateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticateMapper {
    long countByExample(AuthenticateExample example);

    int deleteByExample(AuthenticateExample example);

    int deleteByPrimaryKey(Integer authid);

    int insert(Authenticate record);

    int insertSelective(Authenticate record);

    List<Authenticate> selectByExample(AuthenticateExample example);

    Authenticate selectByPrimaryKey(Integer authid);

    int updateByExampleSelective(@Param("record") Authenticate record, @Param("example") AuthenticateExample example);

    int updateByExample(@Param("record") Authenticate record, @Param("example") AuthenticateExample example);

    int updateByPrimaryKeySelective(Authenticate record);

    int updateByPrimaryKey(Authenticate record);
}