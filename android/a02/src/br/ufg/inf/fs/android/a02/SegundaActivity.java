package br.ufg.inf.fs.android.a02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by fabio_000 on 22/04/2014.
 */
public class SegundaActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_segunda, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menusegunda_terceira) {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menusegunda_fechar) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}