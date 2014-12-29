package com.example.fbaue.listexample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by fbaue on 12/29/14.
 */
public class ListItem extends android.support.v7.widget.CardView {
    public ListItem(Context context) {
        super(context);
    }

    public ListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setIndex(String s) {
        TextView textViewHead = (TextView)findViewById(R.id.list_item_head_text);
        textViewHead.setText(textViewHead.getText() + " " + s);

        TextView textViewBody = (TextView)findViewById(R.id.list_item_body_text);
        textViewBody.setText(textViewBody.getText() + " " + s);
    }

    public void expand(){
        findViewById(R.id.list_item_body).setVisibility(VISIBLE);
    }

    public void hide(){
        findViewById(R.id.list_item_body).setVisibility(GONE);
    }
}
