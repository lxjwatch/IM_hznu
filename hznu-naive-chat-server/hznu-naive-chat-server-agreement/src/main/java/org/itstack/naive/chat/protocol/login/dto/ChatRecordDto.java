package org.itstack.naive.chat.protocol.login.dto;

import java.util.Date;

/**
 * hznu
 * @auther lxj
 *  
 */
public class ChatRecordDto {

    private String talkId;          // 对话框ID
    private String userId;          // 用户ID[自己/好友]
    private String userNickName;    // 用户昵称[群组聊天]
    private String userHead;        // 用户头像[群组聊天]
    private Integer msgUserType;    // 消息类型[0自己/1好友]
    private String msgContent;      // 消息内容
    private Integer msgType;        // 消息类型；0文字消息、1固定表情
    private Date msgDate;           // 消息时间

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public Integer getMsgUserType() {
        return msgUserType;
    }

    public void setMsgUserType(Integer msgUserType) {
        this.msgUserType = msgUserType;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }
}
