package com.example.chennuo.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chennuo on 2016/5/19.
 */
public class FragmentOne extends Fragment implements View.OnClickListener {


    private FragmentManager fManager;
    private FragmentTransaction fTransaction;

    private Button btnToFragmentTwo;

    public FragmentOne() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fManager = getFragmentManager();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentone_layout,container,false);
        btnToFragmentTwo = (Button) view.findViewById(R.id.toFragmentTwo);
        btnToFragmentTwo.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toFragmentTwo:
                fTransaction = fManager.beginTransaction();
                fTransaction.replace(R.id.id_content,new FragmentTwo(),"TWO");
                fTransaction.addToBackStack(null);
                fTransaction.commit();
                break;
        }
    }
}
