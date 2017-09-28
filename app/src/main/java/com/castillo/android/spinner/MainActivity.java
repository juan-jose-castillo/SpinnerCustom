package com.castillo.android.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        items= getResources().getStringArray(R.array.generos_musicales);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.spinner_item_custom,items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
                    break;
                    case 1:
                        Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
                    break;
                    case 2:
                        Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
                    break;
                    /*
                    etc///
                    //
                    /
                    /
                    /
                     */
                    }
                }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
