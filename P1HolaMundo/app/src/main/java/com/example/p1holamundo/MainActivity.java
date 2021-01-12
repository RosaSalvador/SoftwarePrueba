package com.example.p1holamundo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creación de variables miembro o variables de instancia(ivar)

    private Button HelloButton;
    private Button WorldButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inflar widgets
        HelloButton = findViewById(R.id.hello_button);
        WorldButton = findViewById(R.id.world_button);

        //Programación de evento onClick
        HelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.hello,Toast.LENGTH_SHORT).show();
            }
        });

        WorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"HOLAMUNDO PRUWBA 12",Toast.LENGTH_SHORT).show();
            }
        });
    }
}