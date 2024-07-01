package org.itstack.naive.chat.client.socket.handler;

import io.netty.channel.Channel;
import javafx.application.Platform;
import org.itstack.naive.chat.client.application.UIService;
import org.itstack.naive.chat.client.socket.MyBizHandler;
import org.itstack.naive.chat.protocol.friend.AddFriendResponse;
import org.itstack.naive.chat.ui.view.chat.IChatMethod;

/**
 * hznu
 * @auther lxj
 *  
 *
 * 添加好友
 */
public class AddFriendHandler extends MyBizHandler<AddFriendResponse> {

    public AddFriendHandler(UIService uiService) {
        super(uiService);
    }

    @Override
    public void channelRead(Channel channel, AddFriendResponse msg) {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            chat.addFriendUser(true, msg.getFriendId(), msg.getFriendNickName(), msg.getFriendHead());
        });
    }

}
