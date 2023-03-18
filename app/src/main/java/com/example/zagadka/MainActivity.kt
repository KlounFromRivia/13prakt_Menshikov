package com.example.zagadka

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.zagadka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnZagadka.isEnabled = true
        binding.btnOtvet.isEnabled = false
        binding.btnStatic.isEnabled = false
        staticBTN()

    }
    fun staticBTN(){
        if (binding.btnZagadka.isEnabled == true)
            binding.btnZagadka.setBackgroundColor(resources.getColor(R.color.btnColor))
        else
            binding.btnZagadka.setBackgroundColor(resources.getColor(R.color.gray))
        if (binding.btnOtvet.isEnabled == true)
            binding.btnOtvet.setBackgroundColor(resources.getColor(R.color.btnColor))
        else
            binding.btnOtvet.setBackgroundColor(resources.getColor(R.color.gray))
        if (binding.btnStatic.isEnabled == true)
            binding.btnStatic.setBackgroundColor(resources.getColor(R.color.btnColor))
        else
            binding.btnStatic.setBackgroundColor(resources.getColor(R.color.gray))
    }
    fun btnZagadkaClick(view: View)
    {
        binding.btnZagadka.isEnabled = false
        binding.btnOtvet.isEnabled = true
        staticBTN()
    }

    fun btnOtvetClick(view: View)
    {

    }

    fun btnStaticClick(view: View)
    {

    }
}