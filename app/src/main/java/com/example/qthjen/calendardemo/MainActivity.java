package com.example.qthjen.calendardemo;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        Calendar calendar = Calendar.getInstance();
        tv.append(calendar.getTime() + "\n");
        tv.append(calendar.get(Calendar.DATE) + "\n");
        tv.append(calendar.get(Calendar.MONTH) + "\n");
        tv.append(calendar.get(Calendar.YEAR) + "\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        tv.append(dateFormat.format(calendar.getTime()) + "\n");

        tv.append(calendar.get(Calendar.HOUR) + "\n");
        tv.append(calendar.get(Calendar.HOUR_OF_DAY) + "\n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        tv.append(simpleDateFormat.format(calendar.getTime()) + "\n");
    }

}
