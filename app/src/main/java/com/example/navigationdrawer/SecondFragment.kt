package com.example.navigationdrawer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSecondBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        binding.root.setOnClickListener {
            findNavController().popBackStack()
        }
    }


}