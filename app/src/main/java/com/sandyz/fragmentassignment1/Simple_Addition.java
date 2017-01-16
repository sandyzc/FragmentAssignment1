package com.sandyz.fragmentassignment1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Simple_Addition extends Fragment {

    EditText editText;
    TextView textView;

    public Simple_Addition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // inflating the fragment layout into the view
        View view = inflater.inflate(R.layout.fragment_simple__addition, container, false);
        editText = (EditText)view.findViewById(R.id.edittext);
        textView = (TextView)view.findViewById(R.id.textview);
        Button button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(editText.getText());
            }
        });



        return view;
    }


}
