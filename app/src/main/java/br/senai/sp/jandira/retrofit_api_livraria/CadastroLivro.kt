package br.senai.sp.jandira.retrofit_api_livraria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.gson.JsonObject

class CadastroLivro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_livro)

        //DECLARANDO E RECUPERANDO OS OBJETOS D VIEW
        val txtTitulo = findViewById<EditText>(R.id.txtTitulo)
        val txtPreco = findViewById<EditText>(R.id.txtPreco)
        val txtCategoria = findViewById<EditText>(R.id.txtCategoria)
        val txtDescricao = findViewById<EditText>(R.id.txtLivroDescricao)
        val btnCadastar = findViewById<Button>(R.id.btnCadastrarLivro)


        //TRATAMENTO DA AÇÃO DE CLIQUE DO BOTAO CADASTRAR
        btnCadastar.setOnClickListener{

            //ENTRADA DOS DADOS DE LIVRO
            val titulo = txtTitulo.text.toString()
            val preco = txtPreco.text.toString()
            val categoria = txtCategoria.text.toString()
            val descricao = txtDescricao.text.toString()

            //MONTAGEM DO CORPO JSON DOS DADOS DE LIVRO
            val bory = JsonObject().apply {
                addProperty("titulo", titulo)
                addProperty("preco", preco)
                addProperty("categoria", categoria)
                addProperty("descricao", descricao)
            }

            //TESTE DO CORPO DE DADOS DO JSON
            Log.e("BORY-JSON", bory.toString())


            //NAVEGACAO PARA TELA DE IMAGENS E LIVRO
            val intent = Intent(this, CadastroLivroImagem::class.java).apply {
                putExtra("boryJSON", bory.toString())
            }

        startActivity(intent)
        }
    }
}