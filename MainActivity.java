package com.example.slip11q2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstName = findViewById(R.id.firstName);
        EditText middleName = findViewById(R.id.middleName);
        EditText lastName = findViewById(R.id.lastName);
        EditText dob = findViewById(R.id.dob);
        EditText address = findViewById(R.id.address);
        EditText email = findViewById(R.id.email);
        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("firstName", firstName.getText().toString());
            intent.putExtra("middleName", middleName.getText().toString());
            intent.putExtra("lastName", lastName.getText().toString());
            intent.putExtra("dob", dob.getText().toString());
            intent.putExtra("address", address.getText().toString());
            intent.putExtra("email", email.getText().toString());
            startActivity(intent);
        });
    }
}
