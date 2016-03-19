package com.example.alvarobs.inventariopat;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alvarobs.inventariopat.VO.LocalVO;


public class CadastrarLocalActivity extends AppCompatActivity {
    public static final String LOCAL = "LOCAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_local);
    }

    public void salvarEDefinirLocal(View view) {
        Intent extras = new Intent();
        extras.putExtra(LOCAL, getLocal());
        setResult(RESULT_OK, extras);
        finish();

    }
    public LocalVO getLocal(){
        EditText edLocal = (EditText) findViewById(R.id.local);
        EditText edLocalID = (EditText)findViewById(R.id.localID);
        String local = edLocal.getText().toString();
        String localID = edLocalID.getText().toString();
        LocalVO result  = new LocalVO();
        result.setLocal(local);
        result.setIdLocal(localID);
        return result;
    }

    public void localizarGPS(View view) {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        for(String provider : locationManager.getAllProviders()){
            Toast.makeText(getApplicationContext(), provider, Toast.LENGTH_LONG).show();

        }

    }

    public void abrirMaps(View view, String coordenadas) {
        coordenadas="http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(coordenadas));
        startActivity(intent);
    }
}
