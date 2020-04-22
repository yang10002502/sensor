package com.chinaentropy.model.controller;

import com.chinaentropy.model.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jack
 * @date 2020/4/22 9:51
 */
@RestController
@RequestMapping("2b/device")
public class DeviceController {

    private static Logger logger = LoggerFactory.getLogger(DeviceController.class);

    @Resource
    private DeviceService deviceService;

    @GetMapping("getList")
    public Object getList() {
        return deviceService.getList();
    }
}
