package org.itstack.naive.chat.ui.view.login;

/**
 * hznu
 * @auther lxj
 *  
 *
 * 页面展示元素和事件定义
 */
public class LoginView {

    private LoginInit loginInit;
    private ILoginEvent loginEvent;

    public LoginView(LoginInit loginInit, ILoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }

}
