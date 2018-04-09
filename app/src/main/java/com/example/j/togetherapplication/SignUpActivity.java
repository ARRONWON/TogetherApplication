package com.example.j.togetherapplication;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import bean.SqliteDB;
import bean.User;


public class SignUpActivity extends AppCompatActivity {
    private Button reg1;
    private EditText count;
    private EditText pwd;
    private TextView title;
    private LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        reg1= (Button) findViewById(R.id.SignUpButton1);
        count= (EditText) findViewById(R.id.zhucezhanghaoEdit);
        pwd= (EditText) findViewById(R.id.zhucemimaEdit);
        back=(LinearLayout) findViewById(R.id.title_l1);

        title=(TextView) findViewById(R.id.text_c1);
        title.setText("注册");

        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=count.getText().toString().trim();
                String pass=pwd.getText().toString().trim();

                User user=new User();
                user.setUsername(name);
                user.setUserpwd(pass);

                int result= SqliteDB.getInstance(getApplicationContext()).saveUser(user);
                if (result==1){
                    Toast.makeText(SignUpActivity.this,"注册成功！",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(SignUpActivity.this,SignUPActivity2.class);
                    startActivity(intent);
                }else  if (result==-1)
                {
                    Toast.makeText(SignUpActivity.this,"用户名已存在！",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SignUpActivity.this,"！",Toast.LENGTH_SHORT).show();
                }

            }

        });
    }

}
