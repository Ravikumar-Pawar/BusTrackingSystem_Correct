package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu extends AppCompatActivity {
private Button location,history,feedback,userdetail,fueldetails,textmsg,logout;
private TextView GobackToBusno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //call setup method for id
        setup();




        // Go to Current location
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(menu.this,Location.class);
                startActivity(intent);
            }
        });

    //Go to fuel details page
        fueldetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, FuelDetails.class);
                startActivity(intent);
            }
        });

        //user details
        userdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this,UserDetails.class);
                startActivity(intent);
            }
        });

    //go back to select bus
        GobackToBusno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this, BusNumberChoices.class);
                startActivity(intent);
            }
        });

    // got to History page
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this,History.class);
                startActivity(intent);
            }
        });

    //goto feed back page
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this, FeedBack.class);
                startActivity(intent);
            }
        });

        //text msg
        textmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent= new Intent(menu.this,TextMessage.class);
             startActivity(intent);
            }
        });

        //logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this, LogoutActivity.class);
                startActivity(intent);
            }
        });

    }







    private void setup()
    {
        location=(Button)findViewById(R.id.locationbtn);
        history=(Button)findViewById(R.id.historybtn);
        userdetail=(Button)findViewById(R.id.userdetailbtn);
        fueldetails=(Button)findViewById(R.id.fueldetailbtn);
        textmsg=(Button)findViewById(R.id.textmsgbtn);
        feedback=(Button)findViewById(R.id.feedbackbtn);
        GobackToBusno=(TextView)findViewById(R.id.textView6);
        logout=(Button)findViewById(R.id.logout);
    }
}
