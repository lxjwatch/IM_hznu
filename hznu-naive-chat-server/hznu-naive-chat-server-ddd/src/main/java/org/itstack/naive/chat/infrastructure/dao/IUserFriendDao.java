package org.itstack.naive.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.itstack.naive.chat.infrastructure.po.UserFriend;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Mapper
public interface IUserFriendDao {

    List<String> queryUserFriendIdList(String userId);

    UserFriend queryUserFriendById(UserFriend req);

    void addUserFriendList(List<UserFriend> list);

}
