package Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.j.togetherapplication.Join2_Activity;
import com.example.j.togetherapplication.R;
import com.example.j.togetherapplication.chat1;
import com.example.j.togetherapplication.chat2;
import com.example.j.togetherapplication.chat3;


/**
 * Created by j on 2017/9/1.
 */

public class Friend_fragment extends Fragment{
    private TextView title;
    private LinearLayout badminton;
    private LinearLayout Anna;
    private LinearLayout Andrew;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend,container,false);
        return view;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        badminton=(LinearLayout)getActivity().findViewById(R.id.Badminton);
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(),chat1.class);
                startActivity(intent1);


            }
        });
        Andrew=(LinearLayout)getActivity().findViewById(R.id.Andrew_friend);
        Andrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(),chat2.class);
                startActivity(intent1);


            }
        });

        Anna=(LinearLayout)getActivity().findViewById(R.id.Anna_friend);
        Anna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(),chat3.class);
                startActivity(intent1);


            }
        });


    }
    public void init() {
        title=(TextView) getActivity().findViewById(R.id.text_c3);
        title.setText("好 友");
    }
}
