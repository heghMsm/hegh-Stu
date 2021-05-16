package com.hgh.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.protobuf.InvalidProtocolBufferException;
import com.hgh.entity.User;
import com.hgh.entity.dto.Result;
import com.hgh.service.IUserService;
import com.hgh.utils.ResultUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pb.Package;

/**
 * @author hegh
 * @date 2021-05-15
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public Result<Page<User>> page(){
        Page<User> page = new Page<>(1,10);
        Page<User> userPage = userService.page(page);
        return ResultUtil.success(userPage);
    }


    @PostMapping(value = "/test")
    public byte[] test(@RequestBody  byte[] data) throws InvalidProtocolBufferException {
        Package.Pack pack = Package.Pack.parseFrom(data);
        log.info(pack.toString());

        Package.Pack.Builder builder = Package.Pack.newBuilder();
        builder.setContext(100);
        return builder.build().toByteArray();
    }
}
