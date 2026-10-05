package com.example.a051026_itsbbmk_menupunto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class division extends Fragment implements View.OnClickListener {
    View view;
    Button btAns;
    EditText DTA1, DTA2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_division, container, false);
        btAns = view.findViewById(R.id.ansOp);
        btAns.setOnClickListener(this);
        DTA1 = view.findViewById(R.id.data1);
        DTA2 = view.findViewById(R.id.data2);
        return view;
    }

    @Override
    public void onClick(View v) {
        String str = ((Button)v).getText().toString();
        if(str.equals("Operar")){
            float Ans;
            operaciones object = new operaciones();
            int dtaU = Integer.parseInt(DTA1.getText().toString());
            int dtaD = Integer.parseInt(DTA2.getText().toString());
            object.setDta1(dtaU);
            object.setDta2(dtaD);
            Ans = object.OperarDivision(dtaU, dtaD);
            Toast.makeText(getContext(), Float.toString(Ans), Toast.LENGTH_LONG).show();
        }
    }
}