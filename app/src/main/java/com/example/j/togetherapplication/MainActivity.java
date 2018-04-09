package com.example.j.togetherapplication;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import Fragment.*;

public class MainActivity extends AppCompatActivity {
    private LinearLayout togetherlayout;
    private LinearLayout messagelayout;
    private LinearLayout friendlayout;
    private LinearLayout melayout;

    private FrameLayout textlayout;//内容layout

    private Together_fragment together_fragment;
    private message_fragment message_fragment;
    private me_fragment me_fragment;
    private Friend_fragment friend_fragment;

    private ImageView together;
    private ImageView me;
    private ImageView message;
    private ImageView friend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
        showview();
    }

    private void showview() {
        togetherlayout = (LinearLayout) findViewById(R.id.together);
        messagelayout = (LinearLayout) findViewById(R.id.message);
        melayout = (LinearLayout) findViewById(R.id.me);
        friendlayout=(LinearLayout)findViewById(R.id.friend);

        textlayout = (FrameLayout) findViewById(R.id.text_context);

        me = (ImageView)findViewById(R.id.imageView_me);
        together = (ImageView)findViewById(R.id.imageView_tog);
        friend = (ImageView)findViewById(R.id.imageView_friend);
        message=(ImageView) findViewById(R.id.imageView_msg);


        togetherlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_togetherfragment();
                together.setImageResource(R.drawable.icon_together1);
                friend.setImageResource(R.drawable.icon_friend);
                message.setImageResource(R.drawable.icon_message);
                me.setImageResource(R.drawable.icon_wo);
            }
        });
        friendlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_friendfragment();
                together.setImageResource(R.drawable.icon_together);
                friend.setImageResource(R.drawable.icon_friend1);
                message.setImageResource(R.drawable.icon_message);
                me.setImageResource(R.drawable.icon_wo);
            }
        });
        melayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_mefragment();
                together.setImageResource(R.drawable.icon_together);
                friend.setImageResource(R.drawable.icon_friend);
                message.setImageResource(R.drawable.icon_message);
                me.setImageResource(R.drawable.icon_wo1);
            }
        });
        messagelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_messagefragment();
                together.setImageResource(R.drawable.icon_together);
                friend.setImageResource(R.drawable.icon_friend);
                message.setImageResource(R.drawable.icon_message1);
                me.setImageResource(R.drawable.icon_wo);
            }
        });


        check_togetherfragment();                                   //默认显示第一个Fragment

    }
    private void check_togetherfragment() {
        together_fragment = new Together_fragment();
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.text_context,together_fragment);
        fragmentTransaction.commit();
    }

    private void check_friendfragment() {
        friend_fragment = new Friend_fragment();
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.text_context, friend_fragment);
        fragmentTransaction.commit();
    }

    private void check_mefragment() {
        me_fragment = new me_fragment();
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.text_context, me_fragment);
        fragmentTransaction.commit();

    }
    private void check_messagefragment() {
        message_fragment = new message_fragment();
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.text_context, message_fragment);
        fragmentTransaction.commit();

    }

}

