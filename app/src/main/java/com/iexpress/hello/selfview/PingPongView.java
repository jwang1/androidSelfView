package com.iexpress.hello.selfview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.Toast;

/**
 * Create self view
 *
 * Created by jwang on 8/7/17.
 */

public class PingPongView extends View {
  public float bitmapX;
  public float bitmapY;

  /**
   * Simple constructor to use when creating a view from code.
   *
   * @param context The Context the view is running in, through which it can
   *                access the current theme, resources, etc.
   */
  public PingPongView(Context context) {
    super(context);

    bitmapX = 300;
    bitmapY = 500;
    Toast.makeText(context, "x,y : " + bitmapX + "," + bitmapY, Toast.LENGTH_LONG).show();
  }

  @Override
  public void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    Paint paint = new Paint();
    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pingpong);

    canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
  }


}
