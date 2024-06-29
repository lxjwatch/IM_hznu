package org.itstack.naive.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.itstack.naive.chat.infrastructure.po.TalkBox;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Mapper
public interface ITalkBoxDao {

    List<TalkBox> queryTalkBoxList(String userId);

    void addTalkBox(TalkBox talkBox);

    void deleteUserTalk(String userId, String talkId);

    TalkBox queryTalkBox(String userId, String talkId);

    List<String> queryTalkBoxGroupsIdList(String userId);

}
