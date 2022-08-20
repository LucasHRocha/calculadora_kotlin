package com.calculadora.calculadora_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!= ""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sum = no1+no2

                Toast.makeText(this, "A soma é $sum", Toast.LENGTH_LONG).show()

            }else {
                Toast.makeText(this, "Preencha todos os campos obrigatórios.", Toast.LENGTH_LONG).show()
            }
        }
        btnSub.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!= ""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var sub : Int

                sub = if (no1>no2){
                    no1-no2
                } else {
                    no2-no1
                }

                Toast.makeText(this, "A diferença é $sub", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Preencha todos os campos obrigatórios.", Toast.LENGTH_LONG).show()
            }
        }

        btnMultiply.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!= ""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1*no2


                Toast.makeText(this, "O produto é $mul", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Preencha todos os campos obrigatórios.", Toast.LENGTH_LONG).show()
            }
        }

        btnDiv.setOnClickListener {
            if (edtNo1.text.toString()!="" && edtNo2.text.toString()!= ""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var div : Int

                if (no2==0){
                    div = 0
                    Toast.makeText(this, "Um número não pode ser dividido por zero, infinitas soluções", Toast.LENGTH_LONG).show()
                }else {
                    div = no1 / no2
                }

                Toast.makeText(this, "A divisão é $div", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "Preencha todos os campos obrigatórios.", Toast.LENGTH_LONG).show()
            }
        }
    }
}