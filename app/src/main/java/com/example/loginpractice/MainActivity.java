package com.example.loginpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String def_username = "b0742006", def_password = "12345678";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText user;
    EditText password;
    TextView mainText, subText;

    public void loginCheck(View v) {
        user = (EditText) findViewById(R.id.editTextTextPersonName);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        mainText = (TextView) findViewById(R.id.textView5);
        subText = (TextView) findViewById(R.id.textView4);
        if(user.getText().toString().equals(def_username))
        {
            subText.setText("user is correct.");
            if(password.getText().toString().equals(def_password))
                mainText.setText("SUCCESS");
            else
                mainText.setText("PASSWORD ERROR!");
        }
        else
            mainText.setText("USERNAME ERROR!");
    }
}