package org.itstack.naive.chat.ui.view.login;

/**
 * hznu
 * @auther lxj
 * create by 付政委 on @2020
 * <p>
 * 窗口方法，给予外部调用
 */
public interface ILoginMethod {

    /**
     * 打开登陆窗口
     */
    void doShow();

    /**
     * 登陆失败
     */
    void doLoginError();

    /**
     * 登陆成功；跳转聊天窗口[关闭登陆窗口，打开新窗口]
     */
    void doLoginSuccess();

}
