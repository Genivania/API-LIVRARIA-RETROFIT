package br.senai.sp.jandira.retrofit_api_livraria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import com.google.gson.JsonObject
import kotlinx.coroutines.launch
import retrofit2.create

class Cadastro_Categoria : AppCompatActivity() {

    private lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_categoria)


        //CONECTA apiService COM A API REST ATRAVES DA CLASSE RetrofitHelper
        // E SEU MÉTODO getinstance()
        apiService = RetrofitHelper.getInstance().create(ApiService::class.java)

        //RECUPERA O COMPONENTE GRÁFICO DE EditText
        val txtCategoria = findViewById<EditText>(R.id.txtCategoria)

        //TRATA A AÇÃO DE CLIQUE OU TOQUE NO BOTÃO CADASTRAR
        findViewById<Button>(R.id.bntCadastrarCategoria).setOnClickListener{


        //RECUPERAR O DADO DIGITADO PELO USUARIO
        val nomeCategoria = txtCategoria.text

        // ENVIAR A REQUISIÇAO DE CADASTRO PARA A API
        createCategory(nomeCategoria.toString())

        }

    }//FIM DO METODO onCreate

    //IMPLEMENTAÇAO DO METODO createCategory
    private  fun createCategory(nome_categoria: String){
        lifecycleScope.launch {

            //MONTAGEM DO CORPO DE DADOS EM JSON
            val body = JsonObject().apply {
                addProperty("nome_categoria", nome_categoria)
            }

            //ENVIO DA REQUISIÇÃO DE CADASTRO DE CATEGORIA
            var result = apiService.createCategory(body)

            //VERIFICANDO A RESPOSTA DA REQUISIÇÃO
            if (result.isSuccessful){
                val msg = result.body()?.get("mensagemStatus")
                Log.e("CREATE-CATEGORY", "STATUS: ${msg}")
            }else{
                Log.e("CREATE-CATEGORY", "ERROR: ${result.message()}")
            }
        }
    }

}//FIM DA CLASSE