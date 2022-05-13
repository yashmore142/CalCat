package com.example.calcat;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;


public class MainActivity extends Activity {
    private TextView txt;
   private   Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnclr,btnaddition,btnsub,btnmultiply,
    btndivide,btnequal;
    private String Data;
    private String editarea;
     private int result =0;
     int val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.txtlayout);
       txt=findViewById(R.id.txt);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);

        btnclr=findViewById(R.id.btnclr);
        btnaddition=findViewById(R.id.btmaddition);
        btnsub=findViewById(R.id.btnsub);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        btnequal=findViewById(R.id.btnequal);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data=txt.getText().toString();
                txt.setText(Data+"0");
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("");
            }
        });
        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(txt.getText().toString());
                Data=txt.getText().toString();
                txt.setText(Data+"+");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(txt.getText().toString());
                Data=txt.getText().toString();
                txt.setText(Data+"-");
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(txt.getText().toString());
                Data=txt.getText().toString();
                txt.setText(Data+"*");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(txt.getText().toString());
                Data=txt.getText().toString();
                txt.setText(Data+"/");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editarea=txt.getText().toString();
                for (int i=0;i<=editarea.length()-1;i++){
                    String secondhalf="";
                    switch (editarea.charAt(i)){
                        case '+':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1+val2;
                            txt.setText(String.valueOf(result));
                            break;
                        case '-':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1-val2;
                            txt.setText(String.valueOf(result));
                            break;
                        case '*':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1*val2;
                            txt.setText(String.valueOf(result));
                            break;
                        case '/':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1/val2;
                            txt.setText(String.valueOf(result));
                        break;

                    }
                }


            }
        });

    }
}