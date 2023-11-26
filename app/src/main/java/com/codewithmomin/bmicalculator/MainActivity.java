package com.codewithmomin.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button Btn1;
    EditText E_height;
    EditText E_weight;
    TextView S_output;
    TextView infoText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1=findViewById(R.id.btn1);
        E_height=findViewById(R.id.e_height);
        E_weight=findViewById(R.id.e_weight);
        S_output=findViewById(R.id.s_output);





        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get input height from user
            String inputText1=E_height.getText().toString();
            //Getting input weight from user
                String inputText2=E_weight.getText().toString();


                //Converting String into Double datatype
            double kilos=Double.parseDouble(inputText1);
                double inchs=Double.parseDouble(inputText2);
                //converting Kilo into pound
                double pound=kilos*2.2046;
                //to get BMI
               float bmi=obtainBmi(pound,inchs);
                //to display Bmi result
                S_output.setText(""+bmi);




            }
        });


    }

    public float obtainBmi(double pound,double inchs)
    {

     float result = (float) (703 * (pound / (inchs * inchs)));

        return result;


    }


}