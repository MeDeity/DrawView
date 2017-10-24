package com.deity.drawview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画圆
 * Created by Deity on 2017/10/24.
 */

public class DrawCircleView extends View{
    public DrawCircleView(Context context) {
        super(context);
    }
    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(android.R.color.holo_red_dark));
        paint.setStrokeWidth(20);//20像素
        paint.setAlpha(127);
//        paint.setStyle(Paint.Style.FILL);//填充
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);//填充并且含边框
        paint.setStyle(Paint.Style.STROKE);//空心
        canvas.drawCircle(300,300,200,paint);//坐标（300,300),半径200 的圆
    }
}
