package com.example.gamer.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calc (View view)
    {
        EditText num1 = (EditText)findViewById(R.id.fnum1);
        EditText num2 = (EditText)findViewById(R.id.fnum2);
        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());
        int result = 0;
        if(view.getId()==R.id.btadd)
        {
            result = value1+value2;
            TextView resu = (TextView)findViewById(R.id.res);
            resu.setText(String.valueOf(result));
        }
        if(view.getId()==R.id.btsub)
        {
            result = value1-value2;
            TextView resu = (TextView)findViewById(R.id.res);
            resu.setText(String.valueOf(result));
        }
        if(view.getId()==R.id.btmul)
        {
            result = value1*value2;
            TextView resu = (TextView)findViewById(R.id.res);
            resu.setText(String.valueOf(result));
        }
        if(view.getId()==R.id.btdiv)
        {
            result = value1/value2;
            TextView resu = (TextView)findViewById(R.id.res);
            resu.setText(String.valueOf(result));
        }
    }
}
