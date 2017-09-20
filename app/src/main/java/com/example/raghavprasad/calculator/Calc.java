package com.example.raghavprasad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends AppCompatActivity implements View.OnClickListener{

    Button bDel, bEquals;
    EditText editText;
    double value1, value2;
    String operation;
    boolean hasOperation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);


        bDel = findViewById(R.id.bDel);
        bEquals = findViewById(R.id.bEquals);
        editText = findViewById(R.id.editTxt);
        final String ops = "\\+|-|\\*|\\/";


        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                switch (text.charAt(text.length()-1))
                {
                    case '+':
                    case '-':
                    case '/':
                    case '*':
                        editText.setText("Invalid input");
                        return;
                }

                value2 = Float.parseFloat(text.split(ops)[1]);
                String result;

                switch(operation){
                    case "+":
                        result = value1 + value2 + "";
                        editText.setText(result);
                        operation=null;
                        break;

                    case "-":
                        result = value1 - value2 + "";
                        editText.setText(result);
                        operation=null;
                        break;

                    case "*":
                        result = value1 * value2 + "";
                        editText.setText(result);
                        operation=null;
                        break;

                    case "/":
                        result = value1 / value2 + "";
                        editText.setText(result);
                        operation=null;
                        break;
                }

                hasOperation = false;

            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");

            }
        });


    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        String t = b.getText().toString();
        editText.setText(editText.getText() + t);

    }


    public void setOperation(View view){
        if (hasOperation){
            editText.setText("Invalid input");
            hasOperation = false;
            return;
        }

        Button b = (Button)view;
        String t = b.getText().toString();
        operation = t;
        hasOperation = true;
        value1 = Float.parseFloat(editText.getText().toString());
        editText.setText(editText.getText() + t);
    }
}