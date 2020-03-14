package dev.fumin.android.navigation.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moveBtn.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            view.findNavController().navigate(action)
        }

    }
}
