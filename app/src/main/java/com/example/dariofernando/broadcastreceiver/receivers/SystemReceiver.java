package com.example.dariofernando.broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by DarioFernando on 27/07/2015.
 */
public class SystemReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("receiverAlerta", "El estado del modo avion ha cambiado");
    }

}
