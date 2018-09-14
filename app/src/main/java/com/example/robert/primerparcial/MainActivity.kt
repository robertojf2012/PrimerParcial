package com.example.robert.primerparcial

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //EditText
        var et_ProduccionTotal = findViewById<EditText>(R.id.et_ProduccionTotal)
        var et_ProduccionActual = findViewById<EditText>(R.id.et_ProduccionActual)
        var et_Porcentaje = findViewById<EditText>(R.id.et_Porcentaje)

        //Buttons
        var btn_CalcularTotal = findViewById<Button>(R.id.btn_CalcularTotal)
        var btn_CalcularActual = findViewById<Button>(R.id.btn_CalcularActual)
        var btn_add5 = findViewById<Button>(R.id.btn_add5)
        var btn_add15 = findViewById<Button>(R.id.btn_add15)
        var btn_add30 = findViewById<Button>(R.id.btn_add30)
        var btn_add50 = findViewById<Button>(R.id.btn_add50)
        var btn_Calcular = findViewById<Button>(R.id.btn_Calcular)

        var fondo = findViewById<ConstraintLayout>(R.id.fondoLayout)

        btn_CalcularTotal.setOnClickListener {
            var produccionTotal = et_ProduccionTotal.text.toString().toInt()
            var unidades = produccionTotal*80
            Toast.makeText(this,"Cantidad de manzanas: ${unidades}",Toast.LENGTH_SHORT).show()
        }

        btn_CalcularActual.setOnClickListener {
            var produccionActual = et_ProduccionActual.text.toString().toInt()
            var unidades = produccionActual*80
            Toast.makeText(this,"Cantidad de manzanas: ${unidades}",Toast.LENGTH_SHORT).show()
        }

        btn_add5.setOnClickListener {
            var produccionactual = et_ProduccionActual.text.toString().toInt() + 5
            et_ProduccionActual.setText("${produccionactual}")
        }
        btn_add15.setOnClickListener {
            var produccionactual = et_ProduccionActual.text.toString().toInt() + 15
            et_ProduccionActual.setText("${produccionactual}")
        }
        btn_add30.setOnClickListener {
            var produccionactual = et_ProduccionActual.text.toString().toInt() + 30
            et_ProduccionActual.setText("${produccionactual}")
        }
        btn_add50.setOnClickListener {
            var produccionactual = et_ProduccionActual.text.toString().toInt() + 50
            et_ProduccionActual.setText("${produccionactual}")
        }

        btn_Calcular.setOnClickListener {
            var produccionactual = et_ProduccionActual.text.toString().toInt()
            var producciontotal = et_ProduccionTotal.text.toString().toInt()
            var porcentaje = (produccionactual *100)/producciontotal
            et_Porcentaje.setText("${porcentaje} %")

            if(porcentaje>=70){
                fondo.setBackgroundColor(Color.RED)
            }else{
                fondo.setBackgroundColor(Color.WHITE)
            }
        }

    }
}
