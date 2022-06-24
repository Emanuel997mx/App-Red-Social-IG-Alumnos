package com.unam.appredsocialigalumnos.ui

import com.unam.appredsocialigalumnos.R
import com.unam.appredsocialigalumnos.databinding.FragmentHomeBinding

class homeFragment : fragmentBase<FragmentHomeBinding>(
    R.layout.fragment_home, FragmentHomeBinding::bind) {
    override fun initElements(){
        showCollapsingToolBar(true)
        initViews()
    }

    private fun initViews() {

    }
}