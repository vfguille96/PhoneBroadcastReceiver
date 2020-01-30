package com.vfguille.phonecallbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.logging.Logger;

public class PhoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("PhoneBroadcastReceiver", "Intent recibido");
        Bundle bundle = intent.getExtras();
        if (bundle != null){
            String state = bundle.getString(TelephonyManager.EXTRA_STATE);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNumber = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d("PhoneBroadcastReceiver", "TELEFONO: " + phoneNumber);
            }
        }
    }
}
