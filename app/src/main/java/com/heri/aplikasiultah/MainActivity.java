package com.heri.aplikasiultah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity{

    Button buttonku;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonku = (Button)findViewById(R.id.buttonIni);

        buttonku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Button ditekan",Toast.LENGTH_LONG).show();
                Intent bukaActivity = new Intent(MainActivity.this,SurpriseActivity.class);
                startActivity(bukaActivity);
            }
        });

    }

}