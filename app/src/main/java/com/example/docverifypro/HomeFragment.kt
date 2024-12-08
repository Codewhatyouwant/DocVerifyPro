package com.example.docverifypro

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.docverifypro.databinding.FragmentHome2Binding
import com.google.android.material.button.MaterialButton


class HomeFragment : Fragment() {



//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    private var _binding: FragmentHome2Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentHome2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.resumecheck.setOnClickListener {
            val intent = Intent(requireContext(), ResumeSavedSkills::class.java)
            startActivity(intent)

        }
        binding.webcheck.setOnClickListener{
            val intent = Intent(requireContext(), ScanWebActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}