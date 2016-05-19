package com.example.chennuo.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chennuo on 2016/5/19.
 */
public class FragmentTwo extends Fragment {

    private FragmentManager fManager;
    private FragmentTransaction fTransaction;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fManager = getFragmentManager();
        fTransaction = fManager.beginTransaction();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenttwo_layout,container,false);
        return view;
    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        fTransaction.remove(this);
//        fTransaction.show(this);
//        fTransaction.commit();
//    }
}
