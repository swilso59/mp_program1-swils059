package com.example.helloworldplus

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.helloworldplus.R

class FragmentMain : Fragment() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var editText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        editText = view.findViewById(R.id.editText)
        textView = view.findViewById(R.id.textView)
        button = view.findViewById(R.id.myButton)

        button.setOnClickListener {
            val name = editText.text.toString().trim()
            if (name.isNotEmpty()) {
                val greeting = "Hello, $name!"
                textView.text = greeting
                Log.v("FragmentMain", "Name entered: $name")
            }

        }
        return view
    }
}


