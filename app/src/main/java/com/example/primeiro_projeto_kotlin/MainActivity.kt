package com.example.primeiro_projeto_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val calcular = Calcular
        val resultado = Resultado

        calcular.setOnClickListener {
            val nota1 = nota1.text.toString().toFloat()
            val nota2 = Nota2.text.toString().toFloat()
            val notai = NotaAI.text.toString().toFloat()
            val pi = PI.text.toString().toFloat()
            val media = ((nota1 + nota2 + notai) * 0.7) + ((pi) * 0.3)
            val falta = Integer.parseInt(Falta.text.toString())

            if(media>=6 && falta <=10){
                resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" +  String.format("%.1f",media) + "\n" + "Faltas:" + falta)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" +  String.format("%.1f",media) + "\n" + "Faltas:" + falta)
                resultado.setTextColor(Color.RED)
            }
        }
        }






}