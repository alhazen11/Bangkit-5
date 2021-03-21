package com.bangkit.alzahid.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.bangkit.alzahid.R

class OneFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnTwo:Button = view.findViewById(R.id.btn_two)
        val text:TextView = view.findViewById(R.id.txt_one)

        if (arguments != null) {
            val add = arguments?.getString(EXTRA_NAME)
            text.text = add
        }

        btnTwo.setOnClickListener{
                val mTwoFragment = TwoFragment()
                val mFragmentManager = fragmentManager
                mFragmentManager?.beginTransaction()?.apply {
                    replace(R.id.frame_container, mTwoFragment, TwoFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
            }
        }
    }
    companion object {
        var EXTRA_NAME = "extra_name"
    }

}
