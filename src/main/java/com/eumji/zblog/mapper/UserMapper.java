package com.eumji.zblog.mapper;

import com.eumji.zblog.vo.User;
import com.eumji.zblog.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 获取用户凭证
     * @param username 账号
     * @return
     */
    User getUser(@Param("username") String username);

    /**
     * 获取所有的用户
     * @return
     */
    List<User> allUser();

    UserInfo getUserInfo();

    void updateAvatar(@Param("url") String url, @Param("username") String username);

    void updatePassword(User user);

    void updateUserInfo(UserInfo userInfo);
}
