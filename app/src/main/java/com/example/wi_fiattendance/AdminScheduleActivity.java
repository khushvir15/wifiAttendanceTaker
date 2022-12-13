package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminScheduleActivity extends AppCompatActivity implements View.OnClickListener {

    private Button AttendanceList1, Logout, AttendanceList2, CDbtn, CCbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_schedule);

        AttendanceList1 = findViewById(R.id.btnshift1);
        Logout = findViewById(R.id.btnMlogout);
        AttendanceList2 = findViewById(R.id.btnShift2);

        CDbtn = findViewById(R.id.btncd);
        CCbtn = findViewById(R.id.btncc);

        CDbtn.setOnClickListener(this);
        CCbtn.setOnClickListener(this);


        AttendanceList1.setOnClickListener(this);
        AttendanceList2.setOnClickListener(this);
        Logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMlogout:
                Intent intent1 = new Intent(AdminScheduleActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnshift1:

                Intent intent2 = new Intent(AdminScheduleActivity.this, AttendanceListActivity.class);
                startActivity(intent2);
                break;
            case R.id.btnShift2:
                Intent intent3 = new Intent(AdminScheduleActivity.this, AttendanceList2Activity.class);
                startActivity(intent3);
                break;
            case R.id.btncdad:
                Intent intent4 = new Intent(AdminScheduleActivity.this, CDListActivity.class);
                startActivity(intent4);
                break;
            case R.id.btnccad:
                Intent intent5 = new Intent(AdminScheduleActivity.this, CCListActivity.class);
                startActivity(intent5);
                break;
        }
    }
}