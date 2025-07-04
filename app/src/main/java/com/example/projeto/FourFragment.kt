package com.example.projeto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projeto.databinding.FragmentFirstBinding
import com.example.projeto.databinding.FragmentFourBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FourFragment : Fragment() {

    private var _binding: FragmentFourBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.anteriorC.setOnClickListener {
            findNavController().navigate(R.id.action_FourFragment_to_ThirdFragment)
        }
        binding.seguinteC.setOnClickListener {
            findNavController().navigate(R.id.action_FourFragment_to_ThirdFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}