package com.example.pr72;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = new Intent(this, ThirdActivity.class);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        TextView textView = findViewById(R.id.textView1);
                        textView.setText(Integer.toString(hourOfDay) + ":" +  Integer.toString(minute));
                        intent.putExtra("transport_message1", Integer.toString(hourOfDay));
                        intent.putExtra("transport_message2", Integer.toString(minute));
                        startActivity(intent);

                    }
                }, hour, minute, true);
        timePickerDialog.show();
    }
}
