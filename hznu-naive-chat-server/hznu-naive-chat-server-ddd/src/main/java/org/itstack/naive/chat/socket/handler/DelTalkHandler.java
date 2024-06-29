package org.itstack.naive.chat.socket.handler;

import io.netty.channel.Channel;
import org.itstack.naive.chat.application.UserService;
import org.itstack.naive.chat.protocol.talk.DelTalkRequest;
import org.itstack.naive.chat.socket.MyBizHandler;

/**
 * hznu
 * @auther lxj
 *  
 */
public class DelTalkHandler extends MyBizHandler<DelTalkRequest> {

    public DelTalkHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, DelTalkRequest msg) {
        userService.deleteUserTalk(msg.getUserId(), msg.getTalkId());
    }
}
