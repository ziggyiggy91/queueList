package com.example.bestbuy.cameratest;

 import android.app.Activity;
 import android.app.Fragment;
 import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by BestBuy on 1/7/2017.
 */
public class AdminQueue extends Fragment {
    private static final String TAG = AdminQueue.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG,"inside onCreateView in AdminQueue");
        View v = inflater.inflate(R.layout.admin_queue, container, false);
        return v;
     }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
