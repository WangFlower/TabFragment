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
public class FragmentTwo extends Fragment {

    private final String TAG = "FragmentTwo";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "FragmentTwo------->onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,null);
        Log.i(TAG, "FragmentTwo------->onCreateView");
        return view;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "FragmentTwo------->onAttach");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "FragmentTwo------->onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "FragmentTwo------->onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "FragmentTwo------->onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "FragmentTwo------->onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "FragmentTwo------->onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "FragmentTwo------->onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "FragmentTwo------->onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "FragmentTwo------->onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "FragmentTwo------->onDetach");
    }

}
