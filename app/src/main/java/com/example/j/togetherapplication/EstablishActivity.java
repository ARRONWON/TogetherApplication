package com.example.j.togetherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class EstablishActivity extends AppCompatActivity {
    private TextView title;
    private Spinner spinner_type;
    private LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_establish);
        init();
        showspinner();
        back=(LinearLayout)findViewById(R.id.title_l1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void init(){
        title=(TextView)findViewById(R.id.text_c1);
        title.setText("创建活动");

    }
    public void showspinner(){
        spinner_type = (Spinner)findViewById(R.id.spinner_type2);
        String[] type_list = new String[]{"   运 动 ","   桌 游 ","   ktv ","   旅 游 ","   其 他 "};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, type_list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_type.setAdapter(adapter);
    }
}
