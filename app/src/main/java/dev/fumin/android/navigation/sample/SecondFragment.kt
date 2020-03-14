package dev.fumin.android.navigation.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backBtn.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            view.findNavController().navigate(action)
        }
    }
}
