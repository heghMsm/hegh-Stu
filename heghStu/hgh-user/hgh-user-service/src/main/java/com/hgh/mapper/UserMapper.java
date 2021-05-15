package com.hgh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgh.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hegh
 * @date 2021-05-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
