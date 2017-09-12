package com.example.raghavprasad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDel, bAdd, bSubtract, bMultiply, bDivide, bEquals, bDecimal;
    EditText editText;
    double value1, value2;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bDel = findViewById(R.id.bDel);
        bSubtract = findViewById(R.id.bSubtract);
        bAdd = findViewById(R.id.bAdd);
        bDivide = findViewById(R.id.bDivide);
        bMultiply = findViewById(R.id.bMultiply);
        bEquals = findViewById(R.id.bEquals);
        bDecimal = findViewById(R.id.bDecimal);
        editText = findViewById(R.id.editText);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null) {
                    editText.setText("");
                }

                else {
                    value1=Float.parseFloat(editText.getText()+"");
                    operation="add";
                    editText.setText(null);
                }
                }
        });

        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null) {
                    editText.setText("");
                }

                else {
                    value1=Float.parseFloat(editText.getText()+"");
                    operation="subtract";
                    editText.setText(null);
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null) {
                    editText.setText("");
                }

                else {
                    value1=Float.parseFloat(editText.getText()+"");
                    operation="multiply";
                    editText.setText(null);
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null) {
                    editText.setText("");
                }

                else {
                    value1=Float.parseFloat(editText.getText()+"");
                    operation="divide";
                    editText.setText(null);
                }
            }
        });

        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2=Float.parseFloat(editText.getText()+"");

                switch(operation){
                    case "add":
                        editText.setText(value1+value2+"");
                        operation=null;
                        break;

                    case "subtract":
                        editText.setText(value1-value2+"");
                        operation=null;
                        break;

                    case "multiply":
                        editText.setText(value1*value2+"");
                        operation=null;
                        break;

                    case "divide":
                        editText.setText(value1/value2+"");
                        operation=null;
                        break;
                }

            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });
                
    }

}