package Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.j.togetherapplication.Join1_Activity;
import com.example.j.togetherapplication.Join2_Activity;
import com.example.j.togetherapplication.Publish1_Activity;
import com.example.j.togetherapplication.Publish2_Activity;
import com.example.j.togetherapplication.Publish_Comment;
import com.example.j.togetherapplication.R;


/**
 * Created by j on 2017/9/1.
 */

public class me_fragment extends Fragment {
    private LinearLayout join_message;
    private LinearLayout publish_message;
    private LinearLayout join_layout;
    private LinearLayout publish_layout;
    private LinearLayout JoinSecondLine;
    private LinearLayout JoinThirdLine;

    private LinearLayout PublishSecondLine;
    private LinearLayout PublishFirstLine;
    private LinearLayout add_comment;




    private ImageView image_join;
    private ImageView image_publish;
    private TextView title;



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me,container,false);
        return view;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        jump();
    }


    public void init() {
        join_message= (LinearLayout) getActivity().findViewById(R.id.JOIN);
        publish_message = (LinearLayout) getActivity().findViewById(R.id.PUBLISH);
        join_layout = (LinearLayout) getActivity(). findViewById(R.id.join_layout);
        publish_layout = (LinearLayout) getActivity(). findViewById(R.id.publish_layout);
        image_join=(ImageView) getActivity().findViewById(R.id.imageView_join);
        image_publish=(ImageView) getActivity().findViewById(R.id.imageView_publish);

        title=(TextView) getActivity().findViewById(R.id.text_c3);
        title.setText("我");

        join_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                join_layout.setVisibility(View.VISIBLE);
                publish_layout.setVisibility(View.GONE);
                image_join.setImageResource(R.drawable.icon_yicanyu1);
                image_publish.setImageResource(R.drawable.icon_yifabu);
            }
        });

        publish_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                publish_layout.setVisibility(View.VISIBLE);
                join_layout.setVisibility(View.GONE);
                image_join.setImageResource(R.drawable.icon_yicanyu);
                image_publish.setImageResource(R.drawable.icon_yifabu1);
            }
        });
    }

    public void jump(){
        add_comment=(LinearLayout)getActivity().findViewById(R.id.join_fistline);
        JoinSecondLine=(LinearLayout)getActivity().findViewById(R.id.join_secondline);

        PublishSecondLine=(LinearLayout)getActivity().findViewById(R.id.publish_secondline);
        PublishFirstLine=(LinearLayout)getActivity().findViewById(R.id.publish_fistline);
        JoinThirdLine=(LinearLayout)getActivity().findViewById(R.id.join_thirdline);

        JoinThirdLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), Join1_Activity.class);
                startActivity(intent1);

            }
        });
        add_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), Publish_Comment.class);
                startActivity(intent1);

            }
        });

        JoinSecondLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), Join2_Activity.class);
                startActivity(intent1);

            }
        });

        PublishFirstLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), Publish1_Activity.class);
                startActivity(intent1);
            }
        });
        PublishSecondLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(getContext(), Publish2_Activity.class);
                startActivity(intent1);
            }
        });
    }

}


