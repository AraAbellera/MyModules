package sg.edu.rp.c346.id22014114.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnC203;
    Button btnC206;
    Button btnC218;
    Button btnC235;
    Button btnC346;
    Button btnG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC203 = findViewById(R.id.btnC203);
        btnC206 = findViewById(R.id.btnC206);
        btnC218 = findViewById(R.id.btnC218);
        btnC235 = findViewById(R.id.btnC235);
        btnC346 = findViewById(R.id.btnC346);
        btnG953 = findViewById(R.id.btnG953);

        btnC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);

            }
        });

        btnC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);

            }
        });

        btnC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);

            }
        });

        btnC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C235");
                startActivity(intent);

            }
        });

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);

            }
        });

        btnG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "G953");
                startActivity(intent);

            }
        });

    }
}