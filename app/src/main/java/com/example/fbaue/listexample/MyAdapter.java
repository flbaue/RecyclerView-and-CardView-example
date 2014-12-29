package com.example.fbaue.listexample;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by fbaue on 12/29/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener {

    private int list_item_layout;
    private String[] content;
    private ListItem expanded;
    public MyAdapter(String[] content, int list_item_layout) {
        this.list_item_layout = list_item_layout;
        this.content = content;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ListItem l = (ListItem)LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(l);
        vh.listItem.setOnClickListener(MyAdapter.this);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.listItem.setIndex(content[position]);
    }

    @Override
    public int getItemCount() {
        return content.length;
    }

    @Override
    public void onClick(View view) {
        ListItem clicked = (ListItem)view;

        if(expanded == null){
            expanded = clicked;
            expanded.expand();
        } else if(expanded != clicked){
            expanded.hide();
            expanded = clicked;
            expanded.expand();
        } else {
            expanded.hide();
            expanded = null;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ListItem listItem;
        public ViewHolder(ListItem i){
            super(i);
            listItem = i;
        }
    }
}
