package com.example.exerciciolistener;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editNumber;
    private SeekBar seekNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
        seekNumber = findViewById(R.id.seekNumber);

        editNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().isEmpty()) {
                    try {
                        int number = Integer.parseInt(charSequence.toString());
                        if (number >= 0 && number <= seekNumber.getMax())
                            seekNumber.setProgress(number);
                        else {
                            Toast.makeText(MainActivity.this, "Número fora de intervalo!", Toast.LENGTH_SHORT).show();
                            seekNumber.setProgress(seekNumber.getMax());
                        }
                    }
                    catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Não foi possível converter o número!", Toast.LENGTH_SHORT).show();
                    }
                }
                    else{
                        seekNumber.setProgress(0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
