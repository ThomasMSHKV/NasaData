package com.eugens.example.nasadata.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.eugens.example.nasadata.R
import com.eugens.example.nasadata.data.NasaRepository
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class FirstFragment : Fragment(), CoroutineScope {

    override val coroutineContext = Dispatchers.Main


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val repository = NasaRepository()

        launch {
            val nasa = repository.getData().await()
            Log.d("AAAAAAAA", "${nasa?.title}")

            loader.visibility = View.GONE
            nasa_screen.visibility = View.VISIBLE
            title_ns.visibility = View.VISIBLE

            title_ns.text = nasa?.title
            explanation.text = nasa?.explanation

            Glide.with(requireContext()).load(nasa?.url).centerCrop().into(image_ns)


        }


    }

}

