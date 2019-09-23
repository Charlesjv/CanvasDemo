package com.example.canvasdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.Setup the frame
        ImageView ivframe = (ImageView) findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap(300,500,Bitmap.Config.ARGB_8888);
        //2. setup the canvas
        Canvas canvas = new Canvas(b);
        //3. setup your paintbrush
        Paint paintbrush = new Paint();

        //1. set the background

            canvas.drawColor(Color.BLACK);

            paintbrush.setColor(Color.YELLOW);

         //2. draw the line

            canvas.drawLine(10,50,200,50,paintbrush);

            //4. Change to a red crayon

            paintbrush.setColor(Color.RED);

            //5.draw a diagonal line(red)
           canvas.drawLine(200,50,50,150,paintbrush);


           //1. Change crayon to white
           paintbrush.setColor(Color.WHITE);
           canvas.drawRect(100,100,120,120,paintbrush);


           canvas.drawRect(150,150,200,200,paintbrush);



           //1. Set the text size
           paintbrush.setTextSize(40);
           canvas.drawText("HELLO WORLD",10,400,paintbrush);


        ivframe.setImageBitmap(b);
    }
}
