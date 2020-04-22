package com.chinaentropy.model.mapper;

import com.chinaentropy.model.domain.Device;

import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    List<Device> getList();
}