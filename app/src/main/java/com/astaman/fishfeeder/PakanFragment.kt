package com.astaman.fishfeeder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.astaman.fishfeeder.databinding.FragmentPakanBinding


class PakanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pakan,container,false)

        //mengatur saat tombol next ditekan
        /*val binding: FragmentPakanBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pakan, container, false)
        binding.nextBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_pakanFragment_to_kekeruhanFragment)
        )

        return binding.root*/
    }
}