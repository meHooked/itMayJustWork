package com.example.walkAbout

import android.app.Activity
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment

//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.ktx.database
//import com.google.firebase.ktx.Firebase

class DailyFragment : Fragment() {

    private lateinit var dailySteps: TextView
    private lateinit var etDailyGoalSteps: EditText
    private lateinit var bCheckDailySteps: Button
    private lateinit var bSaveDailyGoal: Button
    private lateinit var tvSavedGoalSteps: TextView

    // private lateinit var dbRef : DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflates the custom fragment layout
        val view: View = inflater.inflate(R.layout.fragment_daily, container, false)
        //val firebase : DatabaseReference = FirebaseDatabase.getInstance().reference

        // Finds the TextView in the custom fragment
        dailySteps = view.findViewById(R.id.sample_logview) as TextView
        etDailyGoalSteps = view.findViewById(R.id.etDailyGoalSteps) as EditText
        bCheckDailySteps = view.findViewById(R.id.bCheckDailySteps) as Button
        bSaveDailyGoal = view.findViewById(R.id.bSaveDailyGoal) as Button
        tvSavedGoalSteps = view.findViewById(R.id.tvSavedGoalSteps) as TextView

        // Gets the data from the passed bundle
        val bundle = arguments
        val message = bundle!!.getString("mText")
        Log.i(TAG, "message: $message")

        // Sets the derived data (type String) in the TextView
        dailySteps.text = message.toString()


        bSaveDailyGoal.setOnClickListener {
            saveDailyGoalSteps()
            closeKeyboard()

        }

        return view
    }


    private fun closeKeyboard() {
        val imm =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

    private fun saveDailyGoalSteps() {
        val dailyGoal = etDailyGoalSteps.text.toString()

        if (dailyGoal.isEmpty()) {
            etDailyGoalSteps.error = "Please enter your goal for today!"
        }
        etDailyGoalSteps.text.clear()
        //Toast.makeText(requireContext(),"Clicked",Toast.LENGTH_SHORT).show()
    }


}