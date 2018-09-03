package com.bawei.chenxiaoxu.chenxiaoxu20180903.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/9/3.
 */

public class MyView extends View {

    private int wsize;
    private int hsize;
    private int wmode;
    private int hmode;
    private Paint paint;
    private Paint mpaint;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        wsize = MeasureSpec.getSize(widthMeasureSpec);
        hsize = MeasureSpec.getSize(heightMeasureSpec);
        wmode = MeasureSpec.getMode(widthMeasureSpec);
        hmode = MeasureSpec.getMode(heightMeasureSpec);

        if(wmode ==MeasureSpec.AT_MOST && hmode==MeasureSpec.AT_MOST){
            setMeasuredDimension(wsize,hsize);
        }else if(wsize ==MeasureSpec.AT_MOST){
            setMeasuredDimension(wsize,450);
        }else if(hmode ==MeasureSpec.AT_MOST){
            setMeasuredDimension(450,hsize);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建画笔
        mpaint = new Paint();
        //图的
        paint = new Paint();

        mpaint.setColor(Color.BLACK);

        paint.setColor(Color.BLUE);
        mpaint.setTextSize(50);
        paint.setTextSize(50);
        canvas.drawText("成本费用占比",100,50,mpaint);
        int u=400/50;

        for (int i = 0; i < 6; i++) {
            canvas.drawLine(20,80*i,wsize,80*i,mpaint);

        }
        for (int i = 0; i < 7; i++) {

            canvas.drawLine(20+(100*i),0,20+(100*i),400,mpaint);

        }

        canvas.drawRect(60,100,100,400,paint);
        canvas.drawRect(140,100,200,400,paint);
        canvas.drawRect(240,150,300,400,paint);
        canvas.drawRect(340,140,400,400,paint);


        Paint paint = new Paint();
        paint.setAntiAlias(true);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(2);

        paint.setTextSize(20);

        canvas.drawText("27.64%",45,98,paint);
        canvas.drawText("28.17%",140,98,paint);
        canvas.drawText("21.48%",240,100,paint);
        canvas.drawText("22.70%",340,135,paint);


        canvas.drawText("管理成本",40,420,paint);
        canvas.drawText("劳务成本",140,420,paint);
        canvas.drawText("销售成本",240,420,paint);
        canvas.drawText("资盘亏损",340,420,paint);

    }
}
