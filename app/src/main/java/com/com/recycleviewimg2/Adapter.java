package com.com.recycleviewimg2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    private static final String TAG = "Adapter";
    private Context mContext;
    private List<Item> items = new ArrayList<>();


    public Adapter(Context mContext) {
        this.mContext = mContext;
    }

    public void additems(List<Item> items){
        this.items = items;
        notifyDataSetChanged();
    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item,parent,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.myViewHolder holder, int position) {
        holder.ivImg.setImageResource(items.get(position).getIvImg());
        holder.tvText.setText(items.get(position).getTvText());


       
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivImg;
        private TextView tvText;

        private static final String TAG = "myViewHolder";
        public myViewHolder(View itemView) {
            super(itemView);
            ivImg = itemView.findViewById(R.id.ivImg);
            tvText = itemView.findViewById(R.id.tvText);


            Log.d(TAG, "myViewHolder: "+ivImg);
        }


    }



}
