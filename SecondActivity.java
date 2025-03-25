package com.example.slip11q2;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView displayInfo = findViewById(R.id.displayInfo);
        String firstName = getIntent().getStringExtra("firstName");
        String middleName = getIntent().getStringExtra("middleName");
        String lastName = getIntent().getStringExtra("lastName");
        String dob = getIntent().getStringExtra("dob");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String studentDetails = "Name: " + firstName + " " + middleName + " " + lastName +
                "\nDate of Birth: " + dob +
                "\nAddress: " + address +
                "\nEmail: " + email;
        displayInfo.setText(studentDetails);
    }
}
