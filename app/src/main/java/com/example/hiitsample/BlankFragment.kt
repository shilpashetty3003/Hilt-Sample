package com.example.hiitsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class BlankFragment : Fragment() {

    @Named("Firebase")
    @Inject
    lateinit var userService: UserService
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        userService.send()
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


}