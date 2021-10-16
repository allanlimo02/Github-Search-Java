package com.moringaschool.github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GitResults extends AppCompatActivity {
    @BindView(R.id.username) TextView mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_results);
        ButterKnife.bind(this);
        Intent intent=getIntent();
        String username=intent.getStringExtra("username");
        mUsername.setText(username);

    }
}