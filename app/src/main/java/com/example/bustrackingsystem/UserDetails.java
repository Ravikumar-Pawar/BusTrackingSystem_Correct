package com.example.bustrackingsystem;

import android.app.Activity;
import android.content.Intent;
import android.provider.DocumentsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Tag;

import java.util.ArrayList;
import java.util.List;


public class UserDetails extends AppCompatActivity {
    //public static final String TAG="UserDetails";
    private Button Backbtntomenu;
    private ListView listView;
    private TextView information;
        FirebaseDatabase database;
        FirebaseAuth firebaseAuth;
        DatabaseReference myRef;
        ArrayList<Users>arrayList= new ArrayList<>();
        ArrayAdapter<Users>arrayAdapter;
        Users users;
        FirebaseUser user;
        String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        user=FirebaseAuth.getInstance().getCurrentUser();
        uid=user.getUid();
        users=new Users();
        database=FirebaseDatabase.getInstance();
        myRef=database.getReference();
        //myRef=database.getReference(firebaseAuth.getUid());
        myRef = FirebaseDatabase.getInstance().getReference();
        setup();
        final Users[] users = {new Users()};
        arrayAdapter=new ArrayAdapter<Users>(this,android.R.layout.simple_list_item_1,arrayList);
        ValueEventListener valueEventListener = myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()) {

                    users[0] = ds.getValue(Users.class);
                    arrayList.add(users[0]);
                }
                listView.setAdapter(arrayAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(UserDetails.this,"Unable to Fetch the Information from the database"+databaseError,Toast.LENGTH_LONG).show();

            }
        });


        Backbtntomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserDetails.this, menu.class));
            }
        });


        //display the data


    }
    public void setup(){

        Backbtntomenu=(Button)findViewById(R.id.back);
        listView=(ListView)findViewById(R.id.listview);
        information=(TextView)findViewById(R.id.tvUserInfo);

    }

}