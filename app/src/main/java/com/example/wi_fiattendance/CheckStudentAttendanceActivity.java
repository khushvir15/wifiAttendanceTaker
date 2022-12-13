package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckStudentAttendanceActivity extends AppCompatActivity implements View.OnClickListener {

    private Button CDbtn, CCbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_student_attendance);

        CDbtn = findViewById(R.id.btncd);
        CCbtn = findViewById(R.id.btncc);

        CDbtn.setOnClickListener(this);
        CCbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncd:
                Intent intent1 = new Intent(CheckStudentAttendanceActivity.this, CDListActivity.class);
                startActivity(intent1);
                break;
            case R.id.btncc:
                Intent intent2 = new Intent(CheckStudentAttendanceActivity.this, CCListActivity.class);
                startActivity(intent2);
                break;
        }
    }

}