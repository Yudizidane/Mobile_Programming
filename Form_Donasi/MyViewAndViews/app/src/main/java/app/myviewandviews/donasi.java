package app.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class donasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi);
    }


    public void pindah1(View view) {
        Intent intent = new Intent(donasi.this,activity_pembayaran.class);
        startActivity(intent);

    }

}

