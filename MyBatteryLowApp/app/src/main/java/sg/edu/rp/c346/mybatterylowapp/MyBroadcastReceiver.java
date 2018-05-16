package sg.edu.rp.c346.mybatterylowapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 16046544 on 14/8/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context,"Low Battery", Toast.LENGTH_LONG);
        my_toast.show();
    }
}