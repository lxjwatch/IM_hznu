package org.itstack.naive.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.itstack.naive.chat.domain.inet.model.ChannelUserReq;
import org.itstack.naive.chat.infrastructure.po.User;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Mapper
public interface IUserDao {

    String queryUserPassword(String userId);

    User queryUserById(String userId);

    List<User> queryFuzzyUserList(String userId, String searchKey);

    Long queryChannelUserCount(ChannelUserReq req);

    List<User> queryChannelUserList(ChannelUserReq req);

}
