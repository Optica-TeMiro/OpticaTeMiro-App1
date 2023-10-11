package org.mywire.temiroapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.mywire.temiroapp.ui.main.ActivNoImplementado;
import org.mywire.temiroapp.ui.main.ContactoUno;
import org.mywire.temiroapp.ui.product.ProductsServicesPpal;
import org.mywire.temiroapp.ui.quote.QuoteTurnero;
import org.mywire.temiroapp.ui.store.StoreActivity;
import org.mywire.temiroapp.ui.test.TestPrincipal;
import org.mywire.temiroapp.ui.train.TrainActivity1;
import org.mywire.temiroapp.ui.user.LoginActivity;
import org.mywire.temiroapp.ui.user.RegistroActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupera el valor pasado desde la actividad previa.
        boolean mostrarListaCompleta = getIntent().getBooleanExtra("mostrarListaCompleta", false);

        Button boton1 = findViewById(R.id.btnVerCatalogo);
        Button boton2 = findViewById(R.id.botonTurno);
        Button boton3 = findViewById(R.id.botonEstadoDeCompra);
        ImageButton imagemin = findViewById(R.id.iconoUsuario);
        TextView user_name_main = findViewById(R.id.user_name_main);

        if (mostrarListaCompleta) {
            boton1.setVisibility(View.VISIBLE);
            boton2.setVisibility(View.VISIBLE);
            boton3.setVisibility(View.VISIBLE);
            imagemin.setVisibility(View.GONE);
        } else {
            boton1.setVisibility(View.VISIBLE);
            boton2.setVisibility(View.GONE);
            boton3.setVisibility(View.GONE);
            user_name_main.setVisibility(View.GONE);
            imagemin.setVisibility(View.VISIBLE);
        }
    }








    // Epica 1 - Páginas Principales ---------------------------------------------------------------
    public void iniciarContacto(View view) {
        Intent act = new Intent(this, ContactoUno.class);
        startActivity(act);
    }

    // Epica 2 - Manejo de Usuarios ----------------------------------------------------------------
    public void iniciarLogin(View view) {
        Intent act = new Intent(this, LoginActivity.class);
        startActivity(act);
    }

    // Epica 3 - Productos y Servicios -------------------------------------------------------------
    public void iniciarProdServ(View view) {
        Intent act = new Intent(this, ProductsServicesPpal.class);
        startActivity(act);
    }

    // Epica 4 - Pedidos en Tienda -----------------------------------------------------------------
    public void iniciarStore(View view) {
        Intent iniciar_store = new Intent(this, StoreActivity.class);
        startActivity(iniciar_store);
    }

    // Epica 5 - Turnero de Servicios --------------------------------------------------------------
    public void iniciarTurnero(View view) {
        Intent act = new Intent(this, QuoteTurnero.class);
        startActivity(act);
    }

    // Epica 6 - Pruebas de Visión -----------------------------------------------------------------
    public void iniciarPruebas(View view) {
        Intent act = new Intent(this, TestPrincipal.class);
        startActivity(act);
    }

    // Epica 7 - Ejercicios de Visión --------------------------------------------------------------
    public void iniciarEjercicios(View view) {
        Intent act = new Intent(this, TrainActivity1.class);
        startActivity(act);
    }


}
