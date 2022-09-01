package com.example.combustivel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.combustivel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)



    }

    override fun onClick(view: View) {
        if (view.id == R.id.button) {
                    calcular()
        }
    }

    private fun calcular() {
        val valorAlcool = binding.editAlcool.text.toString()
        val valorGasolina = binding.editGasolina.text.toString()

        if ((valorAlcool == "") or (valorGasolina == "") ) {
            Toast.makeText(this, "Um ou os dois campos estão vazios", Toast.LENGTH_LONG ).show()
        } else {
            val vAlcool = binding.editAlcool.text.toString().toFloat()
            val vGasolina = binding.editGasolina.text.toString().toFloat()

            val divisao = vAlcool / vGasolina

            if (divisao <= 0.7) {

                binding.textResultado.setText("Coloque Alcool")

            } else if (divisao > 0.7){
                binding.textResultado.setText("Coloque Gasolina")
            }else{
                Toast.makeText(this, "Valor inválido", Toast.LENGTH_LONG ).show()
            }


        }

    }
}