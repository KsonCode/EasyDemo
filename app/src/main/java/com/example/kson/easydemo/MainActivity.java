package com.example.kson.easydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hyphenate.easeui.domain.EaseUser;
import com.hyphenate.easeui.widget.EaseContactList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EaseContactList easeContactList;
    private List<EaseUser> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        easeContactList = findViewById(R.id.contact_list);


    }

    private void initData() {
        list = new ArrayList<>();
        EaseUser easeUser = new EaseUser("jiejie1");
        EaseUser easeUser2 = new EaseUser("jiejie2");
        EaseUser easeUser3 = new EaseUser("jiejie3");

        list.add(easeUser);
        list.add(easeUser2);
        list.add(easeUser3);
        easeContactList.init(list);


    }
}
