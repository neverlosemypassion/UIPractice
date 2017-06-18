package com.gblw.uipractice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by gebilaowang on 2017/4/16.
 */

public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(R.layout.first_layout);


        Button button1 = (Button)this.findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(FirstActivity.this,"Button 1 clicked",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        Button button2 = (Button)this.findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                FirstActivity.this.startActivity(intent);
//                FirstActivity.this.finish();
            }
        });

        Button implicitBtn = (Button)this.findViewById(R.id.implicitBtn);
        implicitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent("com.gblw.uipractice.SecondActivity_Start");
                intent.addCategory("com.gblw.uipractice.my_category");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        this.getMenuInflater().inflate(R.menu.context_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "Add item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.modify_item:
                Toast.makeText(this, "Modify item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "Remove item selected", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
