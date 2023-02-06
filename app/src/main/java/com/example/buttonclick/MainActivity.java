package com.example.buttonclick;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button b1,b2;
    TextView t1;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        t1=(TextView) findViewById(R.id.t1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            i++;
            t1.setText(""+i);
        }
        if (v.getId() == R.id.button2) {
            i=0;
            t1.setText(""+i);
        }
    }
}