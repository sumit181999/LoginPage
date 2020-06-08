package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        Toast.makeText(this@MainActivity,"We Clicked!",Toast.LENGTH_LONG).show()
    }

    lateinit var etemail:EditText
    lateinit var etpassword:EditText
    lateinit var etbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etemail=findViewById(R.id.editText)
        etpassword=findViewById(R.id.editText2)
        etbutton=findViewById(R.id.button)

        etbutton.setOnClickListener(this)


    }
}
