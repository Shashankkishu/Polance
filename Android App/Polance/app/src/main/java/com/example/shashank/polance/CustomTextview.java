package com.example.shashank.polance;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by shashank on 30/8/15.
 */
public class CustomTextview extends TextView{

        public CustomTextview(Context context) {
            super(context);
            applyCustomFont(context, null);
        }

        public CustomTextview(Context context, AttributeSet attrs) {
            super(context, attrs);
            applyCustomFont(context, attrs);
        }

        public CustomTextview(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            applyCustomFont(context, attrs);
        }
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        Rect rect = canvas.getClipBounds();
//        Paint paint = new Paint();
//        paint.setColor(30000000);
//        canvas.drawCircle(rect.centerX(), rect.centerY(), 20, paint);
//    }

        private void applyCustomFont(Context context, AttributeSet attrs) {
            int textStyle = getTypeface().getStyle();

            Typeface customFont = selectTypeface(context, textStyle);
            setTypeface(customFont);
        }

        private Typeface selectTypeface(Context context, int textStyle) {
    /*
     information about the TextView textStyle:
     http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
      */

            switch (textStyle) {
                case 1: // bold
                    return FontCache.getTypeface("font/robo.ttf", context);

                case 2: // italic
                    return FontCache.getTypeface("font/robo.ttf", context);

                case 0: // regular
                default:
                    return FontCache.getTypeface("font/Roboto-Thin.ttf", context);
            }
        }
    }


