package com.example.maxim.lab11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Paint p;
    int mw=0, mh=0;
    Bitmap oleg;
    int bmpx=0,bmpy=0;
    Rect r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm=new misha(this);
        setContentView(mm);
        oleg = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
        bmpx = oleg.getWidth();
        bmpy = oleg.getHeight();
    }
    class misha extends View{
        public misha (Context context){
            super(context);
            p=new Paint();
        }
        @Override
        protected void onSizeChanged(int w, int h, int ow, int oh){
            mw = w;
            mh = h;
            super.onSizeChanged(w, h, ow, oh);
        }
        @Override
        protected void onDraw(Canvas canvas){
            r1 = new Rect(410,0,817,607);
            r2 = new Rect(250,250,850,1200);
            canvas.drawBitmap(oleg,r1,r2,p);
            r1 = new Rect(0,780,270,1035);
            r2 = new Rect(90,470,440,820);
            canvas.drawBitmap(oleg,r1,r2,p);
        }
    }
    misha mm;
}
