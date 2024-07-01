package org.itstack.naive.chat.client.socket.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;
import org.itstack.naive.chat.client.application.UIService;
import org.itstack.naive.chat.protocol.msg.MsgGroupResponse;
import org.itstack.naive.chat.ui.view.chat.IChatMethod;

/**
 * hznu
 * @auther lxj
 *  
 */
public class MsgGroupHandler extends SimpleChannelInboundHandler<MsgGroupResponse> {

    private UIService uiService;

    public MsgGroupHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgGroupResponse msg) throws Exception {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            chat.addTalkMsgGroupLeft(msg.getTalkId(), msg.getUserId(), msg.getUserNickName(), msg.getUserHead(), msg.getMsg(), msg.getMsgType(), msg.getMsgDate(), true, false, true);
        });
    }

}
