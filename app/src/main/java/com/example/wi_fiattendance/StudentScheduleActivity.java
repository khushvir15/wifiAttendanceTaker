package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentScheduleActivity extends AppCompatActivity implements View.OnClickListener{

    private Button CD,CC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_schedule);

        CD = findViewById(R.id.btncd);
        CC =findViewById(R.id.btncc);


        CD.setOnClickListener(this);
        CC.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncd:
                Intent intent1 = new Intent(StudentScheduleActivity.this, StudentCDDetailsActivity.class);
                startActivity(intent1);
                break;
            case R.id.btncc:
                Intent intent2 = new Intent(StudentScheduleActivity.this, StudentCCDetailsActivity.class);
                startActivity(intent2);
                break;
        }
    }
}