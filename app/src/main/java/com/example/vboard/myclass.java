package com.example.vboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class myclass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myclass);
    }

    public void uploadpdf(View view) {
        startActivity(new Intent(getApplicationContext(), upload.class));
        finish();
    }

    public void viewfile(View view) {
        startActivity(new Intent(getApplicationContext(),View_PDF_Files.class));
        finish();
    }
}