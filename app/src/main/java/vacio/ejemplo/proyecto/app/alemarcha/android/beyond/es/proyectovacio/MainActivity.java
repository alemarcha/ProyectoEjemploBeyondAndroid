package vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.adapter.ProductAdapter;
import vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.model.Product;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.my_recycler_view)
    RecyclerView recyclerViewLista;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // Buscamos la vista que vamos(Esto los sustituimos por la inyección de dependencias @Bind)
        //recyclerViewLista = (RecyclerView) findViewById(R.id.my_recycler_view);

        List<Product> lst = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setText1("hola" + i);
            p.setText2("hola" + i);
            lst.add(p);

        }

        recyclerViewLista.setAdapter(new ProductAdapter(lst));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewLista.setLayoutManager(layoutManager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
