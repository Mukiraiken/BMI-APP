package com.example.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    Double val1,val2,BMI;
    String weight,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);

    }

    public void calculate(View view) {
        weight = et1.getText().toString();
        height = et2.getText().toString();

        val1= Double.parseDouble(et1.getText().toString());
        val2 = Double.parseDouble(et2.getText().toString());

        BMI = (val1/(val2 * val2));
        if (BMI<15){
            Toast.makeText(getApplicationContext(),"you are severely underweight",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+finalResult+"and you are severely underweight");
        }
        else if(BMI>=15 && BMI <=16){
            Toast.makeText(getApplicationContext(),"severely underweight",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +"and your health is severely underweight");

        }

        else if(BMI>=16 && BMI <=18.5){
            Toast.makeText(getApplicationContext(),"severely underweight",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +"and your health is severely underweight");

        }

        else if(BMI>=18.5 && BMI <=25){
            Toast.makeText(getApplicationContext(),"you are healthy",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +" and normal");

        }


        else if(BMI>=30 && BMI <=35){
            Toast.makeText(getApplicationContext(),"obesse",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +"and you moderately obesse");

        }

        else if(BMI>=40){
            Toast.makeText(getApplicationContext()," severely obesse",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +"and you severely obesse");

        }

        else {
            Toast.makeText(getApplicationContext()," extremely obesse",Toast.LENGTH_SHORT).show();
            String finalResult=String.valueOf(BMI);
            tv1.setText("Your BMI is "+ finalResult +"and you extremely obesse");

        }
    }
}
