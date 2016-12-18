package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import 	android.view.View;
import android.content.Context;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mClickButton1 = (Button)findViewById(R.id.button1);
        Button mClickButton2 = (Button)findViewById(R.id.button2);
        Button mClickButton3 = (Button)findViewById(R.id.button3);
        Button mClickButton4 = (Button)findViewById(R.id.button4);
        Button mClickButton5 = (Button)findViewById(R.id.button5);
        mClickButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.movie_button);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        mClickButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.stock_button);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        mClickButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.xyz_button);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        mClickButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.news_button);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        mClickButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.capstone_button);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
