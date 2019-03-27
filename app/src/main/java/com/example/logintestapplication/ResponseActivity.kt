package com.example.logintestapplication


import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.show_response.*

class ResponseActivity:Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_response)

        response_text.setOnClickListener{
            finish()
        }
    }
}