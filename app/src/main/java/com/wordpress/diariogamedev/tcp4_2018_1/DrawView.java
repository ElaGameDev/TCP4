package com.wordpress.diariogamedev.tcp4_2018_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View{

    Bitmap bmp;

    public DrawView (Context context){
        super(context);


        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.pomboteste);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //Paint p = new Paint();
        canvas.drawBitmap(bmp, 10, 10, null);
    }
}
