package com.example.j.togetherapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUPActivity2 extends AppCompatActivity {
    private TextView title;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        title=(TextView) findViewById(R.id.text_c1);
        title.setText("注册");
        reg=(Button)findViewById(R.id.SignUpButton2);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUPActivity2.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
