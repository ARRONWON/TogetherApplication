package com.example.j.togetherapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Join2_Activity extends AppCompatActivity {
    private TextView title;
    private LinearLayout back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join2_);
        title=(TextView)findViewById(R.id.text_c1);
        title.setText("已参与");
        back=(LinearLayout) findViewById(R.id.title_l1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });





    }







}
