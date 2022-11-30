package com.example.vboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class JoinClass extends AppCompatActivity {

    Button Join;
    TextInputLayout classname, classID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_class);

        classname = findViewById(R.id.className);
        classID = findViewById(R.id.classID);

        Join = findViewById(R.id.joinnnnn);

        Join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateClassName() | !validateClassID()) {
                    return;
                }
                else {
                    isuser();
                }

            }

            private void isuser() {

                String UserEnteredClassname = classname.getEditText().getText().toString().trim();
                String UserEnteredClassID = classID.getEditText().getText().toString().trim();

                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");

                Query checkUser = reference.orderByChild("classID").equalTo(UserEnteredClassname);

                checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        if(snapshot.exists()) {

                            classID.setError(null);
                            classID.setErrorEnabled(false);

                            String passwordfromDB = snapshot.child(UserEnteredClassname).child("classID").getValue(String.class);

                            if(passwordfromDB.equals(UserEnteredClassID)) {

                                classID.setError(null);
                                classID.setErrorEnabled(false);

                                String nameFromDB = snapshot.child(UserEnteredClassname).child("classname").getValue(String.class);

                                Toast.makeText(JoinClass.this,"You have entered in your class successfully",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), UserProfile.class);
                                intent.putExtra("classname", nameFromDB);
                                intent.putExtra("classID", passwordfromDB);



                                startActivity(intent);
                            }
                            else {
                                classname.setError("This class name doesn't exist");
                                classname.requestFocus();
                                classID.setError("This class ID doesn't exist");
                                classID.requestFocus();
                            }
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

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