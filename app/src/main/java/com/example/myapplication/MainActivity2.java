package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button log_in;
    EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        email=(EditText) findViewById(R.id.emailornumber) ;
        password= (EditText) findViewById(R.id.password2);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.length()==0){
                    email.setError("Enter Email Or Phone");
                }
                else if(password.length()==0){
                    password.setError("Enter Password");
                }
            }
        });
        setContentView(R.layout.activity_main2);
    }
}