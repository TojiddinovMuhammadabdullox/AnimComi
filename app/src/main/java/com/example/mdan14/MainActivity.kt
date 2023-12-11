package com.example.mdan14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.mdan14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alphabtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
            binding.imageView.startAnimation(animation)

        }
        binding.scalebtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale_anim)
            binding.imageView.startAnimation(animation)

        }
        binding.translatebtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.translate_anim)
            binding.imageView.startAnimation(animation)

        }
        binding.rotatebtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
            binding.imageView.startAnimation(animation)
        }
        binding.combibtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.combination)
            binding.imageView.startAnimation(animation)
        }
    }
}