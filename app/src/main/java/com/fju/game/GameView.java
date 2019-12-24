package com.fju.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private float px = 400;
    private float py = 400;
    private int iconWidth;
    private int iconHeight;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game", "onDraw:" + px+ "," +py);
        Paint paint = new Paint();
        canvas.drawLine(400, 0, 0, 600, paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.monkey);
        iconWidth = bitmap.getWidth();
        iconHeight = bitmap.getHeight();
        canvas.drawBitmap(bitmap, px, py, paint);
    }
    public void setPx(float px){
        if(px>iconWidth-400&&px<getWidth()-300)
        {
            this.px=px;
        }
    }
    public float getPx(){
        return px;
    }

    public void setPy(float py) {
        if(py>iconHeight&&py<getHeight()-300);
        {
            this.py = py;
        }
    }

    public float getPy() {
        return py;
    }
}