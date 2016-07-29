package com.just.myforum;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Bean> list;
    private LayoutInflater inflater;
    private Context context;



    public MyRecyclerAdapter(Context context, List<Bean> list) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_status, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        Picasso.with(context).load(list.get(position).getImgOne()).resize(200, 200).centerCrop().into(holder.foodPic1);
        Picasso.with(context).load(list.get(position).getImgTwo()).resize(200, 200).centerCrop().into(holder.foodPic2);
        Picasso.with(context).load(list.get(position).getPicThumb()).resize(100, 100).centerCrop().into(holder.usrPic);


        holder.usrName.setText(list.get(position).getUsrName());
        holder.time.setText(list.get(position).getTime());
        holder.text.setText(list.get(position).getText());


    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView foodPic1;
    ImageView foodPic2;
    ImageView usrPic;
    ImageView comment;

    TextView usrName;
    TextView time;
    TextView text;

    public MyViewHolder(View parent) {
        super(parent);
        foodPic1 = (ImageView) parent.findViewById(R.id.iv_image1);
        foodPic2 = (ImageView) parent.findViewById(R.id.iv_image2);
        usrPic = (ImageView) parent.findViewById(R.id.iv_avatar);

        comment = (ImageView) parent.findViewById(R.id.iv_comment_bottom);


        usrName = (TextView) parent.findViewById(R.id.tv_subhead);
        time = (TextView) parent.findViewById(R.id.tv_caption);
        text = (TextView) parent.findViewById(R.id.tv_content);
    }
}