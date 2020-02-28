package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView tv_showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_showCount = (TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        count++;
        if (tv_showCount != null){
            tv_showCount.setText(Integer.toString(count));
        }
    }
}
