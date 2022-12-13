package com.example.wi_fiattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.etemail);
        Password = findViewById(R.id.etpassword);
        Login = findViewById(R.id.btnLogin);

        textView = (TextView) findViewById(R.id.android_device_ip_address);
        final WifiManager manager = (WifiManager) super.getSystemService(WIFI_SERVICE);
        final DhcpInfo dhcp = manager.getDhcpInfo();
        final String address = Formatter.formatIpAddress(dhcp.gateway);
       /* WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
        String ipAddress = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress()); */
        textView.setText("Ruter gateway Address: " + address);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final String OurIpAdress = "0.0.0.0";
                if (address.equals(OurIpAdress)){
                    validate(Email.getText().toString(), Password.getText().toString());
                }else {
                    Toast.makeText(MainActivity.this, "You are not connected with the authorised wifi...", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void validate (String userEmail, String userPassword){
        if( (userEmail.equals("teacher@tech.in")) && (userPassword.equals("1234")) ){
            Intent intent1 = new Intent(MainActivity.this, TeacherScheduleActivity.class);
            startActivity(intent1);
        }else if( (userEmail.equals("principal@tech.in")) && (userPassword.equals("1234")) ){
            Intent intent2 = new Intent(MainActivity.this, AdminScheduleActivity.class);
            startActivity(intent2);
        }else if( (userEmail.equals("khushvir@tech.in")) && (userPassword.equals("2001")) ){
            Intent intent3 = new Intent(MainActivity.this, StudentScheduleActivity.class);
            startActivity(intent3);
        }else if( (userEmail.equals("jasmine@tech.in")) && (userPassword.equals("2002")) ){
            Intent intent4 = new Intent(MainActivity.this, StudentScheduleActivity.class);
            startActivity(intent4);
        }else if( (userEmail.equals("jasmeet@tech.in")) && (userPassword.equals("2003")) ){
            Intent intent5 = new Intent(MainActivity.this, StudentScheduleActivity.class);
            startActivity(intent5);
        }else{

            Toast.makeText(MainActivity.this, "Enter Valid Details", Toast.LENGTH_SHORT).show();

        }
    }

}