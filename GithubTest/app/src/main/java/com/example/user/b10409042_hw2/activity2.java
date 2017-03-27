package com.example.user.b10409042_hw2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by User on 2017/3/27.
 */

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.b10409042_2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem page_back) {
        int id= page_back.getItemId();
        if (id == R.id.page_back){
            Intent i1 = new Intent();
            i1.setClass(activity2.this,MainActivity.class);
            startActivity(i1);
        }
        return  super.onOptionsItemSelected(page_back);
    }
}