package com.iexpress.hello.selfview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    FrameLayout layout = (FrameLayout) findViewById(R.id.frameLayout);

    final PingPongView ppv = new PingPongView(MainActivity.this);

    layout.addView(ppv);

    final Activity context = this;

    ppv.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View v, MotionEvent event) {
        ppv.bitmapX = event.getX();
        ppv.bitmapY = event.getY();

        Toast.makeText(context, "Annie: x,y : " + ppv.bitmapX + "," + ppv.bitmapY, Toast.LENGTH_LONG).show();

        // redraw
        ppv.invalidate();

        // check value of false
        return true;
      }
    });
  }
}
