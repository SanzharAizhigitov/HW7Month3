package com.geektech.hw7month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.hw7month3.databinding.FragmentBlankINFOBinding
import com.geektech.hw7month3.databinding.ItemRickBinding

class BlankFragmentINFO : Fragment() {
  lateinit var binding: FragmentBlankINFOBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlankINFOBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       var rick = arguments?.getSerializable("rick") as Rick
        binding.imgI.setImageResource(rick.img)
        binding.aliveORNotI.text = rick.aliveOrNot.toString()
        binding.nameI.text = rick.name.toString()
    }




}
