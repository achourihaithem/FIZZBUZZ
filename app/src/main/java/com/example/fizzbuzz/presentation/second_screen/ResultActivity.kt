package com.example.fizzbuzz.presentation.second_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fizzbuzz.databinding.ActivityResultBinding
import com.example.fizzbuzz.models.GameModel
import com.example.fizzbuzz.utils.Constants

class ResultActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultBinding
    private val viewModel: ResultViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myData = intent.getSerializableExtra(Constants.DATA_GAME) as? GameModel


        if (myData != null) {
            binding.title.text="the result of inserted parameters:\n ${myData.firstInt}" +
                    ", ${myData.str1}, ${myData.secondInt}, ${myData.str2} & ${myData.limit} is :"
            binding.idRvItems.layoutManager=GridLayoutManager(this, 1)
            binding.idRvItems.adapter= ItemRVAdapter( viewModel.showData(myData))
        }



    }
}