package com.example.dariofernando.broadcastreceiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dariofernando.broadcastreceiver.receivers.AlarmReceiver;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button start, stop;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btn1);
        stop = (Button) findViewById(R.id.btn2);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        Intent intent = new Intent(AlarmReceiver.ACTION);
        pendingIntent = PendingIntent.getBroadcast(this, 102, intent
                , PendingIntent.FLAG_UPDATE_CURRENT);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime()+5000l
                        ,60000,pendingIntent);
                break;
            case R.id.btn2:
                alarmManager.cancel(pendingIntent);
                break;
        }

    }
}
