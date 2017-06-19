package com.borcha.intentservisvezba.Services;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.borcha.intentservisvezba.Activitys.MainActivityActivity;

import java.util.Random;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    private  int rez;

    public MyIntentService() {
        super("MyIntentService");

    }


    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            for(int i=0;i<12;i++){
                SlucajniBroj();


                 Log.i("SlBr","Broj: " + String.valueOf(rez));

                try {
                    Thread.sleep(1200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

         }

    }

    private int SlucajniBroj() {
        Random slbro=new Random();
        rez=slbro.nextInt(2000);
       return rez;

    }


}
