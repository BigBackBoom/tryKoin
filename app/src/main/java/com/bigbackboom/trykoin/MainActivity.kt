package com.bigbackboom.trykoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bigbackboom.trykoin.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import org.koin.androidx.scope.currentScope


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener{
            viewModel.onButtonClicked()
        }
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
