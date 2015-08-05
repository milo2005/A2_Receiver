package com.example.dariofernando.broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by DarioFernando on 27/07/2015.
 */
public class AlarmReceiver extends BroadcastReceiver{

    public static final String ACTION="com.example.dariofernando.broadcastreceiver.accion";

    @Override
    public void onReceive(Context context, Intent intent) {
        SimpleDateFormat format =new SimpleDateFormat("HH:mm:ss"
                , Locale.getDefault());

        Calendar calendar = Calendar.getInstance();


        Log.i("receiver","Entro a las "+format.format(calendar.getTime()));
    }
}
