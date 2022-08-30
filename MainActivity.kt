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

        val valorAlcool = binding.editAlcool.text.toString().toFloat() //valor de alcool
        val valorGasolina = binding.editGasolina.text.toString().toFloat() //valor de gasolina

        val divisao = valorAlcool / valorGasolina
        if (divisao <= 0.7) {

            binding.textResultado.setText("Coloque Alcool")

        } else {
            binding.textResultado.setText("Coloque Gasolina")
        }
        Toast.makeText(
            this, "Promoção no posto da 510 Sul", Toast.LENGTH_LONG ).show()
    }
}