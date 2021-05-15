package com.hgh.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hgh.entity.po.User;
import com.hgh.service.IUserService;
import com.hgh.utils.Result;
import com.hgh.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hegh
 * @date 2021-05-15
 */
@RestController("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public Result page(){
        Page<User> page = new Page<>(1,10);
        Page<User> userPage = userService.page(page);
        return ResultUtil.succ(userPage);
    }
}
