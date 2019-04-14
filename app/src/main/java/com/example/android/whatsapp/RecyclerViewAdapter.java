package com.example.android.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<ChatsModel> mData;

    public RecyclerViewAdapter(Context mcontext, List<ChatsModel> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.chat_list_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.chatName.setText(mData.get(position).getName());
        holder.chatMessage.setText(mData.get(position).getMessage());
        holder.image.setImageResource(mData.get(position).getPhoto());
        holder.chatTime.setText(mData.get(position).getTime());

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView chatName;
        private TextView chatMessage;
        private ImageView image;
        private TextView chatTime;

        public MyViewHolder(View view) {
            super(view);

            chatName = (TextView) itemView.findViewById(R.id.chatName);
            chatMessage = (TextView) itemView.findViewById(R.id.chatMessage);
            image = (ImageView) itemView.findViewById(R.id.chat_img);
            chatTime = (TextView) itemView.findViewById(R.id.timestamp);

        }
    }
}
