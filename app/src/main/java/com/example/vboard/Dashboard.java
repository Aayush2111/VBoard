package com.example.vboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    Button Create, Join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Create = findViewById(R.id.create);
        Join = findViewById(R.id.join);
    }


    public void logoutt(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();

    }


    public void createee(View view) {
        startActivity(new Intent(getApplicationContext(), CreateClass.class));
        finish();
    }

    public void joinnn(View view) {
        startActivity(new Intent(getApplicationContext(), JoinClass.class));
        finish();
    }
}
