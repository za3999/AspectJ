package com.example.za399.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.za399.testapplication.aspectj.DebugLog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.parent_l).setOnClickListener(v -> doClick("parent"));
        findViewById(R.id.test_v).setOnClickListener(v -> doClick("child"));
    }

    @DebugLog
    public void doClick(String key) {
        Toast.makeText(MainActivity.this, key + " clicked", Toast.LENGTH_LONG).show();
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list = list.stream().filter(integer -> integer > 8).sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
//        list.forEach(integer -> Log.d("caifu", "filter result:" + integer));
//
//        Log.d("caifu", "***********************************");
//        Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
//        list = inputStream.flatMap((childList) -> childList.stream()).collect(Collectors.toList());
//        list.forEach(integer -> Log.d("caifu", "flatMap result:" + integer));
//
//        Log.d("caifu", "***********************************");
//        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
//        Log.d("caifu", "sum result:" + sum);
//
//        Log.d("caifu", "***********************************");
//        Object[] args = new Object[]{"aaaa", "bbbbb"};
////        Object[] newArgs = new Object[args.length];
////        for (int i = 0; i < args.length; i++) {
////            newArgs[i] = "intercept:" + args[i];
////        }
//        Object[] newArgs = Stream.of(args).map(o -> "intercept:" + o).toArray();
//        Stream.of(newArgs).forEach(o -> Log.d("caifu", "args result:" + o));
    }
}
