package com.puspaanggraeni.portofolio


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class main : Fragment() {

    lateinit var nav: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onCrateView{view: View, savedInstanceSatate:Bundle?}{
        super.onViewCreated(view, savedInstanceState)
        nav = Navigation.findNavController(view)

        buttonutama.setOnClickListener{it:View!
                nav.navigate(R.id.action_main_to_inputFragment)
    }
    }


}
