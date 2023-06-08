package com.skydevices.appalcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar

class DetalhesActivity : AppCompatActivity() {

    private lateinit var textoGasolina : TextView
    private lateinit var textoAlcool : TextView
    private lateinit var textoResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)
        getSupportActionBar()?.setTitle("Resultado Calculo");

        textoGasolina = findViewById(R.id.textGasolina)
        textoAlcool = findViewById(R.id.textAlcool)
        textoResultado = findViewById(R.id.textResultado)

        val valorGasolina = intent.getDoubleExtra("Gasolina", 0.0)
        val valorAlcool = intent.getDoubleExtra("Alcool", 0.0)

        var resultado = valorAlcool / valorGasolina

        textoGasolina.text = "Preço da Gasolina: R$$valorGasolina"
        textoAlcool.text = "Preço da Álcool: R$$valorAlcool"

        if(resultado > 0.7){
            textoResultado.text = "Gasolina"
        }else{
            textoResultado.text = "Álcool"
        }



    }
}