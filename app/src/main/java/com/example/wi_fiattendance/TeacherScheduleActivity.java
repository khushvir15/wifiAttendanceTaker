package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherScheduleActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Login, CheckAttendance, GiveAttendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_schedule);

        Login = findViewById(R.id.btnMlogout);
        CheckAttendance = findViewById(R.id.btncheckAttendance);
        GiveAttendance = findViewById(R.id.btnGiveAttendance);

        Login.setOnClickListener(this);
        CheckAttendance.setOnClickListener(this);
        GiveAttendance.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGiveAttendance:
                Intent intent1 = new Intent(TeacherScheduleActivity.this, TeacherAttendanceScheduleActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnMlogout:
                Intent intent2 = new Intent(TeacherScheduleActivity.this, MainActivity.class);
                startActivity(intent2);
                break;
            case R.id.btncheckAttendance:
                Intent intent3 = new Intent(TeacherScheduleActivity.this, CheckStudentAttendanceActivity.class);
                startActivity(intent3);
                break;
        }

    }

}