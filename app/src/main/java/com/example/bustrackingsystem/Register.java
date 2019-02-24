package com.example.bustrackingsystem;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ResourceBundle;


public class Register extends AppCompatActivity {
    private EditText txtName; //Name
    private EditText txtAge; //Age
    private EditText txtEmail; //Email
    private EditText textPhone;//phone
    private EditText textAddress;// Address
    private EditText textTrack;//track
    private Button btnAddData; //Add To Firebase Button
    FirebaseAuth firebaseAuth;
    FirebaseStorage firebaseStorage;
    private FirebaseDatabase database; //Database Reference
    private static final String TAG = "Register";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        database = FirebaseDatabase.getInstance(); //Get Database Instance
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseStorage=FirebaseStorage.getInstance();

        txtName = (EditText) findViewById(R.id.txtName); //Find Reference To Name TextBox
        txtAge = (EditText) findViewById(R.id.txtAge); //Find Reference To Age Text Box
        txtEmail = (EditText) findViewById(R.id.txtEmail); //Find Reference To Email Text Box
        textPhone=(EditText)findViewById(R.id.editText6);
        textAddress=(EditText)findViewById(R.id.address);
        btnAddData = (Button) findViewById(R.id.btnAddToFirebase); //Find Reference To Add To Firebase Button
        textTrack=(EditText) findViewById(R.id.track);
       // Users users=new Users()
        //On Button Click
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = txtName.getText().toString();
                String Age = txtAge.getText().toString();
                String Email = txtEmail.getText().toString();
                String Phone=textPhone.getText().toString().trim();
                String Address=textAddress.getText().toString().trim();
                String Track=textTrack.getText().toString().trim();

                if (Name.isEmpty()|| Age.isEmpty()||Email.isEmpty()|| Phone.isEmpty()||Phone.isEmpty()||Track.isEmpty())
                {
                    Toast.makeText(Register.this,"Enter correct details\n Required Fields Can't be Empty",Toast.LENGTH_LONG).show();
                }
                else {

                    DatabaseReference refUsers=database.getReference(firebaseAuth.getUid());
                   // DatabaseReference refUsers = database.getReference().child(FirebaseAuth.getUid).push(); //Adds a new child under "Users" key. Push Function adds a unique id.
                    Users users=new Users();
                    users.setName(Name);
                    users.setContNO(Phone);
                    users.setEmail(Email);
                    users.setTrack(Track);
                    users.setAge(Age);
                    users.setPostal(Address);
                    refUsers.setValue(users);
                    Intent intent = new Intent(Register.this,menu.class);
                    startActivity(intent);
                    Toast.makeText(Register.this,"Successfully Added data into database!",Toast.LENGTH_LONG).show();
                    Toast.makeText(Register.this,"user information"+txtEmail+"\n"+textPhone,Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}

