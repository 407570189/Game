package com.fju.game;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG =MainActivity.class.getSimpleName() ;
    private GameView gameView;

    //  private Button up;
  //  private Button right;
  //  private Button down;
  //  private Button left;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findview();
        /*up=findViewById(R.id.button_up);
        right=findViewById(R.id.button_right);
        down=findViewById(R.id.button_down);
        left=findViewById(R.id.button_left);
        right.setOnClickListener(this);
        down.setOnClickListener(this);
        left.setOnClickListener(this);
        up.setOnClickListener(this);*/
    }
    public void findview(){
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        gameView = findViewById(R.id.view3);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick:UP");
                gameView.setPy(gameView.getPy()-50);
                gameView.invalidate();
                Log.d(TAG,"y="+gameView.getPy());
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick:DOWN");
                gameView.setPy(gameView.getPy()+50);
                gameView.invalidate();
                Log.d(TAG,"y="+gameView.getPy());
                break;
            case R.id.arrow_left:
                Log.d("MainActivity","onClick:LEFT");
                gameView.moveLeft();
                Log.d(TAG,"x="+gameView.getPx());
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick:RIGHT");
                gameView.moveRight();
                Log.d(TAG,"x="+gameView.getPx());
                break;
        }

    }
}
