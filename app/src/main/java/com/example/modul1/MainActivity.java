package com.example.modul1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar usia;
    EditText UserName, UserContact, Jenishewan, UserComment;
    Button SubmitSave;
    RadioButton Jantanbtn, Betinabtn;
    CheckBox kecil, sedang, besar;
    TextView us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("State", "onCreate");
        setContentView(R.layout.activity_main);
        usia = findViewById(R.id.usia);
        UserName = findViewById(R.id.userName);
        Jenishewan = findViewById(R.id.jenishewan);
        UserContact = findViewById(R.id.userContact);
        UserComment = findViewById(R.id.usercomment);
        Jantanbtn = findViewById(R.id.Jantan);
        Betinabtn = findViewById(R.id.Betina);
        kecil = findViewById(R.id.KECIL);
        sedang = findViewById(R.id.SEDANG);
        besar = findViewById(R.id.BESAR);
        SubmitSave = findViewById(R.id.btnSubmit);

        //usia
        usia = findViewById(R.id.usia);
        us = findViewById(R.id.us);
        usia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                us.setText(String.valueOf(progress + " Tahun"));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("State", "onResume");
    }

    public void kirim(View view) {

        //Toast
        String vuserName = UserName.getText().toString();
        String vuserContact = UserContact.getText().toString();
        String vjenishewan = Jenishewan.getText().toString();
        String vdeskripsi = UserComment.getText().toString();
        String vusia = String.valueOf(us.getText());

        //jenis kelamin
        String a = "";

        //Ukuran Tubuh
        String b = "";


        //untuk radioButton {Jenis Kelamin}
        if (Jantanbtn.isChecked()) {
            a += "Jantan";
        }
        if (Betinabtn.isChecked()) {
            a += "Betina";
        }

        //untuk checkbox {Ukuran Tubuh}
        if (kecil.isChecked()) {
            b += "Kecil";
        }
        if (sedang.isChecked()) {
            b += "Sedang";
        }
        if (besar.isChecked()) {
            b += "Besar";
        }

        Toast.makeText(getApplicationContext(), "Nama Pemilik : "+vuserName+ "\n"+ "No Telpon : "+vuserContact+ "\n"+
                "Jenis Hewan : "+vjenishewan+ "\n"+ "Jenis Kelamin : "+a+ "\n"+ "Ukuran Tubuh : "+b+ "\n"+ "Usia : "+vusia+ "\n"+
                "Deskripsi : "+vdeskripsi+ "\n", Toast.LENGTH_SHORT).show();


        Intent i1 = new Intent(this, Modul2Activity.class);
        i1.putExtra("Nama Pemilik", UserName.getText().toString());
        i1.putExtra("No Telpon", UserContact.getText().toString());
        i1.putExtra("Jenis Hewan", Jenishewan.getText().toString());
        i1.putExtra("Jenis Kelamin", a);
        i1.putExtra("Ukuran Tubuh", b);
        i1.putExtra("usia", us.getText().toString());
        i1.putExtra("Deskripsi", UserComment.getText().toString());
        startActivity(i1);
    }
}

