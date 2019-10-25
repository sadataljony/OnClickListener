package com.sadataljony.app.android.demo.onclicklistener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize Button Widget
        Button mBtnClickMe = findViewById(R.id.btnClickMe);
        // apply onClickListener on Button
        // import android.view.View; for working onClickListener perfectly
        mBtnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "On Click Listener Working", Toast.LENGTH_LONG).show();
            }
        });
    }
}
