package com.example.homework21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework21.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    private var binding: FragmentFirstBinding? = null
    private var adapter: AdapterPicture? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initPicture()
    }


    private fun initPicture() {
        adapter = AdapterPicture()
        adapter?.picList = listOf(
            Picture("https://i.pinimg.com/originals/fa/72/4f/fa724f241796b06b26de0c6f1bcb1bc6.jpg"),
            Picture("https://i.pinimg.com/originals/7f/39/c3/7f39c307f281f7f340a2e4cf57675ea7.png"),
            Picture("https://i.pinimg.com/originals/b5/c4/9c/b5c49cdcea8576d083dac42778a86e1a.png")
        )
        binding?.rvPicture?.adapter = adapter
        binding?.rvPicture?.layoutManager = LinearLayoutManager(requireContext())
    }



}