package br.ufg.inf.fs.android.a2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by kyriosdata on 4/15/14.
 */
public class SegundaActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.segunda);
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.segundo_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcao_sair || id == R.id.opcao_atividade1) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}