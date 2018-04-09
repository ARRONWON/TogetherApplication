package com.example.j.togetherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class chat2 extends AppCompatActivity {
    private LinearLayout mymessage;
    private EditText sendmessage;
    private ImageView send;
    private TextView title;
    private TextView textView;
    private LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);
        init();
        mymessage=(LinearLayout) findViewById(R.id.MyMessage2);
        sendmessage=(EditText)findViewById(R.id.SendMessage2);
        send=(ImageView) findViewById(R.id.send2);





        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView=(TextView) findViewById(R.id.TextView2);
                String message=sendmessage.getText().toString().trim();
                textView.setText(message);
                mymessage.setVisibility(View.VISIBLE);
                sendmessage.setText("");


            }
        });
        back=(LinearLayout) findViewById(R.id.title_l1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void init(){
        title=(TextView)findViewById(R.id.text_c1);
        title.setText("Andrew");
    }
}
