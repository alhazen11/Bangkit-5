package com.bangkit.alzahid.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bangkit.alzahid.R

class TwoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnDetailCategory:Button = view.findViewById(R.id.btn_detail_category)
        btnDetailCategory.setOnClickListener {
            val oneFragment = OneFragment()
            val bundle = Bundle()
            bundle.putString(OneFragment.EXTRA_NAME, "Data success send")
            oneFragment.arguments = bundle
            val mFragmentManager = fragmentManager
            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.frame_container, oneFragment, OneFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

}