package com.example.chennuo.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

//    private Button btnToFragmentOne;

    private FragmentManager fManager;
    private FragmentTransaction fTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();

        fManager = getSupportFragmentManager();
        fTransaction = fManager.beginTransaction();
        fTransaction.add(R.id.id_content,new FragmentOne(),"ONE");
        fTransaction.commit();
    }

//    public void initView(){
//        btnToFragmentOne = (Button) findViewById(R.id.toFragmentOne);
//        btnToFragmentOne.setOnClickListener(this);
//    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.toFragmentOne:
//                fTransaction.add(R.id.id_content,new FragmentOne(),"ONE");
//                fTransaction.commit();
//                break;
//            default:
//                break;
//        }
//    }
}
