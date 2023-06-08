package com.skydevices.appalcoolgasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {



    private lateinit var btnCalcular : Button
    private lateinit var textAlcool : TextInputEditText
    private lateinit var textGasolina : TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.setTitle("App Alcool ou gasolina");


        textAlcool = findViewById(R.id.text_alcool)
        textGasolina = findViewById(R.id.text_gasolina)
        btnCalcular = findViewById(R.id.btnCalcular)
        btnCalcular.setOnClickListener {

            val textoGasolina = textGasolina.text.toString()
            val textoAlcool = textAlcool.text.toString()

            if(textoGasolina.isNotEmpty()){
                if(textoAlcool.isNotEmpty()){

                    val doubleGasolina = textoGasolina.toDouble()
                    val doubleAlcool = textoAlcool.toDouble()

                    val intent = Intent(this, DetalhesActivity::class.java)
                    intent.putExtra("Gasolina", doubleGasolina)
                    intent.putExtra("Alcool", doubleAlcool)
                    startActivity(intent)

                }else{
                    Toast.makeText(this, "digite um valor Valido Para Alcool", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "digite um valor Valido Para Gasolina", Toast.LENGTH_SHORT).show()
            }

        }





    }
}