package br.ufg.inf.fs.android.a02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by fabio_000 on 22/04/2014.
 */
public class TerceiraActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceira);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_terceira, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menuterceira_segunda) {
            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menuterceira_fechar) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}