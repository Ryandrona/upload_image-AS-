package com.example.manager_user.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.manager_user.HomeActivity;
import com.example.manager_user.R;

public class SignInActivity extends AppCompatActivity {
     Button btn_SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_SignIn = findViewById(R.id.btn_signin);

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
               startActivity(intent);
               finish();
            }
        });

    }
}