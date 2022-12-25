package com.example.projetosorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){
        var texto = text_resultado

        var text_resultado  = Random().nextInt(11)
        texto.setText("Número sorteado é: $text_resultado")

    }
}