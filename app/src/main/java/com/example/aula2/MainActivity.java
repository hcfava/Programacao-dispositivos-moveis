package com.example.aula2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    private EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);


        Log.d("CICLO", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CICLO", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CICLO", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CICLO", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CICLO", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CICLO", "onDestroy");
    }

    public void click1(View view) {

        String valorDigitado = editText.getText().toString();
        Intent intent = new Intent(getApplicationContext(), OutraActivity.class);
        intent.putExtra("celcius", valorDigitado);
        startActivity(intent);
    }
}
