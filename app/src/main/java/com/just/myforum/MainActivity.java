package com.just.myforum;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.johnpersano.supertoasts.SuperActivityToast;
import com.github.johnpersano.supertoasts.SuperToast;
import com.github.johnpersano.supertoasts.util.Style;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener  {


    private RecyclerView recyclerView;
    private MyRecyclerAdapter recyclerAdapter;

//    private List<Bean> mList;

    private MyApplication app;

    private Context mContext;

    private SwipeRefreshLayout mSwipeLayout;

    private static final int REFRESH_COMPLETE = 0X110;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (MyApplication) getApplication();  // 获得自定义的应用程序 QApp

        mSwipeLayout = (SwipeRefreshLayout) findViewById(R.id.id_swipe_ly);

        mSwipeLayout.setOnRefreshListener(this);
        mSwipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light,
                android.R.color.holo_orange_light, android.R.color.holo_red_light);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        app.mList = new ArrayList<>();
        mContext = this;

        Bean bean0 = new Bean(R.drawable.logo_0, "eccolala", "2016.7.1", Uri.parse("android.resource://com.just.myforum/drawable/f00"), "开玩笑，这道菜好吃到没朋友，好吃到让邻居大妈都爱上你，绝对是居家旅行必备，我的心愿是。。世界和平", Uri.parse("android.resource://com.just.myforum/drawable/f01"));
        app.mList.add(bean0);

        Bean bean1 = new Bean(R.drawable.logo_1, "爱尔兰的风车", "2016.6.28",Uri.parse("android.resource://com.just.myforum/drawable/f10"), "你以为我还是来秀美食吗？开玩笑，当然是错的了，因为这道菜我都不知道是什么，另外，谁用我的手机发的动态，神经病啊？我不要面子的啊？", Uri.parse("android.resource://com.just.myforum/drawable/f11"));
        app.mList.add(bean1);

        Bean bean2 = new Bean(R.drawable.logo_2, "Baby", "2016.6.27", Uri.parse("android.resource://com.just.myforum/drawable/f20"), "我记得初中第一次吃这道菜时，认为这是一件很酷的事情，直到我长大后我依然爱它，那么，你懂得。。。", Uri.parse("android.resource://com.just.myforum/drawable/f21"));
        app.mList.add(bean2);

        Bean bean3 = new Bean(R.drawable.logo_3, "BilieJiao", "2016.6.24", Uri.parse("android.resource://com.just.myforum/drawable/f30"), "为了生活东奔西跑，卖力表演，迎来很多工作机会，今天为我爱的人做了这道虾仁卷饼，所谓的惊喜就要给的直接、真诚，像叙旧时摆好的棋谱，像微风下温热的黄酒", Uri.parse("android.resource://com.just.myforum/drawable/f31"));
        app.mList.add(bean3);

        Bean bean4 = new Bean(R.drawable.logo_4, "博", "2016.6.23", Uri.parse("android.resource://com.just.myforum/drawable/f40"), "自从吃了这道水煮肉，收入明显上升，知名度勉强翻倍，工作邀约不断，膨胀到胸肌出现，有些朋友在路上都能认出我了，个别7岁以下的还会叫我爸爸。。。", Uri.parse("android.resource://com.just.myforum/drawable/f41"));
        app.mList.add(bean4);

        Bean bean5 = new Bean(R.drawable.logo_5, "流潋紫", "2016.6.20", Uri.parse("android.resource://com.just.myforum/drawable/f50"), "麻婆豆腐，简单直接，美味难挡", Uri.parse("android.resource://com.just.myforum/drawable/f51"));
        app.mList.add(bean5);

        Bean bean6 = new Bean(R.drawable.logo_6, "代码家", "2016.6.19",Uri.parse("android.resource://com.just.myforum/drawable/f60"), "如果你是川菜的粉丝，一定要尝尝这款蚂蚁上树", Uri.parse("android.resource://com.just.myforum/drawable/f61"));
        app.mList.add(bean6);

        Bean bean7 = new Bean(R.drawable.logo_7, "DDong", "2016.6.18", Uri.parse("android.resource://com.just.myforum/drawable/f70"), "我爱吃香辣蟹这件事，就像西门庆爱吃腰子，法海爱吃蛇皮一样，准确的说，螃蟹这种东西，只要看到我，它就已经死了，所以这道菜看似突兀，却又在情理之中",Uri.parse("android.resource://com.just.myforum/drawable/f71"));
        app.mList.add(bean7);

        Bean bean8 = new Bean(R.drawable.logo_8, "搁浅", "2016.6.17", Uri.parse("android.resource://com.just.myforum/drawable/f80"), "今天做了宫保鸡丁，孩子很爱吃，希望他可以健康快乐的长大", Uri.parse("android.resource://com.just.myforum/drawable/f81"));
        app.mList.add(bean8);

        Bean bean9 = new Bean(R.drawable.logo_9, "寰博", "2016.6.15", Uri.parse("android.resource://com.just.myforum/drawable/f90"), "朋友聚会吃酱蹄子什么的最爽了", Uri.parse("android.resource://com.just.myforum/drawable/f91"));
        app.mList.add(bean9);

        recyclerAdapter = new MyRecyclerAdapter(MainActivity.this, app.mList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);





    }


    private Handler mHandler = new Handler()
    {
        public void handleMessage(android.os.Message msg)
        {
            switch (msg.what)
            {
                case REFRESH_COMPLETE:
                    recyclerAdapter.notifyDataSetChanged();
                    mSwipeLayout.setRefreshing(false);

                    break;

            }
        };
    };


    public void comment(View view) {
        startActivity(new Intent(this, WriteStatusActivity.class));
    }


    /**
     * 下拉刷新回调
     */
    @Override
    public void onRefresh() {
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000);
        SuperActivityToast.create(this, "刷新成功　^_^",
                SuperToast.Duration.SHORT, Style.getStyle(Style.ORANGE, SuperToast.Animations.FLYIN)).show();
    }
}
