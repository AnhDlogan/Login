package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_form);
    }

    public void btn_loginForm(View view) {
        startActivity(new Intent(getApplicationContext(),Login_Form.class));
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(),Register_Form.class));
    }
}