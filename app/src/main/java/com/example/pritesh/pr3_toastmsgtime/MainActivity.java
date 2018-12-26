package com.example.pritesh.pr3_toastmsgtime;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Chronometer.OnChronometerTickListener;

public class MainActivity extends AppCompatActivity {
    Chronometer timer;
    int i=0;
    int Duration=10;
    TextView  txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer=(Chronometer)findViewById(R.id.chronometer);
        txt=(TextView)findViewById(R.id.textView);

        timer.start();
        timer.setOnChronometerTickListener(new OnChronometerTickListener() {

            @Override
            public void onChronometerTick(Chronometer arg0) {

                txt.setText("PNP : Next Message will display after Some Duration");
                i++;
                if(i>=Duration)
                {
                    Toast.makeText(MainActivity.this, "Message "+(i/10),Toast.LENGTH_LONG).show();
                    Duration+=10;
                }
            }
        });
    }


}

