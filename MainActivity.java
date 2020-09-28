package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Hitung(View view){
        button = findViewById(R.id.hitung);
        textView = findViewById(R.id.Hasil);
        editText = findViewById(R.id.angka1);
        editText2 = findViewById(R.id.Angka2);
        editText3 = findViewById(R.id.operasi);

      Double a = Double.parseDouble(editText.getText().toString());
      Double b = Double.parseDouble(editText2.getText().toString());
      String operasi = editText3.getText().toString();
      Double hasil = 0.0;
      String d = "" ;

      if (operasi.equals("+")){
          hasil = hasil+a+b;
      }else if (operasi.equals("-")){
          hasil = hasil+a-b;
      }else if (operasi.equals("*")){
          hasil = hasil+a*b;
      }else if (operasi.equals("/")){
          hasil = hasil+a/b;
      }
      else{
            d = "\nOPERASI ARITMATIK TIDAK SESUAI";

      }

      textView.setText("Hasil operasi adalah: " + hasil +" " + d);

    }


}