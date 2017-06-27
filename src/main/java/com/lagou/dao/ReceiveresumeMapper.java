package com.lagou.dao;

import com.lagou.vo.Receiveresume;
import com.lagou.vo.ReceiveresumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveresumeMapper {
    long countByExample(ReceiveresumeExample example);

    int deleteByExample(ReceiveresumeExample example);

    int deleteByPrimaryKey(Integer receiveresumeid);

    int insert(Receiveresume record);

    int insertSelective(Receiveresume record);

    List<Receiveresume> selectByExample(ReceiveresumeExample example);

    Receiveresume selectByPrimaryKey(Integer receiveresumeid);

    int updateByExampleSelective(@Param("record") Receiveresume record, @Param("example") ReceiveresumeExample example);

    int updateByExample(@Param("record") Receiveresume record, @Param("example") ReceiveresumeExample example);

    int updateByPrimaryKeySelective(Receiveresume record);

    int updateByPrimaryKey(Receiveresume record);
}