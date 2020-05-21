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

    public void click1(View view) {

        String valorDigitado = editText.getText().toString();
        if(valorDigitado.isEmpty()){
            return;
        }

        Intent intent = new Intent(getApplicationContext(), OutraActivity.class);
        intent.putExtra("celcius", valorDigitado);
        startActivity(intent);
    }

    public void exercicio4click(View view) {
        startActivity(new Intent(this,ActivityEx4.class));
    }

    public void exercicio61click(View view) {startActivity(new Intent(this,ActivityEx61.class));}

    public void exercicio62click(View view) {startActivity(new Intent(this,ActivityEx62.class));}

    public void exercicio7click(View view) {startActivity(new Intent(this,ActivityEx7.class));}

    public void selClick(View view) { startActivity(new Intent(this,Aula8SelActivity.class)); }

    public void exercicio8click(View view) {startActivity(new Intent(this,ActivityEx8.class));}
}
