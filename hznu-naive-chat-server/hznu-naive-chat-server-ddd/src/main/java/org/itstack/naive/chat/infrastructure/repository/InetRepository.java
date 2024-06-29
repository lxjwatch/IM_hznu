package org.itstack.naive.chat.infrastructure.repository;

import org.itstack.naive.chat.domain.inet.model.ChannelUserInfo;
import org.itstack.naive.chat.domain.inet.model.ChannelUserReq;
import org.itstack.naive.chat.domain.inet.repository.IInetRepository;
import org.itstack.naive.chat.infrastructure.dao.IUserDao;
import org.itstack.naive.chat.infrastructure.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Repository("inetRepository")
public class InetRepository implements IInetRepository {

    @Autowired
    private IUserDao userDao;

    @Override
    public Long queryChannelUserCount(ChannelUserReq req) {
        return userDao.queryChannelUserCount(req);
    }

    @Override
    public List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req) {
        List<ChannelUserInfo> channelUserInfoList = new ArrayList<>();
        List<User> userList = userDao.queryChannelUserList(req);
        for (User user:userList){
            ChannelUserInfo channelUserInfo = new ChannelUserInfo();
            channelUserInfo.setUserId(user.getUserId());
            channelUserInfo.setUserNickName(user.getUserNickName());
            channelUserInfo.setUserHead(user.getUserHead());
            channelUserInfoList.add(channelUserInfo);
        }
        return channelUserInfoList;
    }
}
