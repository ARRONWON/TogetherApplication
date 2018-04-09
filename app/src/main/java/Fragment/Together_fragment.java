package Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.j.togetherapplication.BobActivity;
import com.example.j.togetherapplication.EstablishActivity;
import com.example.j.togetherapplication.Publish_Comment;
import com.example.j.togetherapplication.R;
import com.example.j.togetherapplication.chat1;
import com.example.j.togetherapplication.chat4;

/**
 * Created by j on 2017/9/1.
 */

public class Together_fragment extends Fragment{

    private LinearLayout all;
    private LinearLayout ALL_Layout;
    private LinearLayout Main_Layout;
    private LinearLayout Fabuhuodong;
    private LinearLayout Bob;
    private LinearLayout Bill_layout;
    private ImageView Bill;
    private ImageView Join;
    private LinearLayout GrayBackground;
    private ImageView back;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_together,container,false);
        return view;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();


        Bob=(LinearLayout)getActivity().findViewById(R.id.Bob_activity);
        Bob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(),BobActivity.class);
                startActivity(intent1);
            }
        });


    }

    public void init() {
        GrayBackground= (LinearLayout) getActivity().findViewById(R.id.graybackground);
        ALL_Layout= (LinearLayout) getActivity().findViewById(R.id.all_layout);
        Main_Layout = (LinearLayout) getActivity().findViewById(R.id.main_layout);
        all = (LinearLayout) getActivity().findViewById(R.id.all_activity);
        Bill_layout=(LinearLayout) getActivity().findViewById(R.id.Bob_activity1);
        Bill=(ImageView)getActivity().findViewById(R.id.bill);
        Join=(ImageView)getActivity().findViewById(R.id.joinhuodong);
        Join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(),chat4.class);
                startActivity(intent1);

            }
        });
        Bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bill_layout.setVisibility(View.VISIBLE);
                GrayBackground.setVisibility(View.GONE);
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL_Layout.setVisibility(View.VISIBLE);
               Main_Layout.setVisibility(View.GONE);
            }
        });

        Fabuhuodong=(LinearLayout)getActivity().findViewById(R.id.fabuhuodong);
        Fabuhuodong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), EstablishActivity.class);
                startActivity(intent1);
            }
        });


    }



}
