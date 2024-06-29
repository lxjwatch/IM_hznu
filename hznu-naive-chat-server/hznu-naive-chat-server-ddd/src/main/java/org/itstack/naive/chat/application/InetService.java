package org.itstack.naive.chat.application;

import org.itstack.naive.chat.domain.inet.model.ChannelUserInfo;
import org.itstack.naive.chat.domain.inet.model.ChannelUserReq;
import org.itstack.naive.chat.domain.inet.model.InetServerInfo;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 *
 * 网络信息查询
 */
public interface InetService {

    InetServerInfo queryNettyServerInfo();

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
