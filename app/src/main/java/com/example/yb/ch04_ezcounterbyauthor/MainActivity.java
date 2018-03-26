package com.example.yb.ch04_ezcounterbyauthor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    implements OnClickListener,View.OnLongClickListener {
    TextView txv;
    Button btn;
    int counter = 0 ;

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.txv){
            txv.setText(String.valueOf(--counter));
        }
        else {
            txv.setText(String.valueOf(++counter));
        }
    }

    @Override
    public boolean onLongClick(View view){
        if(view.getId() == R.id.txv ){
            counter = 0 ;
            txv.setText("0");

        }
       else {
            counter += 2 ;
            txv.setText(String.valueOf(counter));
            return true;
        }
        return true;
    }

  /*  @Override
    public boolean onTouch(View view, MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            counter +=1;

        }
        else if(event.getAction() == MotionEvent.ACTION_UP) {
            return true;
        }
        return true;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txv = (TextView) findViewById(R.id.txv);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);
        txv.setOnLongClickListener(this);
        txv.setOnClickListener(this);
//        btn.setOnTouchListener(this);
    }




}
