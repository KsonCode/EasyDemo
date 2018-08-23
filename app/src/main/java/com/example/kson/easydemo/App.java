package com.example.kson.easydemo;

import android.app.Application;

import com.hyphenate.chat.EMOptions;
import com.hyphenate.easeui.EaseUI;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/06/26
 * Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initEaseUi();
    }

    /**
     * 初始化
     */
    private void initEaseUi() {
        EMOptions options = new EMOptions();
        // 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);
        EaseUI.getInstance().init(this, options);
    }
}
