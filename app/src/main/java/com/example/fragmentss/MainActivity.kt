package com.example.fragmentss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentss.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonclock=findViewById<Button>(R.id.btnTime)
        val buttonexamsheet=findViewById<Button>(R.id.btnexam)
        val buttonvalidate=findViewById<Button>(R.id.btnvalidate)
        buttonclock.setOnClickListener{
            replaceframewithfragment(clockfragment())

        }

        buttonexamsheet.setOnClickListener {

            replaceframewithfragment(examsheetfragment())

        }
        buttonvalidate.setOnClickListener {
            replaceframewithfragment(LoginFragment())
        }
    }

    private fun replaceframewithfragment(clockfragment: Fragment) {


        val fragmentmanager=supportFragmentManager
        val fragTransaction=fragmentmanager.beginTransaction()
        fragTransaction.replace(R.id.framelayout,clockfragment)
        fragTransaction.commit()
    }
}