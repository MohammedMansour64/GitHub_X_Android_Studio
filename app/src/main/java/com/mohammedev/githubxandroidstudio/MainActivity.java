package com.mohammedev.githubxandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CV cv = new CV("Mohammed" , "email@email.com" , "Programmer" , 17 , 911);

                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("age" , cv.getAge());
                intent.putExtra("email" , cv.getEmail());
                intent.putExtra("job" , cv.getJob());
                intent.putExtra("name" , cv.getName());
                intent.putExtra("phone number" , cv.getPhoneNumber());
                startActivity(intent);
            }
        });
    }
}