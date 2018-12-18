package com.example.prasa.navsample.ui.age


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.prasa.navsample.R
import com.example.prasa.navsample.ui.main.MainFragment
import kotlinx.android.synthetic.main.fragment_age.*

class AskMyAddressFragment : androidx.fragment.app.Fragment() {

    private lateinit var address: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        address = AskMyAgeFragmentArgs.fromBundle(arguments).myname
        helloEnterAge.hint = "Hello $address! What's your address?"

        buttonWelcomeWithAge.setOnClickListener {
            val age: Int = helloEnterAge.text.toString().toInt()
            if(MainFragment.isTextEmpty(age.toString())) {
                helloEnterAge.error = "Please enter address"
            } else {
                val action = AskMyAddressFragmentDirections.actionAddressFragmentToWelcomeWithAddressFragment()
                action.setMyage(age)
                action.setMyname(address)
                findNavController().navigate(action)
            }
        }
    }
}