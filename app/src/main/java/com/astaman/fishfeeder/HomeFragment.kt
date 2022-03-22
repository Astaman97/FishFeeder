package com.astaman.fishfeeder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.astaman.fishfeeder.databinding.FragmentHomeBinding
import androidx.navigation.Navigation


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //untuk mengatur tujuan saat tombol mulai diklik
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)
        binding.startBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_pakanFragment)
        )
        return binding.root
    }


}