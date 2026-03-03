package com.example.register_form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtunm,edtpass;
    RadioButton rbtnfemale,rbtnmale;
    CheckBox chandroid,chreact,chasp;
    Button btnsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtunm = (EditText) findViewById(R.id.edtunm);
        edtpass = (EditText) findViewById(R.id.edtpass);
        rbtnfemale = (RadioButton) findViewById(R.id.rbtnfemale);
        rbtnmale = (RadioButton) findViewById(R.id.rbtnmale);
        chandroid = (CheckBox) findViewById(R.id.chandroid);
        chreact = (CheckBox) findViewById(R.id.chreact);
        chasp = (CheckBox) findViewById(R.id.chasp);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtunm.getText().toString();
                String pass = edtpass.getText().toString();
                String gender = "";
                if(rbtnfemale.isChecked())
                {
                    gender = rbtnfemale.getText().toString();
                }
                if(rbtnmale.isChecked())
                {
                    gender = rbtnmale.getText().toString();
                }

                String lang = "";
                if (chandroid.isChecked())
                {
                    lang += chandroid.getText().toString()+",";
                }
                if (chreact.isChecked())
                {
                    lang += chreact.getText().toString()+",";
                }
                if (chasp.isChecked())
                {
                    lang += chasp.getText().toString();
                }
                String res = name + "\n" + pass + "\n" + gender  + "\n" + lang;
                Toast.makeText(getApplicationContext(),res, Toast.LENGTH_SHORT).show();
            }
        });

    }
}