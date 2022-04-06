package com.example.uts_160419051.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.uts_160419051.R
import kotlinx.android.synthetic.main.fragment_detail_kuliner.*

class DetailKulinerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_kuliner, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLihatReview.setOnClickListener {
            val action = DetailKulinerFragmentDirections.actionReviewListFragment()
            Navigation.findNavController(it).navigate(action)
        }

        btnTambahReview.setOnClickListener {
            val action = DetailKulinerFragmentDirections.actionAddReviewFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}