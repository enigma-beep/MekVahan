package com.abhigyan.mekvahan.ui.notifications;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.abhigyan.mekvahan.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private ImageView flag1;
    private ImageView flag2;
    private ImageView flag3;
    private ImageView flag4;
    private ImageView flag5;
    private ImageView flag6;
    private ImageView flag7;
    private ImageView flag8;
    private ImageView flag9;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        flag1= root.findViewById(R.id.imageView14);
        flag2= root.findViewById(R.id.imageView13);
        flag3= root.findViewById(R.id.imageView12);
        flag4= root.findViewById(R.id.imageView15);
        flag5= root.findViewById(R.id.imageView16);
        flag6= root.findViewById(R.id.imageView17);
        flag7= root.findViewById(R.id.imageView18);
        flag8= root.findViewById(R.id.imageView19);
        flag9= root.findViewById(R.id.imageView20);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag1.setImageResource(R.drawable.greenflag);
            }
        }, 5000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag2.setImageResource(R.drawable.greenflag);
            }
        }, 9000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag3.setImageResource(R.drawable.greenflag);
            }
        }, 13000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag4.setImageResource(R.drawable.greenflag);
            }
        }, 25000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag5.setImageResource(R.drawable.greenflag);
            }
        }, 28000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag6.setImageResource(R.drawable.greenflag);
            }
        }, 31000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag7.setImageResource(R.drawable.greenflag);
            }
        }, 46000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag8.setImageResource(R.drawable.greenflag);
            }
        }, 47000);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                flag9.setImageResource(R.drawable.greenflag);
            }
        }, 49500);
        return root;
    }

}