package com.example.sam.fragmentdemo;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "FragmentOne------->onAttach");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "FragmentOne------->onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "FragmentOne------->onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "FragmentOne------->onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "FragmentOne------->onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "FragmentOne------->onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "FragmentOne------->onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "FragmentOne------->onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "FragmentOne------->onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "FragmentOne------->onDetach");
    }
}
