package com.astaman.fishfeeder

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.astaman.fishfeeder.databinding.FragmentHomeBinding
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)

        //untuk mengatur tujuan saat tombol mulai diklik
        //val binding: FragmentHomeBinding = DataBindingUtil.inflate(
           // inflater, R.layout.fragment_home, container, false)
        /*binding.startBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_pakanFragment)
        )
        setHasOptionsMenu(true)

        return binding.root*/
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        return super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

}