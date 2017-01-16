package com.sandyz.fragmentassignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Simple_Addition frag = new Simple_Addition();


        frag.setArguments(getIntent().getExtras());


        getSupportFragmentManager().beginTransaction().
                add(R.id.activity_main,frag).commit();
    }
}
