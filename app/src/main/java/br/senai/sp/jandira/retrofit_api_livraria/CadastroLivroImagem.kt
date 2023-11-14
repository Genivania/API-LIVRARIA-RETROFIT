package br.senai.sp.jandira.retrofit_api_livraria

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class CadastroLivroImagem : AppCompatActivity() {

    //ATRIBUTOS DE MANIPULAÇÃO DE ENDEREÇOS DAS IMAGENS.
    private var imageUriGRD : Uri? = null
    private var imageUriPEQ : Uri? = null

    //CONFIGURAÇÕES DO FIRE BASE
    //DECLARAÇÃO DO STORAGE
    private lateinit var storageRef: StorageReference

    //DECLARAÇAO DO FIRESTORE DATABASE
    private lateinit var firebaseFirestore: FirebaseStorage

    //OBJETOS DE VIEW DA TELA
    //IMAGEVIEW
    private var btnImgGRD : ImageView? = null
    private var btnImgPEQ : ImageView? = null

    //BUTTON
    private var btnUpload : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_livro_imagem)

        //TESTE DE RECEBIMENTO DO JSON
        val bodyJson = intent.getStringExtra("boryJSON")
        Log.e("Teste-Json", bodyJson.toString())

        //RECUPERA OS ELEMENTOS DE VIEW DE IMAGENS
        btnImgGRD = findViewById<ImageView>(R.id.imgGRD)
        btnImgPEQ = findViewById<ImageView>(R.id.imgPEQ)

        //RECUPERA OS ELEMENTOS DE VIEW DE BUTTON
        btnUpload = findViewById<Button>(R.id.btnCadastrarLivro)


        //TRATAMENTO DO EVENTO DE CLICK DO BOTÃO DE IMAGEM GRANDE

        btnImgGRD?.setOnClickListener {
            Toast(this, "BOTAO DA IMAGEM GRANDE", Toast.LENGTH_LONG).show()
        }

        //TRATAMENTO DO EVENTO DE CLICK DO BOTAO DE IMAGEM PEQUENA
        btnImgPEQ?.setOnClickListener {
            Toast(this, "BOTAO DA IMAGEM PEQUENA", Toast.LENGTH_LONG).show()
        }


        //TRATAMENTO DO EVENTO DE CLICK DO BOTAO DE CADASTRO
        btnUpload?.setOnClickListener {
            Toast(this, "BOTAO DE CADASTRO", Toast.LENGTH_LONG).show()
        }



    }
}