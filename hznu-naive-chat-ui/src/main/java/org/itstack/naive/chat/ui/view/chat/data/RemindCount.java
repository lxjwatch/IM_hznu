package org.itstack.naive.chat.ui.view.chat.data;

/**
 * hznu
 * @auther lxj
 *  
 */
public class RemindCount {

    private int count = 0;  // 消息提醒条数

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
