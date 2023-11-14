package br.senai.sp.jandira.retrofit_api_livraria

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CadastroLivroImagem : AppCompatActivity() {

    //ATRIBUTOS DE MANIPULAÇÃO DE ENDEREÇOS DAS IMAGENS.
    private var imageUriGRD: Uri? = null
    private var imageUriPEQ: Uri? = null

    //CONFIGURAÇÕES DO FIRE BASE
    //DECLARAÇÃO DO STORAGE
    //private lateinit var storageRef:


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_livro_imagem)

        //TESTE DE RECEBIMENTO DO JSON
        val bodyJson = intent.getStringExtra("boryJSON")
        Log.e("Teste-Json", bodyJson.toString())



    }
}