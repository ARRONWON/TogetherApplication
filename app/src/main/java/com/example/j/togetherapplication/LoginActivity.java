package com.example.j.togetherapplication;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bean.*;


public class LoginActivity extends AppCompatActivity {
    private Button reg;
    private Button login;
    private EditText count;
    private EditText pwd;
    private List<User> userList;
    private List<User> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }

        reg= (Button) findViewById(R.id.SignUpButton);
        login= (Button) findViewById(R.id.LoginButton);
        count= (EditText) findViewById(R.id.zhanghaoEdit);
        pwd= (EditText) findViewById(R.id.mimaEdit);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=count.getText().toString().trim();
                String pass=pwd.getText().toString().trim();
                String username="123";
                String password="123";
                if(name.equals(username)&&pass.equals(password)){
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else {
                    int result=SqliteDB.getInstance(getApplicationContext()).Quer(pass,name);
                    if (result==1)
                    {
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else if (result==0){
                        Toast.makeText(LoginActivity.this,"用户名不存在！",Toast.LENGTH_SHORT).show();

                    }
                    else if(result==-1)
                    {
                        Toast.makeText(LoginActivity.this,"密码错误！",Toast.LENGTH_SHORT).show();
                    }
                }




            }
        });
    }



}
