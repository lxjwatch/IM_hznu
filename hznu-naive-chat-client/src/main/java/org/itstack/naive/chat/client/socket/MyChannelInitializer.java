package org.itstack.naive.chat.client.socket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.itstack.naive.chat.client.application.UIService;
import org.itstack.naive.chat.client.socket.handler.*;
import org.itstack.naive.chat.codec.ObjDecoder;
import org.itstack.naive.chat.codec.ObjEncoder;

/**
 * hznu
 * @auther lxj
 *  
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    private UIService uiService;

    public MyChannelInitializer(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理[解码]
        channel.pipeline().addLast(new ObjDecoder());
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new AddFriendHandler(uiService));
        channel.pipeline().addLast(new LoginHandler(uiService));
        channel.pipeline().addLast(new MsgGroupHandler(uiService));
        channel.pipeline().addLast(new MsgHandler(uiService));
        channel.pipeline().addLast(new SearchFriendHandler(uiService));
        channel.pipeline().addLast(new TalkNoticeHandler(uiService));
        //对象传输处理[编码]
        channel.pipeline().addLast(new ObjEncoder());
    }

}
