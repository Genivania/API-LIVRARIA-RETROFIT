package br.senai.sp.jandira.retrofit_api_livraria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CadastroLivroImagem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_livro_imagem)

        //TESTE DE RECEBIMENTO DO JSON
        val bodyJson = intent.getStringExtra("boryJSON")
        Log.e("Teste-Json", bodyJson.toString())
    }
}