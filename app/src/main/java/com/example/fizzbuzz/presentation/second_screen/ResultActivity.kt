package com.example.fizzbuzz.presentation.second_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fizzbuzz.databinding.ActivityResultBinding
import com.example.fizzbuzz.domain.model.GameModel
import com.example.fizzbuzz.utils.Constants
import org.koin.android.ext.android.inject

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private val viewModel: ResultViewModel by inject()
    //private val itemRVAdapter: ItemRVAdapter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myData = intent.getSerializableExtra(Constants.DATA_GAME) as? GameModel


        if (myData != null) {
            binding.title.setText(
                "the result of inserted parameters:\n ${myData.firstInt}" +
                        ", ${myData.str1}, ${myData.secondInt}, ${myData.str2} & ${myData.limit} is :"
            )
            binding.idRvItems.layoutManager = GridLayoutManager(this, 1)
            binding.idRvItems.adapter = ItemRVAdapter(viewModel.showData(myData))
            //binding.idRvItems.adapter=itemRVAdapter
        }


    }

}