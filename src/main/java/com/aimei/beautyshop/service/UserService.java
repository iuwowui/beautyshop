package com.aimei.beautyshop.service;

import com.aimei.beautyshop.entity.User;
import com.aimei.beautyshop.vo.JsonBean;

public interface UserService {
    JsonBean login(int userid);

    JsonBean updateUserInfo(User user);
}
