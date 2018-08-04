package com.techespo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] countryArray = {"Select","India","America","Singapore"};
        final Integer [] ageArray = {10,12,15,20,80,90};

        final Spinner spinnerDropDownMode = (Spinner) findViewById(R.id.spinner_dropdown_mode);
        final Spinner spinnerDialogMode = (Spinner) findViewById(R.id.spinner_dialog_mode);

        ArrayAdapter<String> adapterOne = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item,countryArray);
        spinnerDropDownMode.setAdapter(adapterOne);

        ArrayAdapter<Integer> adapterTwo = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_dropdown_item,ageArray);
        spinnerDialogMode.setAdapter(adapterTwo);

        spinnerDropDownMode.setSelection(2);
        spinnerDropDownMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected item:"
                        + countryArray[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
