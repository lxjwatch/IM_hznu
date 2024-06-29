package org.itstack.naive.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.itstack.naive.chat.infrastructure.po.Groups;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}
