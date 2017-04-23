package com.example.shardul.jsonparsingusinggson;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shardul on 22-04-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    private List<Contact> list = new ArrayList<>();

    RecyclerAdapter(List<Contact> list){
        this.list = list;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);


        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        holder.Id.setText(Integer.toString(list.get(position).getId()));
        holder.Name.setText(list.get(position).getName());
        holder.Email.setText(list.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{

        TextView Id,Name,Email;

        public MyViewholder(View itemView) {
            super(itemView);
            Id = (TextView)itemView.findViewById(R.id.id);
            Name = (TextView)itemView.findViewById(R.id.name);
            Email = (TextView)itemView.findViewById(R.id.email);
        }
    }
}
