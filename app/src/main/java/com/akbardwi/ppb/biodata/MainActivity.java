package com.akbardwi.ppb.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAlamat = (Button)findViewById(R.id.btnAlamat);
        Button btnTelpon = (Button)findViewById(R.id.btnTelpon);
        Button btnEmail = (Button)findViewById(R.id.btnEmail);
        btnAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("geo:-6.914590,109.714586?z=30");
                getData(uri);
            }
        });
        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("tel:085326629159");
                getData(uri);
            }
        });
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("mailto:admin@mail.akbardwi.my.id");
                getData(uri);
            }
        });
    }

    public void getData(Uri uri) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}