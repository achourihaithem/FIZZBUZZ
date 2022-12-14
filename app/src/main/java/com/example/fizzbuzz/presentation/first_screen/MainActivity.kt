package com.example.fizzbuzz.presentation.first_screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fizzbuzz.R
import com.example.fizzbuzz.databinding.ActivityMainBinding
import com.example.fizzbuzz.domain.model.GameModel
import com.example.fizzbuzz.presentation.second_screen.ResultActivity
import com.example.fizzbuzz.utils.Constants
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        resources.getString(R.string.app_title).uppercase().also { binding.title.text = it }
        resources.getString(R.string.button_text).uppercase().also { binding.validateBtn.text = it }
        binding.validateBtn.setOnClickListener { validateInputs() }

    }

    /**
     * Check if All inputs are validated
     */
    private fun validateInputs() {
        binding.firstIntLayout.helperText =
            viewModel.validFirstInteger(binding.firstIntEdt.text.toString())
        binding.secondIntLayout.helperText = viewModel.validSecondInteger(
            binding.firstIntEdt.text.toString(),
            binding.secondIntEdt.text.toString()
        )
        binding.limitLayout.helperText = viewModel.validLimit(
            binding.secondIntEdt.text.toString(),
            binding.limitEdt.text.toString()
        )
        binding.firstStringLayout.helperText =
            viewModel.validStrings(binding.firstStringEdt.text.toString())
        binding.secondStringLayout.helperText =
            viewModel.validStrings(binding.secondStringEdt.text.toString())

        val isValidFirstInt = binding.firstIntLayout.helperText == null
        val isValidSecondInt = binding.secondIntLayout.helperText == null
        val isValidLimit = binding.limitLayout.helperText == null
        val isValidFirstString = binding.firstStringLayout.helperText == null
        val isValidSecondString = binding.secondStringLayout.helperText == null

        if (isValidFirstInt && isValidSecondInt && isValidLimit && isValidFirstString && isValidSecondString) {
            val gameModel = GameModel(
                binding.firstIntEdt.text.toString().toInt(),
                binding.secondIntEdt.text.toString().toInt(),
                binding.limitEdt.text.toString().toLong(),
                binding.firstStringEdt.text.toString(),
                binding.secondStringEdt.text.toString()
            )

            resetForm()
            navigateToResultScreen(gameModel)
        }
    }

    private fun navigateToResultScreen(gameModel: GameModel) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Constants.DATA_GAME, gameModel)
        startActivity(intent)
    }

    /**
     * Reset form with empty information and clear helperText
     */
    private fun resetForm() {
        binding.firstIntLayout.helperText = ""
        binding.secondIntLayout.helperText = ""
        binding.limitLayout.helperText = ""
        binding.firstStringLayout.helperText = ""
        binding.secondStringLayout.helperText = ""

        binding.firstIntEdt.setText("")
        binding.secondIntEdt.setText("")
        binding.limitEdt.setText("")
        binding.firstStringEdt.setText("")
        binding.secondStringEdt.setText("")
    }


}