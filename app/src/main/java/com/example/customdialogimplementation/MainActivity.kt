package com.example.customdialogimplementation

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customdialogimplementation.databinding.ActivityMainBinding
import com.example.customdialogimplementation.databinding.CustomDialogLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewMain.setOnClickListener {

            val dialog = Dialog(this)
            val customDialogLayoutBinding:CustomDialogLayoutBinding = CustomDialogLayoutBinding.inflate(layoutInflater)
            dialog.setContentView(customDialogLayoutBinding.root)
            dialog.show()
        }
    }
}
