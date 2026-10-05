package com.example.a051026_itsbbmk_menupunto;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusito, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.sumita || item.getItemId() == R.id.sum){
            suma FrgSuma = new suma();
            reemplazafragmento(FrgSuma);
        }
        else if (item.getItemId() == R.id.resta || item.getItemId() == R.id.rest) {
            resta FrgResta = new resta();
            reemplazafragmento(FrgResta);
        }
        else if (item.getItemId() == R.id.multiplicacion || item.getItemId() == R.id.mult) {
            multiplicacion FrgMult = new multiplicacion();
            reemplazafragmento(FrgMult);
        }
        else if (item.getItemId() == R.id.division || item.getItemId() == R.id.div) {
            division FrgDiv = new division();
            reemplazafragmento(FrgDiv);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    private void reemplazafragmento(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.basesita,fragment);
        fragmentTransaction.commit();
    }
}