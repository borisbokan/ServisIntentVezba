package com.borcha.intentservisvezba.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.borcha.intentservisvezba.R;
import com.borcha.intentservisvezba.Services.MyIntentService;

public class MainActivityActivity extends AppCompatActivity {



    Button btnStartujServis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);



    }

    public void startServis(View v){

        Intent inServis=new Intent(this,MyIntentService.class);
         startService(inServis);

    }
}
