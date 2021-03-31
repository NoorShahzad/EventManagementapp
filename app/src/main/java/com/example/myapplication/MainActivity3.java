package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button signup;
    EditText name,dob,email,gender,id,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name= (EditText) findViewById(R.id.name);
        dob= (EditText) findViewById(R.id.dob);
        email=(EditText) findViewById(R.id.emailorphone);
        gender= (EditText) findViewById(R.id.gender);
        id= (EditText) findViewById(R.id.idcardnumber);
        password= (EditText) findViewById(R.id.pass_word);
        signup= findViewById(R.id.sign_up2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.length()==0){
                    name.setError("Enter Name");
                }
                else if(dob.length()==0){
                    dob.setError("Enter Date Of Birth");
                }
                else if(email.length()==0){
                    email.setError("Enter Email Or Phone");
                }
                else if(gender.length()==0){
                    gender.setError("Enter Gender");
                }
                else if(id.length()==0){
                    id.setError("Enter ID Card Number");
                }
                else if(password.length()==0) {
                    password.setError("Enter Password");
                }

                }
        });
    }
}