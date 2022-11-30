package com.example.vboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateClass extends AppCompatActivity {

    //Variables

    TextInputLayout classname, classID;
    Button createclass;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class);

        classname = findViewById(R.id.className);
        classID = findViewById(R.id.classID);
        createclass = findViewById(R.id.joinnnnn);

        //Save data in firebase on button click
        createclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Users");

                if (!validateClassName() | !validateClassID()) {
                    return;
                }
                //Get all the values
                String classname1 = classname.getEditText().getText().toString();
                String classID1 = classID.getEditText().getText().toString();

                UserHelperClass helperClass = new UserHelperClass(classname1, classID1);

                reference.child(classID1).setValue(helperClass);

                Toast.makeText(CreateClass.this,"Class has been created Successfully, Join to continue!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Dashboard.class));


            }
        });
    }

    private Boolean validateClassName() {
        String val = classname.getEditText().getText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (val.isEmpty()) {
            classname.setError("Class name cannot be empty");
            return false;
        } else if (!val.matches(noWhiteSpace)) {
            classname.setError(("White Spaces are not allowed"));
            return false;

        } else {
            classname.setError(null);
            classname.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateClassID() {
        String val = classID.getEditText().getText().toString();

        if (val.isEmpty()) {
            classID.setError("Class ID cannot be empty");
            return false;

        } else {
            classID.setError(null);
            classID.setErrorEnabled(false);
            return true;
        }
    }
}

