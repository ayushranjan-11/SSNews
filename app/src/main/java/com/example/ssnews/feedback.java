package com.example.ssnews;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class feedback extends AppCompatActivity {
    private EditText feedbackText;
    private Button button_feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        feedbackText=findViewById(R.id.editText);
        button_feedback=findViewById(R.id.button_feedback);
        feedbackText.addTextChangedListener(feedbacktexts);
    }

    private TextWatcher feedbacktexts=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String feedback_input=feedbackText.getText().toString();
            button_feedback.setEnabled(!feedback_input.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };
}