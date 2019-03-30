package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, user, email, totPro;
    private Button share;
private String name, mail, tot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        t1 = findViewById(R.id.po1);
        t2 = findViewById(R.id.po2);
        t3 = findViewById(R.id.po3);
        t4 = findViewById(R.id.po4);
        t5 = findViewById(R.id.po5);
        t6 = findViewById(R.id.po6);
        t7 = findViewById(R.id.po7);
        t8 = findViewById(R.id.po8);
        t9 = findViewById(R.id.po9);
        user = findViewById(R.id.user);
        email = findViewById(R.id.email);
        totPro = findViewById(R.id.produc);
        share = findViewById(R.id.share);

        share.setOnClickListener(this);


        Intent Intent = this.getIntent();
        if (Intent != null) {

            user.setText(Intent.getStringExtra("user"));
            email.setText(Intent.getStringExtra("email"));
            totPro.setText(Intent.getStringExtra("Total"));
            t1.setText(Intent.getStringExtra("P1"));
            t2.setText(Intent.getStringExtra("P2"));
            t3.setText(Intent.getStringExtra("P3"));
            t4.setText(Intent.getStringExtra("P4"));
            t5.setText(Intent.getStringExtra("P5"));
            t6.setText(Intent.getStringExtra("P6"));
            t7.setText(Intent.getStringExtra("P7"));
            t8.setText(Intent.getStringExtra("P8"));
            t9.setText(Intent.getStringExtra("P9"));

            name = Intent.getStringExtra("user");
            mail = Intent.getStringExtra("email");
            tot = Intent.getStringExtra("Total");

        }

    }


    @Override
    public void onClick(View v) {

        Intent intento = new Intent();
        intento.setAction(Intent.ACTION_SEND);
        intento.setType("text/plain");
        intento.putExtra(intento.EXTRA_TEXT, "Nombre:" + name + " Email: " + mail + " Total de Productos " + tot);
        Main2Activity.this.startActivity(intento);

    }
}
