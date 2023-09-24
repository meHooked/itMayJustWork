package com.example.walkAbout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MonthlyFragment : Fragment() {

    private lateinit var monthlySteps : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflates the custom fragment layout
        val view: View = inflater.inflate(R.layout.fragment_monthly, container, false)

        // Finds the TextView in the custom fragment
       monthlySteps = view.findViewById(R.id.sample_logview3) as TextView

        // Gets the data from the passed bundle
        val bundle = arguments
        val message = bundle!!.getString("mText")
        //if (message != null) {
        //  Log.i(TAG, message)
        //  }

        // Sets the derived data (type String) in the TextView
       monthlySteps.text = message
        // return inflater.inflate(R.layout.fragment_daily, container, false)
        return view
    }
}