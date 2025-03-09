package com.example.lifecycledem;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    @Override

    protected void onCreate(Bundle savedInstanceState){
        Log.d(TAG,"onCreate:started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStop(){
        Log.d(TAG,"onStop:started");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart:started");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause:started");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume:started");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onResume:started");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy:started");
        super.onDestroy();
    }
}
