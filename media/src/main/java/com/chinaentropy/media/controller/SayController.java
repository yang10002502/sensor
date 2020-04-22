package com.chinaentropy.media.controller;

import com.chinaentropy.model.service.DeviceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jack
 * @date 2020/4/22 10:29
 */
@RestController
@RequestMapping("2b/say")
public class SayController {
    @Resource
    private DeviceService deviceService;

    @GetMapping("say")
    public Object say() {
        return "jack come on";
    }

    @GetMapping("getList")
    public Object getList() {
        return deviceService.getList();
    }
}
