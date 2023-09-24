package com.example.walkAbout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class WeeklyFragment : Fragment() {

    private lateinit var weeklySteps : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflates the custom fragment layout
        val view: View = inflater.inflate(R.layout.fragment_weekly, container, false)

        // Finds the TextView in the custom fragment
        weeklySteps = view.findViewById(R.id.sample_logview2) as TextView

        // Gets the data from the passed bundle
        val bundle = arguments
        val message = bundle!!.getString("mText")
        //if (message != null) {
        //  Log.i(TAG, message)
        //  }

        // Sets the derived data (type String) in the TextView
       weeklySteps.text = message
        // return inflater.inflate(R.layout.fragment_daily, container, false)
        return view
    }

}