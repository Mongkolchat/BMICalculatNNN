package com.promlert.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BmiResultActivity extends AppCompatActivity {
    private TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        t = (TextView) findViewById(R.id.textvieww);
        // เข้าถึงอินเทนต์ที่ส่งมจากต้นทาง (MainActivity)
        Intent intent = getIntent();
        // อ่านค่าตัวเลข bmi จากอินเทนต์
        Double bmi = intent.getDoubleExtra("bmi_value", 0);
        // อ่านข้อความ (ที่บอกผอม, ปกติ, อ้วน) จากอินเทนต์
        String bmiText = intent.getStringExtra("bmi_text");
        String result = String.format("ค่า BMI ที่ได้คือ %.1f\n\nอยู่ในเกณฑ์ : %s", bmi, bmiText);
        t.setText(result);
        // ...
        // นำค่า bmi, bmiText ไปใช้งานตามต้องการ
        // ...

    }
}
