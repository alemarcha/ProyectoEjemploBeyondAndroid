package vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.R;
import vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.model.Product;

/**
 * Created by alemarcha26 on 11/11/15.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private List<Product> listProduct;

    public ProductAdapter(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Crea cada uno de los elementos de la vista
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_element, parent, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.setTextView1(listProduct.get(position).getText1());

        //TODO limpiar el resto del elemento
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }
}
