package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.jar.Attributes;

public class LoginWithEmail extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button Next;
    private FirebaseAuth auth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_with_email);
        Email=(EditText)findViewById(R.id.editText2);

        //get instance
        auth=FirebaseAuth.getInstance();
        Password=(EditText)findViewById(R.id.editText3);
        Next=(Button)findViewById(R.id.next);



        //go to Register page savaing Email and password
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=Email.getText().toString().trim();
                String password=Password.getText().toString().trim();

                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(getApplicationContext(),"Enter Email Address",Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(getApplicationContext(),"Enter password",Toast.LENGTH_LONG).show();
                    return;
                }
                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(LoginWithEmail.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(LoginWithEmail.this,"createWithEmilAndPassword:"+ task.isSuccessful(), Toast.LENGTH_LONG).show();
                        if (!task.isSuccessful())
                        {
                            Toast.makeText(LoginWithEmail.this,"auth Failed"+task.getException(),Toast.LENGTH_LONG).show();

                        }
                        else
                        {
                            Toast.makeText(LoginWithEmail.this,"Succesfull! go to next step", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(LoginWithEmail.this, Register.class));
                            finish();
                        }

                    }
                });
            }
        });






    }
}
