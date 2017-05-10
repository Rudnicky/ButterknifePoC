package com.example.arakjel.butterknifepoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView) TextView textView;
    @BindView(R.id.testButton) Button testButton;
    @BindView(R.id.exitApplicationButton) Button exitApplicationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.testButton)
    public void testButton() {
        Toast.makeText(this, "Test Button Clicked", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.exitApplicationButton)
    public void exitApplication() {
        finish();
    }
}
