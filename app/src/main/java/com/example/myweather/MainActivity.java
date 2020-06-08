package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        Button forecast;
        String langTo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Spinner translateLangs = (Spinner) findViewById(R.id.languages_spinner);

            translateLangs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    switch (i) {
                        case 1:
                            langTo = "Adilabad";
                            break;

                        case 2:
                            langTo = "Agra";
                            break;

                        case 3:
                            langTo = "Ahmedabad";
                            break;

                        case 4:
                            langTo = "Ahmednagar";
                            break;

                        case 5:
                            langTo = "Aizawl";
                            break;

                        case 6:
                            langTo = "Durgapur";
                            break;
                        case 7:
                            langTo = "Ajmer";
                            break;
                        case 8:
                            langTo = "Akola";
                            break;
                        case 9:
                            langTo = "Alappuzha";
                            break;
                        case 10:
                            langTo = "Aligarh";
                            break;
                        case 11:
                            langTo = "Alirajpur";
                            break;
                        case 12:
                            langTo = "Allahabad";
                            break;
                        case 13:
                            langTo = "Almora";
                            break;
                        case 14:
                            langTo = "Alwar";
                            break;
                        case 15:
                            langTo = "Ambala";
                            break;
                        case 16:
                            langTo = "Kolkata";
                            break;
                        case 17:
                            langTo = "Amravati";
                            break;
                        case 18:
                            langTo = "Patna";
                            break;
                        case 19:
                            langTo = "Amritsar";
                            break;
                        case 20:
                            langTo = "Anand";
                            break;
                        case 21:
                            langTo = "Anantapur";
                            break;
                        case 22:
                            langTo = "Anantnag";
                            break;


                        default:
                            break;
                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    // Do nothing
                }
            });
            forecast=findViewById(R.id.forecast_btn);
            forecast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String City=langTo;
                    Intent inter = new Intent(MainActivity.this,Weather.class);
                    inter.putExtra("city",City);
                    startActivity(inter);
                }
            });
        }
    }

