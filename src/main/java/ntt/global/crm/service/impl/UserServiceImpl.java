package ntt.global.crm.service.impl;

import ntt.global.crm.mapper.UserMapper;
import ntt.global.crm.pojo.User;
import ntt.global.crm.service.UserService;

import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/6 12:19
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> queryUsers() {
        return userMapper.queryUsers();
    }
}
