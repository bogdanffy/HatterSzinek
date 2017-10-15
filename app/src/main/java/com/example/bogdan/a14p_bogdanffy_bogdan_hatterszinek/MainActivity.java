package com.example.bogdan.a14p_bogdanffy_bogdan_hatterszinek;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button pirosGomb;
    private Button feherGomb;
    private Button zoldGomb;
    private Button feketeGomb;
    private RelativeLayout kimenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pirosGomb = (Button) findViewById(R.id.pirosButton);
        feherGomb = (Button) findViewById(R.id.feherButton);
        zoldGomb = (Button) findViewById(R.id.zoldButton);
        feketeGomb = (Button) findViewById(R.id.feketeButton);
        kimenet = (RelativeLayout) findViewById(R.id.layout);




        pirosGomb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pirosGomb.setBackgroundColor(Color.RED);
                kimenet.setBackgroundColor(Color.RED);

            }
        });
        feherGomb.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                feherGomb.setBackgroundColor(Color.WHITE);
                kimenet.setBackgroundColor(Color.WHITE);
            }
        });
        zoldGomb.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                zoldGomb.setBackgroundColor(Color.GREEN);
                kimenet.setBackgroundColor(Color.GREEN);
            }
        });
        feketeGomb.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                feketeGomb.setBackgroundColor(Color.BLACK);
                kimenet.setBackgroundColor(Color.BLACK);
                feketeGomb.setTextColor(Color.WHITE);



            }
        });

    }




}
