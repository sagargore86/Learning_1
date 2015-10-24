package com.openup.learning_1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class Intent_Service extends IntentService {

    private static final String TAG = "Intent_service";

    public Intent_Service(){
        super("Intent_service");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.i(TAG, "Intent Service is started");
    }

}
