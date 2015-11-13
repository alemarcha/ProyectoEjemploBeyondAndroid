package vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import vacio.ejemplo.proyecto.app.alemarcha.android.beyond.es.proyectovacio.R;

/**
 * Created by alemarcha26 on 11/11/15.
 */
public class ProductViewHolder extends RecyclerView.ViewHolder {

    private Button button;
    private TextView textView1;
    private TextView textView2;
    private Image image;


    public ProductViewHolder(View itemView) {
        super(itemView);
        button = (Button) itemView.findViewById(R.id.product_element_button);
        textView1 = (TextView) itemView.findViewById(R.id.product_element_textView2);
        textView2 = (TextView) itemView.findViewById(R.id.product_element_textView3);
    }

    public void setTextView1(String name) {
        textView1.setText(name);
    }
}
