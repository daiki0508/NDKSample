package com.websarva.wings.android.ndksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit);
        editText.addTextChangedListener(this);
    }

    public void Execute_NDK(View view){
        String name = editText.getText().toString();
        String result = getMessage(name);
        textView = findViewById(R.id.result_text);
        textView.setText(result);
    }

    privte native String getMessage(String msg);

    static {
        System.loadLibrary("hello");
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        String name = editable.toString();
        Button button = findViewById(R.id.button);

        // ユーザーのニックネームが未入力の場合はボタンを有効にしない
        if (name.length() > 0){
            button.setEnabled(true);
        }else {
            button.setEnabled(false);
        }
    }
}
