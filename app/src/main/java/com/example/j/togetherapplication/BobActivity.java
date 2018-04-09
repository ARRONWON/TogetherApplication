package com.example.j.togetherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BobActivity extends AppCompatActivity {
    private LinearLayout join_message;
    private LinearLayout publish_message;
    private LinearLayout join_layout;
    private LinearLayout publish_layout;
    private ImageView image_join;
    private ImageView image_publish;

    private TextView title;
    private LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bob);
        init();
        back=(LinearLayout)findViewById(R.id.title_l1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void init(){
        join_message= (LinearLayout)findViewById(R.id.JOINofbill);
        publish_message = (LinearLayout)findViewById(R.id.PUBLISHofBill);
        join_layout = (LinearLayout)findViewById(R.id.intro_joinofBill);
        publish_layout = (LinearLayout)findViewById(R.id.intro_publishofBill);
        image_join=(ImageView)findViewById(R.id.imageView_joinofBill);
        image_publish=(ImageView)findViewById(R.id.imageView_publishofbill);
        join_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                join_layout.setVisibility(View.VISIBLE);
                publish_layout.setVisibility(View.GONE);
                image_join.setImageResource(R.drawable.icon_yicanyu1);
                image_publish.setImageResource(R.drawable.icon_yifabu);
            }
        });

        publish_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                publish_layout.setVisibility(View.VISIBLE);
                join_layout.setVisibility(View.GONE);
                image_join.setImageResource(R.drawable.icon_yicanyu);
                image_publish.setImageResource(R.drawable.icon_yifabu1);
            }
        });
        title=(TextView)findViewById(R.id.text_c1);
        title.setText("详细资料");

    }
}
