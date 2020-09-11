package com.example.p0091_onclickbuttons;

import android.util.Log;
import android.view.Gravity;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    private static final String TAG = "myLogs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"найдем view - элементы");
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка 1");
                Log.d(TAG, "обработаем нажатие кнопки 1");

                Toast toast = Toast.makeText(MainActivity.this, "Нажата кнопка 1", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.baseline_done_black_18dp);
                toastImage.addView(imageView, 0);
                toast.show();
            }
        });

        button2.setOnClickListener(this);

    }

    public void clickButton3(View view) {
        textView.setText("Нажата кнопка 3");
        Log.d(TAG, "обработаем нажатие кнопки 3");
    }

    @Override
    public void onClick(View view) {
        textView.setText("Нажата кнопка 2");
        Log.d(TAG, "обработаем нажатие кнопки 2");
    }
}
