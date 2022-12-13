package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherAttendanceScheduleActivity extends AppCompatActivity implements View.OnClickListener {

    private Button AttendanceList1, Logout, AttendanceList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_attendance_schedule);

        AttendanceList1 = findViewById(R.id.btnMSchedule1);
        Logout = findViewById(R.id.btnMlogout);
        AttendanceList2 = findViewById(R.id.btnMSchedule2);




        AttendanceList1.setOnClickListener(this);
        AttendanceList2.setOnClickListener(this);
        Logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMlogout:
                Intent intent1 = new Intent(TeacherAttendanceScheduleActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnMSchedule1:

                Intent intent2 = new Intent(TeacherAttendanceScheduleActivity.this,TeacherShift1DetailsActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnMSchedule2:
                Intent intent3 = new Intent(TeacherAttendanceScheduleActivity.this, TeacherShift2DetailsActivity.class);
                startActivity(intent3);
                break;

        }
    }

}