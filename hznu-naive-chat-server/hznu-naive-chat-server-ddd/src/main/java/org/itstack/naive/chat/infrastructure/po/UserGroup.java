package org.itstack.naive.chat.infrastructure.po;

import java.util.Date;

/**
 * hznu
 * @auther lxj
 *  
 *
 * 用户群组
 */
public class UserGroup {

    private Long id;          // 自增ID
    private String userId;    // 用户ID
    private String groupId;   // 群组ID
    private Date createTime;  // 创建时间
    private Date updateTime;  // 更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
