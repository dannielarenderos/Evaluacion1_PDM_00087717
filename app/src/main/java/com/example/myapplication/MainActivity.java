package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tProd_1, tProd_2, tProd_3, tProd_4, tProd_5, tProd_6, tProd_7, tProd_8, tProd_9, user, email;

    private Button enviar;
    private LinearLayout Pro1, Pro2, Pro3, Pro4, Pro5, Pro6, Pro7, Pro8, Pro9;
    private int C1, C2, C3, C4, C5, C6, C7, C8, C9, TOT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pro1 = (LinearLayout) findViewById(R.id.Prod_1);
        Pro2 = (LinearLayout) findViewById(R.id.Prod_2);
        Pro3 = (LinearLayout) findViewById(R.id.Prod_3);
        Pro4 = (LinearLayout) findViewById(R.id.Prod_4);
        Pro5 = (LinearLayout) findViewById(R.id.Prod_5);
        Pro6 = (LinearLayout) findViewById(R.id.Prod_6);
        Pro7 = (LinearLayout) findViewById(R.id.Prod_7);
        Pro8 = (LinearLayout) findViewById(R.id.Prod_8);
        Pro9 = (LinearLayout) findViewById(R.id.Prod_9);

        user = findViewById(R.id.user);
        email = findViewById(R.id.email);
        enviar = findViewById(R.id.send);

        tProd_1 = findViewById(R.id.P1);
        tProd_2 = findViewById(R.id.P2);
        tProd_3 = findViewById(R.id.P3);
        tProd_4 = findViewById(R.id.P4);
        tProd_5 = findViewById(R.id.P5);
        tProd_6 = findViewById(R.id.P6);
        tProd_7 = findViewById(R.id.P7);
        tProd_8 = findViewById(R.id.P8);
        tProd_9 = findViewById(R.id.P9);


        Pro1.setOnClickListener(this);
        Pro2.setOnClickListener(this);
        Pro3.setOnClickListener(this);
        Pro4.setOnClickListener(this);
        Pro5.setOnClickListener(this);
        Pro6.setOnClickListener(this);
        Pro7.setOnClickListener(this);
        Pro8.setOnClickListener(this);
        Pro9.setOnClickListener(this);
        enviar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Prod_1:
                C1++;
TOT++;
                tProd_1.setText(Integer.toString(C1));
                break;


            case R.id.Prod_2:
                C2++;
                TOT++;
                tProd_2.setText(Integer.toString(C2));
                break;


            case R.id.Prod_3:
                C3++;
                TOT++;
                tProd_3.setText(Integer.toString(C3));
                break;


            case R.id.Prod_4:
                C4++;
                TOT++;
                tProd_4.setText(Integer.toString(C4));
                break;


            case R.id.Prod_5:
                C5++;
                TOT++;
                tProd_5.setText(Integer.toString(C5));
                break;


            case R.id.Prod_6:
                C6++;
                TOT++;
                tProd_6.setText(Integer.toString(C6));
                break;


            case R.id.Prod_7:
                C7++;
                TOT++;
                tProd_7.setText(Integer.toString(C7));
                break;


            case R.id.Prod_8:
                C8++;
                TOT++;
                tProd_8.setText(Integer.toString(C8));
                break;


            case R.id.Prod_9:
                C9++;
                TOT++;
                tProd_9.setText(Integer.toString(C9));
                break;


            case R.id.send:



                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                if (intent != null) {

                    intent.putExtra("user", user.getText().toString());
                    intent.putExtra("email", email.getText().toString());
                    intent.putExtra("Total", Integer.toString(TOT));
                    intent.putExtra("P1", tProd_1.getText().toString());
                    intent.putExtra("P2", tProd_2.getText().toString());
                    intent.putExtra("P3", tProd_3.getText().toString());
                    intent.putExtra("P4", tProd_4.getText().toString());
                    intent.putExtra("P5", tProd_5.getText().toString());
                    intent.putExtra("P6", tProd_6.getText().toString());
                    intent.putExtra("P7", tProd_7.getText().toString());
                    intent.putExtra("P8", tProd_8.getText().toString());
                    intent.putExtra("P9", tProd_9.getText().toString());
                    startActivity(intent);

                }
                break;


        }
    }
}
