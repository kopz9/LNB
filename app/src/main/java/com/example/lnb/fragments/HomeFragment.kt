package com.example.lnb.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lnb.R
import com.example.lnb.databinding.HomeFragmentBinding

class HomeFragment : Fragment(){

    private lateinit var binding : HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = HomeFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNotificacoes.setOnClickListener{

            findNavController().navigate(R.id.action_homeFragment_to_notificationFragment)

        }

        binding.btnPerfil.setOnClickListener{

            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)

        }


    }

}