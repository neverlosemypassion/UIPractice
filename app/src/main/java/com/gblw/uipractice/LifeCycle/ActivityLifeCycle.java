package com.gblw.uipractice.LifeCycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gblw.uipractice.R;

/**
 * Created by gebilaowang on 2017/4/19.
 */

public class ActivityLifeCycle extends Activity{

    private final static String currentClazzName = ActivityLifeCycle.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(this.getClass().getSimpleName(),"onCreate invoked");
        this.setContentView(R.layout.life_cycle);

       /* Button startNormalActivityBtn = (Button)this.findViewById(R.id.start_normal_activity);
        startNormalActivityBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActivityLifeCycle.this,NormalActivity.class);
                startActivity(intent);
            }
        });
      */
      /*  Button startDialogActivityBtn = (Button)this.findViewById(R.id.start_dialog_activity);
        startDialogActivityBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActivityLifeCycle.this,DialogActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(currentClazzName,"onStart 方法被执行");
        Log.d(currentClazzName,currentClazzName);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(currentClazzName,"onResume 方法被执行");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(currentClazzName,"onPause 方法被执行");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(currentClazzName,"onStop 方法被执行");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(currentClazzName,"onRestart 方法被执行");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(currentClazzName,"onDestroy 方法被执行");
    }
}
