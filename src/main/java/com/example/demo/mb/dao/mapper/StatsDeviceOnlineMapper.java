package com.example.demo.mb.dao.mapper;

import com.example.demo.mb.model.po.StatsDeviceOnline;
import com.example.demo.mb.model.po.StatsDeviceOnlineExample;
import com.example.demo.mb.model.po.StatsDeviceOnlineKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatsDeviceOnlineMapper {
    long countByExample(StatsDeviceOnlineExample example);

    int deleteByExample(StatsDeviceOnlineExample example);

    int deleteByPrimaryKey(StatsDeviceOnlineKey key);

    int insert(StatsDeviceOnline record);

    int insertSelective(StatsDeviceOnline record);

    List<StatsDeviceOnline> selectByExample(StatsDeviceOnlineExample example);

    StatsDeviceOnline selectByPrimaryKey(StatsDeviceOnlineKey key);

    int updateByExampleSelective(@Param("record") StatsDeviceOnline record, @Param("example") StatsDeviceOnlineExample example);

    int updateByExample(@Param("record") StatsDeviceOnline record, @Param("example") StatsDeviceOnlineExample example);

    int updateByPrimaryKeySelective(StatsDeviceOnline record);

    int updateByPrimaryKey(StatsDeviceOnline record);
}