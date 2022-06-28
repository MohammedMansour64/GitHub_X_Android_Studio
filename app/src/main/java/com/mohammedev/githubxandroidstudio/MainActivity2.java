package com.mohammedev.githubxandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String nameString = bundle.getString("name");
        String phoneNumberString = String.valueOf(bundle.getInt("phone number"));

        TextView thing = findViewById(R.id.textView);

        thing.setText(phoneNumberString);








    }
}