package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class FeedBack extends AppCompatActivity {
private Button feedback;
private EditText writeHere;
    FirebaseAuth firebaseAuth;
    FirebaseStorage firebaseStorage;
    private FirebaseDatabase database; //Database Reference
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        database=FirebaseDatabase.getInstance();

        database = FirebaseDatabase.getInstance(); //Get Database Instance
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseStorage=FirebaseStorage.getInstance();
        //call setup
        setup();
        //submit feedback
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DatabaseReference refUsers=database.getReference(firebaseAuth.getUid());
                String feed=writeHere.getText().toString().trim();
                Users users= new Users();

                if (feed.isEmpty()){
                    Toast.makeText(FeedBack.this ,"Please Provide Correct Feed Back!", Toast.LENGTH_LONG).show();

                }
                else {
                    DatabaseReference refUsers=database.getReference("feedback");
                    users.setFeedback(feed);
                    refUsers.setValue(users);
                Intent intent= new Intent(FeedBack.this, menu.class);
                startActivity(intent);
                    Toast.makeText(FeedBack.this ,"Thank You For Your FEED BACk\n"+"We will provide Solution!", Toast.LENGTH_LONG).show();

                }
            }
        });
    }








    private  void setup()
    {
        feedback=(Button)findViewById(R.id.feedbackbtn);
        writeHere=(EditText)findViewById(R.id.writeHere);
    }
}
