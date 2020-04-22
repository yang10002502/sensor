package com.chinaentropy.model.service;

import com.chinaentropy.model.domain.Device;
import com.chinaentropy.model.mapper.DeviceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jack
 * @date 2020/4/22 9:49
 */
@Service
public class DeviceService {
    @Resource
    private DeviceMapper deviceMapper;

    public List<Device> getList() {
        return deviceMapper.getList();
    }
}
