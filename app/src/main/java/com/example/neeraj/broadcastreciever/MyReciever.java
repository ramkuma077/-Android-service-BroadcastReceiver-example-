package com.example.neeraj.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

/**
 * Created by neeraj on 14-04-2017.
 */

public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
      /*  int val=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1); */
        int lavel=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
        int scale=intent.getIntExtra(BatteryManager.EXTRA_SCALE,-1);
        float batterypct=lavel /(float)scale;


        Toast.makeText(context, ""+batterypct, Toast.LENGTH_SHORT).show();
       /* intent.getExtras().getStringArrayList("key");
        Toast.makeText(context, ""+intent, Toast.LENGTH_SHORT).show(); */

       /* String val=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        Toast.makeText(context, ""+val, Toast.LENGTH_SHORT).show();
        if (val.equalsIgnoreCase("Ringing")){
            String num=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            Toast.makeText(context, "number", Toast.LENGTH_SHORT).show();

        }*/

    }
}
