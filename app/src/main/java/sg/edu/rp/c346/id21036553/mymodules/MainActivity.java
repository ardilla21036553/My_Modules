package sg.edu.rp.c346.id21036553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1, tvModule2, tvModule3, tvModule4, tvModule5, tvModule6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.tvMod1);
        tvModule2 = findViewById(R.id.tvMod2);
        tvModule3 = findViewById(R.id.tvMod3);
        tvModule4 = findViewById(R.id.tvMod4);
        tvModule5 = findViewById(R.id.tvMod5);
        tvModule6 = findViewById(R.id.tvMod6);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C346");
                intent.putExtra("C346_Name", "Android Programming");
                intent.putExtra("C346_Year", "2022");
                intent.putExtra("C346_Semester", "1");
                intent.putExtra("C346_ModCredit", "4");
                intent.putExtra("C346_Venue", "E62E");

                startActivity(intent);

            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C235");
                intent.putExtra("C235_Name", "IT Security & Management");
                intent.putExtra("C235_Year", "2022");
                intent.putExtra("C235_Semester", "1");
                intent.putExtra("C235_ModCredit", "4");
                intent.putExtra("C235_Venue", "W65G");

                startActivity(intent);

            }
        });

        tvModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C203");
                intent.putExtra("C203_Name", "Web AppIn Development in Php");
                intent.putExtra("C203_Year", "2022");
                intent.putExtra("C203_Semester", "1");
                intent.putExtra("C203_ModCredit", "4");
                intent.putExtra("C203_Venue", "W65H");

                startActivity(intent);

            }
        });

        tvModule4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C218");
                intent.putExtra("C218_Name", "UI/UX Design for Apps");
                intent.putExtra("C218_Year", "2022");
                intent.putExtra("C218_Semester", "1");
                intent.putExtra("C218_ModCredit", "4");
                intent.putExtra("C218_Venue", "E66B");

                startActivity(intent);

            }
        });

        tvModule5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C206");
                intent.putExtra("C206_Name", "Software Development Process");
                intent.putExtra("C206_Year", "2022");
                intent.putExtra("C206_Semester", "1");
                intent.putExtra("C206_ModCredit", "4");
                intent.putExtra("C206_Venue", "E66K");

                startActivity(intent);

            }
        });


        tvModule6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailPage.class);
                intent.putExtra("Module", "C349");
                intent.putExtra("C349_Name", "iPad Programming");
                intent.putExtra("C349_Year", "2023");
                intent.putExtra("C349_Semester", "1");
                intent.putExtra("C349_ModCredit", "4");
                intent.putExtra("C349_Venue", "E62E");

                startActivity(intent);

            }
        });




    }
}