package com.example.sam.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.RadioGroup;


public class MainActivity extends FragmentActivity {

    private final String TAG = "MainActivity";

    private RadioGroup mRadioGroup;
    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "MainActivity------->onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置默认显示的Fragment
        setTabSelection(R.id.localrecordingtab);

        mRadioGroup = (RadioGroup) findViewById(R.id.tabs_rg);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                setTabSelection(checkedId);
            }
        });
    }

    /**
     * 切换Fragment
     * @param id
     */
    private void setTabSelection(int id){
        // 开启一个Fragment事务
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideFragments(transaction);

        switch (id) {
            case R.id.localrecordingtab:
                if (fragmentOne == null) {
                    fragmentOne = new FragmentOne();
                    transaction.add(R.id.frameLayout, fragmentOne);
                } else {
                    transaction.show(fragmentOne);
                }
                break;

            case R.id.eventlisttab:
                if (fragmentTwo == null) {
                    fragmentTwo = new FragmentTwo();
                    transaction.add(R.id.frameLayout, fragmentTwo);
                } else {
                    transaction.show(fragmentTwo);
                }
                break;
            default:
                break;

        }
        transaction.commit();

    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (fragmentOne != null) {
            transaction.hide(fragmentOne);
        }
        if (fragmentTwo != null) {
            transaction.hide(fragmentTwo);
        }

    }

}
