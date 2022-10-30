package com.example.manager_user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    ImageView chooserImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        chooserImage = findViewById(R.id.chooser_Image);

        chooserImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooserUploadFile();
            }
        });

    }

    private void chooserUploadFile() {

        
    }
}