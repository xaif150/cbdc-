package com.cbdc.instagram_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button log = (Button) findViewById(R.id.btn_sign);
    EditText email = (EditText) findViewById(R.id.email);
String emaill= email.toString().trim();
    EditText pass = (EditText) findViewById(R.id.pass);
    String passs= pass.toString().trim();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.setOnClickListener(new onClickListener(){
            @Override
            public void onClick(View view) {

            }

            public void onclick(View view){
    }

       });
        }

    @Override
    public void onClick(View view) {

    }

    private abstract class onClickListener implements View.OnClickListener {
    }
}
