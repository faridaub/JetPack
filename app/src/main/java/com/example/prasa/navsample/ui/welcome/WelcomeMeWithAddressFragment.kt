package com.example.prasa.navsample.ui.welcome


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.prasa.navsample.R
import kotlinx.android.synthetic.main.fragment_welcome_with_address.*

/**
 * A simple [Fragment] subclass.
 *
 */
class WelcomeMeWithAddressFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_with_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentArgs = WelcomeMeWithAgeFragmentArgs.fromBundle(arguments)
        val name = fragmentArgs.myname
        val address = fragmentArgs.myage

        welcomewithNameandAddress.text = "Welcome $name! Your address is $address"

        back_to_home.setOnClickListener {

            val action = WelcomeMeWithAddressFragmentDirections.actionWelcomeWithAddressFragmentToMainFragment()
            findNavController().navigate(action)

        }

    }
}
