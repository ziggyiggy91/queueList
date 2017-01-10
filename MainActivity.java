package com.example.bestbuy.cameratest;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private boolean toggle = false;

    @Override
         protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(TAG,"inside onCreate MainActivity");
            setContentView(R.layout.activity_main);
            //Resources res = getResources();
            //Drawable round =  res.getDrawable(R.drawable.camera_button);
            Button mCamera = (Button)findViewById(R.id.CamButton);
            //mCamera.setBackground(round);

            mCamera.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    Toast debugger = Toast.makeText(context,"height: " + getScreenHeight() +
                                    " | width: " + getScreenWidth(),Toast.LENGTH_SHORT);
                    debugger.show();
                    if(toggle!= true) {
                        adminQueueFragment();
                        toggle = true;
                    }else{
                        unadminQueueFragment();
                        toggle = false;
                    }

                }
            });
        }

    public void adminQueueFragment(){
        AdminQueue menuFrag = new AdminQueue();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragTest,menuFrag);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void unadminQueueFragment(){
        AdminQueue menuFrag = new AdminQueue();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.remove(menuFrag);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

    public float getScreenWidth() {
        return (Resources.getSystem().getDisplayMetrics().widthPixels)/
                (Resources.getSystem().getDisplayMetrics().density);
    }

    public float getScreenHeight() {
        return (Resources.getSystem().getDisplayMetrics().heightPixels)/
                (Resources.getSystem().getDisplayMetrics().density);
    }
}
