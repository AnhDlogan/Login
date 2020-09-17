package com.example.login;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class Login_Form extends Activity {
    EditText etUsername,etPassword;
    Button btSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        etUsername = findViewById(R.id.InputAc);
        etPassword = findViewById(R.id.InputPw);
        btSignin = findViewById(R.id.ButtonSignIn);

        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("Admin") &&
                        etPassword.getText().toString().equals("Admin")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            Login_Form.this
                    );
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Đăng nhập thành công !!!");
                    builder.setMessage("Wellcome to Summonerift...");

                    builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Sai Tài khoản hoặc Mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
