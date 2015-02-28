package com.example.sam.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sam on 2015/2/27.
 */
public class FragmentOne extends Fragment {

    private final String TAG = "FragmentOne";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "FragmentOne------->onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "FragmentOne------->onCreateView");
        View view = inflater.inflate(R.layout.fragment_one,null);
        return view;

    }
}
