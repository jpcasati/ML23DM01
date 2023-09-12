package br.edu.mouralacerda.ml23dm01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.extras!!.getString("nome")!!
        val email = intent.extras!!.getString("email")!!

        val curso = findViewById<EditText>(R.id.edtCurso)
        val periodo = findViewById<EditText>(R.id.edtPeriodo)
        val botao = findViewById<ImageButton>(R.id.btnProximo2)

        botao.setOnClickListener {

            val pacote = Bundle()

            pacote.putString("nome", nome)
            pacote.putString("email", email)
            pacote.putString("curso", curso.text.toString())
            pacote.putString("periodo", periodo.text.toString())

            val i = Intent(this, Tela3::class.java)
            i.putExtras(pacote)

            startActivity(i)
        }

    }
}