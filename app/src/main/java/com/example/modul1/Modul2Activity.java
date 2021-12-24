package com.example.modul1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Modul2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2);

        Button savebutton = findViewById(R.id.savebtn);
        Button exitbutton = findViewById(R.id.exitbtn);

        TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;


            txt1 = findViewById(R.id.userName);
            txt2 = findViewById(R.id.userContact);
            txt3 = findViewById(R.id.jenishewan);
            txt4 = findViewById(R.id.kelamin);
            txt5 = findViewById(R.id.uk);
            txt6 = findViewById(R.id.tampilanusia);
            txt7 = findViewById(R.id.usercomment);

            String UserName = getIntent().getExtras().getString("Nama Pemilik");
            String  UserContact= getIntent().getExtras().getString("No Telpon");
            String JenisHewan = getIntent().getExtras().getString("Jenis Hewan");
            String a = getIntent().getExtras().getString("Jenis Kelamin");
            String b = getIntent().getExtras().getString("Ukuran Tubuh");
            String usia = getIntent().getExtras().getString("usia");
            String UserComment = getIntent().getExtras().getString("Deskripsi");

            txt1.setText(UserName);
            txt2.setText(UserContact);
            txt3.setText(JenisHewan);
            txt4.setText(a);
            txt5.setText(b);
            txt6.setText(usia);
            txt7.setText(UserComment);
            

    }

}