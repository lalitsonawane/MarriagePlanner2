package com.lalitsonawane.admin.marriageplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //EditText bride, groom;
    //Button register;

    private static final String TAG = "NewPostActivity";
    private static final String REQUIRED = "Required";

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    EditText bride = (EditText) findViewById(R.id.editText5);
    EditText groom = (EditText) findViewById(R.id.editText6);
    Button register = (Button) findViewById(R.id.register);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database

        myRef.setValue("Hello, World!");


        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myRef.child("Couple").child(String.valueOf(bride)).child(String.valueOf(groom));


            }
        });

    }

}


