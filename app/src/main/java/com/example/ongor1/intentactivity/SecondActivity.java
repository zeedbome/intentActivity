package com.example.ongor1.intentactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras =getIntent().getExtras();
        showMessage = (TextView) findViewById(R.id.textView);

        if (extras !=null){
            String message = extras.getString("massage");
            int myInt = extras.getInt("value");
            showMessage.setText("Massage is "+ message+"and"+String.valueOf(myInt));
        }

    }
}
