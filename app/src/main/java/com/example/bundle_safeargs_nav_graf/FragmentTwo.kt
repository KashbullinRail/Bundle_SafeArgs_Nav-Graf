package com.example.bundle_safeargs_nav_graf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvTextF2: TextView = view.findViewById(R.id.tvTextF2)

//        val text = arguments?.getString("MyArgsNav")

        val args: FragmentTwoArgs by navArgs()
        val text = args.MyArgsNav
        tvTextF2.text = text
    }

}