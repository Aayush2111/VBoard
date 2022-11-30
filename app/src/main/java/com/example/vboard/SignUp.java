package com.example.vboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextInputLayout name, Username, email, phone, password;
    TextView logo, other;
    Button registeuser, Gobacklogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        Gobacklogin = (Button) findViewById(R.id.gobacklogin);
        Gobacklogin.setOnClickListener(this);

        registeuser = findViewById(R.id.joinnnnn);

        name = (TextInputLayout) findViewById(R.id.name1);
        Username = (TextInputLayout) findViewById(R.id.username1);
        email = (TextInputLayout) findViewById(R.id.email1);
        phone = (TextInputLayout) findViewById(R.id.phoneNo1);
        password = (TextInputLayout) findViewById(R.id.password1);
        progressBar = findViewById(R.id.progressBar2);

     /*   if(mAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(),Dashboard.class));
            finish();
        }   */



        mAuth = FirebaseAuth.getInstance();

    }
    public void Test(View view) {
        String email0 = email.getEditText().getText().toString().trim();
        String password0 = password.getEditText().getText().toString().trim();
        String username0 = Username.getEditText().getText().toString().trim();
        String phone0 = phone.getEditText().getText().toString().trim();
        String name0 = name.getEditText().getText().toString().trim();

        if(TextUtils.isEmpty(email0)) {
            email.setError("Email is Required");
            return;
        }
        if(TextUtils.isEmpty(username0)) {
            Username.setError("Username is Required");
            return;
        }
        if(TextUtils.isEmpty(phone0)) {
            phone.setError("Phone number is Required");
            return;
        }
        if(TextUtils.isEmpty(name0)) {
            name.setError("Name is Required");
            return;
        }

        if(TextUtils.isEmpty(password0)) {
            password.setError("Password is Required");
            return;
        }

        if(password0.length() < 6) {
            password.setError("Password must be >= 6 Char");
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        //Register the user in firebase

        mAuth.createUserWithEmailAndPassword(email0, password0).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {

                    Toast.makeText(SignUp.this,"User created, Sign In to continue",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),Login.class));
                }
                else {
                    Toast.makeText(SignUp.this,"Error! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gobacklogin:
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                break;
        }
    }
}