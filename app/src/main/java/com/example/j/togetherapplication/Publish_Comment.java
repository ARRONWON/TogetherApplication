package com.example.j.togetherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Publish_Comment extends AppCompatActivity {
    private TextView title;
    private LinearLayout back;
    private TextView title2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish__comment);
        title=(TextView)findViewById(R.id.text_c1);
        title.setText("发表评价");
        title2=(TextView)findViewById(R.id.text_r1);
        title2.setText("发布");
        title2.setTextSize(15);

        back=(LinearLayout) findViewById(R.id.title_l1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
