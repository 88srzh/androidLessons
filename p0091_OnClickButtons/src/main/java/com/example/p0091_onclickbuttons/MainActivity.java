package com.example.p0091_onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    private static final String TAG = "myLog";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        Log.d(TAG, "найдем View - элементы");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка 1");
                Log.d(TAG, "Обработаем нажатие кнопки 1");
            }
        });

        button2.setOnClickListener(this);

    }

    public void clickButton3(View view) {
        textView.setText("Нажата кнопка 3");
        Log.d(TAG, "Обработаем нажатие кнопки 3");
    }

    @Override
    public void onClick(View view) {
        textView.setText("Нажата кнопка 2");
        Log.d(TAG, "Обработаем нажатие кнопки 2");
    }
}
