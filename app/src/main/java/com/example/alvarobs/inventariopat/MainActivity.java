package com.example.alvarobs.inventariopat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alvarobs.inventariopat.VO.LocalVO;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 4554;
    private String localInventario;
    private String idLocalInventario;
    private TextView statusLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        statusLocal = (TextView) findViewById(R.id.localDefinido);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inventariar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void definirLocal(View view) {
        Intent intent = new Intent(this, CadastrarLocalActivity.class);
        //startActivity(intent); ==> sem reorno
        startActivityForResult(intent, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            LocalVO l = (LocalVO) data.getSerializableExtra(CadastrarLocalActivity.LOCAL);
            statusLocal.setText(l.getLocal());
            Button b = (Button) findViewById(R.id.btnInventariar);
            b.setEnabled(true);
        }

    }

    public void inventariar(View view) {
        Intent invent = new Intent(this, InventariarActivity.class);
        startActivity(invent);
    }

    public void concluirEnviar(View view) {

    }


}
