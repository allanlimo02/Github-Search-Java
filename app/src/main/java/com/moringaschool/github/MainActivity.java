package com.moringaschool.github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.username) EditText mUsername;
    @BindView(R.id.submit) Button mSubmit;
    @BindView(R.id.error) TextView mError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=mUsername.getText().toString();
                if(username==""){
                    mSubmit.setEnabled(false);
                    mError.setText("Wrong Username");
                } else{
                    Intent intent =new Intent(MainActivity.this,GitResults.class);
                    startActivity(intent);
                    intent.putExtra("username",username);
                    Toast.makeText(MainActivity.this,"Here we go"+username,Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}