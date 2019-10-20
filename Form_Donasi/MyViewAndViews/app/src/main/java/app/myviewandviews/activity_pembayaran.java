package app.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_pembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        if (getActionBar() !=null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(activity_pembayaran.this,MainActivity.class);
        startActivity(intent);
    }
}