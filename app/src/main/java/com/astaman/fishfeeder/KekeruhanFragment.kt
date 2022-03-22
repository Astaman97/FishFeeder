package com.astaman.fishfeeder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.astaman.fishfeeder.databinding.FragmentKekeruhanBinding
import com.astaman.fishfeeder.databinding.FragmentPakanBinding


class KekeruhanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_kekeruhan, container, false)

        //mengatur saat tombol next ditekan
        val binding: FragmentKekeruhanBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_kekeruhan, container, false)
        binding.aboutBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_kekeruhanFragment_to_tentangFragment)
        )

        return binding.root
    }
}