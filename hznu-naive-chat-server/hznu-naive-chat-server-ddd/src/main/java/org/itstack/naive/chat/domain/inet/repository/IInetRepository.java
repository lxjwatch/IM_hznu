package org.itstack.naive.chat.domain.inet.repository;

import org.itstack.naive.chat.domain.inet.model.ChannelUserInfo;
import org.itstack.naive.chat.domain.inet.model.ChannelUserReq;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
public interface IInetRepository {

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
