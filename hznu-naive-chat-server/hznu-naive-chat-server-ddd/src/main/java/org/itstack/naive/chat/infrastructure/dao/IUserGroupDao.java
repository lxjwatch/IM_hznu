package org.itstack.naive.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * hznu
 * @auther lxj
 *  
 */
@Mapper
public interface IUserGroupDao {

    List<String> queryUserGroupsIdList(String userId);

}
