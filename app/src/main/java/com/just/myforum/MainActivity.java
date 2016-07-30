package com.just.myforum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MyRecyclerAdapter recyclerAdapter;

    private List<Bean> mList;

    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        mList = new ArrayList<>();
        mContext = this;

        Bean bean0 = new Bean(R.drawable.logo_0, "eccolala", "2016.7.1", R.drawable.f00, "开玩笑，这道菜好吃到没朋友，好吃到让邻居大妈都爱上你，绝对是居家旅行必备，我的心愿是。。世界和平", R.drawable.f01);
        mList.add(bean0);

        Bean bean1 = new Bean(R.drawable.logo_1, "爱尔兰的风车", "2016.6.28", R.drawable.f10, "你以为我还是来秀美食吗？开玩笑，当然是错的了，因为这道菜我都不知道是什么，另外，谁用我的手机发的动态，神经病啊？我不要面子的啊？", R.drawable.f11);
        mList.add(bean1);

        Bean bean2 = new Bean(R.drawable.logo_2, "Baby", "2016.6.27", R.drawable.f20, "我记得初中第一次吃这道菜时，认为这是一件很酷的事情，直到我长大后我依然爱它，那么，你懂得。。。", R.drawable.f21);
        mList.add(bean2);

        Bean bean3 = new Bean(R.drawable.logo_3, "BilieJiao", "2016.6.24", R.drawable.f30, "为了生活东奔西跑，卖力表演，迎来很多工作机会，今天为我爱的人做了这道虾仁卷饼，所谓的惊喜就要给的直接、真诚，像叙旧时摆好的棋谱，像微风下温热的黄酒", R.drawable.f31);
        mList.add(bean3);

        Bean bean4 = new Bean(R.drawable.logo_4, "博", "2016.6.23", R.drawable.f40, "自从吃了这道水煮肉，收入明显上升，知名度勉强翻倍，工作邀约不断，膨胀到胸肌出现，有些朋友在路上都能认出我了，个别7岁以下的还会叫我爸爸。。。", R.drawable.f41);
        mList.add(bean4);

        Bean bean5 = new Bean(R.drawable.logo_5, "流潋紫", "2016.6.20", R.drawable.f50, "麻婆豆腐，简单直接，美味难挡", R.drawable.f51);
        mList.add(bean5);

        Bean bean6 = new Bean(R.drawable.logo_6, "代码家", "2016.6.19", R.drawable.f60, "如果你是川菜的粉丝，一定要尝尝这款蚂蚁上树", R.drawable.f61);
        mList.add(bean6);

        Bean bean7 = new Bean(R.drawable.logo_7, "DDong", "2016.6.18", R.drawable.f70, "我爱吃香辣蟹这件事，就像西门庆爱吃腰子，法海爱吃蛇皮一样，准确的说，螃蟹这种东西，只要看到我，它就已经死了，所以这道菜看似突兀，却又在情理之中", R.drawable.f71);
        mList.add(bean7);

        Bean bean8 = new Bean(R.drawable.logo_8, "搁浅", "2016.6.17", R.drawable.f80, "今天做了宫保鸡丁，孩子很爱吃，希望他可以健康快乐的长大", R.drawable.f81);
        mList.add(bean8);

        Bean bean9 = new Bean(R.drawable.logo_9, "寰博", "2016.6.15", R.drawable.f90, "朋友聚会吃酱蹄子什么的最爽了", R.drawable.f91);
        mList.add(bean9);

        recyclerAdapter = new MyRecyclerAdapter(MainActivity.this, mList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);





    }

    public void comment(View view) {
        startActivity(new Intent(this, CommentActivity.class));
    }
}
