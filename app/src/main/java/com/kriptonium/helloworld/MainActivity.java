package com.kriptonium.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity);

        LinearLayout layout = (LinearLayout) findViewById(R.id.content_layout);
        ViewGroup.LayoutParams params = new  ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        for(int i=0;i<3;i++){
            Button button = new Button(this);
            button.setText("Click me");
            button.setLayoutParams(params);
            layout.addView(button);
        }





    }
}
