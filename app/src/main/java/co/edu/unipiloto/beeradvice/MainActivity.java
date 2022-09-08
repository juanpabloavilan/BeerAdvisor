package co.edu.unipiloto.beeradvice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.cervezas);
        Spinner spinnerColors = (Spinner) findViewById(R.id.spinner);
        String beerColor = String.valueOf(spinnerColors.getSelectedItem());
        String beer = BeerExpert.getBrands(beerColor);
        brands.setText(beer);
    }
}