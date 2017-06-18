package com.gblw.uipractice.LifeCycle;

import android.app.Activity;
import android.os.Bundle;

import com.gblw.uipractice.R;

/**
 * Created by gebilaowang on 2017/4/19.
 */

public class NormalActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.normal_layout);
    }
}
