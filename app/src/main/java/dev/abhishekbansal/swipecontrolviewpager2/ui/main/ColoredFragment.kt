package dev.abhishekbansal.swipecontrolviewpager2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.abhishekbansal.swipecontrolviewpager2.databinding.FragmentMainBinding

class ColoredFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.binding = FragmentMainBinding.inflate(inflater, container, false)
        arguments?.getInt(ARG_BG_COLOR)?.let {
            binding?.root?.setBackgroundColor(it)
        }

        return binding?.root
    }

    companion object {
        private const val ARG_BG_COLOR = "background_color"

        @JvmStatic
        fun newInstance(color: Int): ColoredFragment {
            return ColoredFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_BG_COLOR, color)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this.binding = null
    }
}