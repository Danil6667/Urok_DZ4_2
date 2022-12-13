package com.danil.urok_dz4_2.ui.fragments.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentOnBoardPagerBinding

class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when (requireArguments().getInt(ARG_ONBOARD_POSITION)) {
            0 -> {
                lottie.setAnimation(R.raw.lottieone)
                onTxt.text = "Очень удобный функционал"
            }
            1 -> {
                onTxt.text = "Быстрый, качественный продукт"
                lottie.setAnimation(R.raw.lottietwo)
            }
            2 -> {
                lottie.setAnimation(R.raw.lottiethree)
                onTxt.text = "Куча функций и интересных фишек"
            }
        }
    }

    companion object {
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}