package app.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getActionBar() !=null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }
    public void pindah1 (View view){
        Intent intent = new Intent(MainActivity.this,donasi.class);
        startActivity(intent);

    }
    public void pindah (View view){
        Intent intent = new Intent(MainActivity.this, pembayaran.class);
    }


}
