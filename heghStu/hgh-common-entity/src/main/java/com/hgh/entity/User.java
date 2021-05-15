package com.hgh.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author hegh
 * @date 2021-05-15
 */
@Data
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String name;

    private String age;
}
