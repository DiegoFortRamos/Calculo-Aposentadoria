package ramos.diego.calculaaposentadoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        val txt_idade = findViewById<EditText>(R.id.txt_edit_idade)
        val btn_calcular= findViewById<Button>(R.id.btn_calcular)
        val txt_resultado = findViewById<TextView>(R.id.resultado)

        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, listOf(
            "masculino","feminino"

        ))

        btn_calcular.setOnClickListener {
            val sexo = spn_sexo.selectedItem as String
            val idade = txt_idade.text.toString().toInt()
            var resultado = 0

            if (sexo == "feminino"){
                resultado = 60 - idade
            }else{
                resultado = 65 - idade
            }

            txt_resultado.text = "Faltam $resultado anos para você se aposentar";




        }

    }

}