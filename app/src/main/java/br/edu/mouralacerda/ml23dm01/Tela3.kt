package br.edu.mouralacerda.ml23dm01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val nome = intent.extras!!.getString("nome")!!
        val email = intent.extras!!.getString("email")!!
        val curso = intent.extras!!.getString("curso")!!
        val periodo = intent.extras!!.getString("periodo")!!

        findViewById<TextView>(R.id.txtNome).text = nome
        findViewById<TextView>(R.id.txtEmail).text = email
        findViewById<TextView>(R.id.txtCurso).text = curso
        findViewById<TextView>(R.id.txtPeriodo).text = periodo
    }
}