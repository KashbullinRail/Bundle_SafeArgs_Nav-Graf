package com.example.bundle_safeargs_nav_graf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnGo:Button = view.findViewById(R.id.btnGo)
        val etText: EditText = view.findViewById(R.id.etText)

//         для bundle
//        val bundle = Bundle()

        btnGo.setOnClickListener {
            val name = etText.text
            val hello = "Привет, $name"

//            для bundle
//            bundle.putString("MyArgsNav", hello)

            val action = FragmentOneDirections.actionFragmentOneToFragmentTwo(hello)
            findNavController().navigate(action)
        }




    }
}