package com.example.za399.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.za399.testapplication.aspectj.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.parent_l).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick("parent");
            }
        });
        findViewById(R.id.test_v).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick("child");
            }
        });
    }

    @DebugLog
    public void doClick(String key) {
        Toast.makeText(MainActivity.this, key + " clicked", Toast.LENGTH_LONG).show();
    }
}
