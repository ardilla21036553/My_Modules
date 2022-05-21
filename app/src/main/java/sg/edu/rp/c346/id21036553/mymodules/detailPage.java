package sg.edu.rp.c346.id21036553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class detailPage extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName,tvYear,tvSemester,tvModuleCredit,tvVenue,tvDisplayInfo;
    Button btnInfo, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        tvModuleCode = findViewById(R.id.tvModuleCode);
        tvModuleName = findViewById(R.id.tvModuleName);
        tvYear = findViewById(R.id.tvYear);
        tvSemester = findViewById(R.id.tvSemester);
        tvModuleCredit = findViewById(R.id.tvModuleCredit);
        tvVenue = findViewById(R.id.tvVenue);
        btnInfo = findViewById(R.id.btnInfo);
        btnBack = findViewById(R.id.btnBack);
        tvDisplayInfo = findViewById(R.id.tvDisplayInfo);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });




        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("Module");

        //module 1
        if(moduleCode.equals("C346")){
            tvModuleCode.setText("Module Code: " + moduleCode);


            String moduleName = intentReceived.getStringExtra("C346_Name");
            String moduleYear = intentReceived.getStringExtra("C346_Year");
            String semester = intentReceived.getStringExtra("C346_Semester");
            String moduleCredit = intentReceived.getStringExtra("C346_ModCredit");
            String venue = intentReceived.getStringExtra("C346_Venue");

            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("In this module, students will learn the basics of " +
                            "creating Android Applications. They will learn about user interface " +
                            "implementation issues such as layout, notifications and dialogues as well " +
                            "as the logic and data management (databases, services, GPS, multi-threading, etc.)" +
                            " using the Java programming language.");
                }
            });

            //module 2
        } else if(moduleCode.equals("C235")) {
            tvModuleCode.setText("Module Code: " + moduleCode);

            String moduleName = intentReceived.getStringExtra("C235_Name");
            String moduleYear = intentReceived.getStringExtra("C235_Year");
            String semester = intentReceived.getStringExtra("C235_Semester");
            String moduleCredit = intentReceived.getStringExtra("C235_ModCredit");
            String venue = intentReceived.getStringExtra("C235_Venue");


            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("This module addresses the best practices of the development and management of effective security " +
                            "systems with coverage on information, personnel, physical security, and risk analysis for information protection. " +
                            "It provides a broad overview of the principles and elements of information technology security. It covers the basic " +
                            "principles of the CIA model– Confidentiality, Integrity and Availability. Topics covered include IT security threats, " +
                            "security techniques, security services, and system security features. Students will also be introduced security framework for organisations. \n ");
                }
            });


            //module 3
        }else if(moduleCode.equals("C203")) {
            tvModuleCode.setText("Module Code: " + moduleCode);

            String moduleName = intentReceived.getStringExtra("C203_Name");
            int moduleYear = intentReceived.getIntExtra("C203_Year",2022 );
            int semester = intentReceived.getIntExtra("C203_Semester",1 );
            int moduleCredit = intentReceived.getIntExtra("C203_ModCredit",4 );
            String venue = intentReceived.getStringExtra("C203_Venue");


            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("This module introduces students to the fundamental skills and knowledge associated " +
                            "with developing database-driven web applications. The scope of this module will cover the development " +
                            "of web pages that can store, search, retrieve, and display data from a database, validate data using client " +
                            "and server-side techniques, use sessions variables for holding information across multiple web pages, use web " +
                            "cookies for remembering previous user activity, and set access control to various web pages based on different " +
                            "user profiles. The language and technologies used in this module include HTML, CSS, php, and JavaScript. ");
                }
            });


            //module 4
        }else if(moduleCode.equals("C218")) {
            tvModuleCode.setText("Module Code: " + moduleCode);

            String moduleName = intentReceived.getStringExtra("C218_Name");
            int moduleYear = intentReceived.getIntExtra("C218_Year", 2022);
            int semester = intentReceived.getIntExtra("C218_Semester", 1);
            int moduleCredit = intentReceived.getIntExtra("C218_ModCredit", 4);
            String venue = intentReceived.getStringExtra("C218_Venue");


            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("Students will be equipped with knowledge in User Experience (UX) design in areas such as " +
                            "requirement gathering, creating and analysis of the User Interfaces (UI) in this module. Students will " +
                            "also gain the skills to offer users an intuitive and responsive experience as they design UI for software " +
                            "platforms on both web and mobile devices. Through this module, students will also learn how to create interactive " +
                            "prototypes using prototyping tools.");
                }
            });

            //module 5
        }else if(moduleCode.equals("C206")) {
            tvModuleCode.setText("Module Code: " + moduleCode);

            String moduleName = intentReceived.getStringExtra("C206_Name");
            int moduleYear = intentReceived.getIntExtra("C206_Year", 2022);
            int semester = intentReceived.getIntExtra("C206_Semester", 1);
            int moduleCredit = intentReceived.getIntExtra("C206_ModCredit", 4);
            String venue = intentReceived.getStringExtra("C206_Venue");


            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("The aim of this module is to introduce students to the fundamental principles and practices of " +
                            "planning, analysis, design, and testing within the context of a Software Development Life Cycle (SDLC). In this " +
                            "module, students will be given the opportunities to apply prevalent software development methodologies and corresponding " +
                            "frameworks to projects of different nature, and through this exposure, develop the ability to align a project’s traits " +
                            "with the appropriate software development methodology.");
                }
            });

            //module 5
        }else if(moduleCode.equals("C349")) {
            tvModuleCode.setText("Module Code: " + moduleCode);

            String moduleName = intentReceived.getStringExtra("C349_Name");
            int moduleYear = intentReceived.getIntExtra("C349_Year", 2023);
            int semester = intentReceived.getIntExtra("C349_Semester", 1);
            int moduleCredit = intentReceived.getIntExtra("C349_ModCredit", 4);
            String venue = intentReceived.getStringExtra("C349_Venue");


            tvModuleCode.setText("Module Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvYear.setText("Academic Year: " + moduleYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvDisplayInfo.setText("Swift is a powerful and intuitive programming language for iOS, iPadOS, macOS, tvOS, and watchOS. " +
                            "Writing Swift code is interactive and fun, the syntax is concise yet expressive, and Swift includes modern features developers love.");
                }
            });
        }

    }
}