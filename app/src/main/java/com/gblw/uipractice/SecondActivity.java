package com.gblw.uipractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by gebilaowang on 2017/4/16.
 */

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.second_layout);

        Button attackBtn = (Button)this.findViewById(R.id.attack);
        attackBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(SecondActivity.this,"attack started",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
