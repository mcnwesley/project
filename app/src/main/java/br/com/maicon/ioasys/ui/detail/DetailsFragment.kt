package br.com.maicon.ioasys.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import br.com.maicon.ioasys.R
import br.com.maicon.ioasys.app.BaseFragment
import kotlinx.android.synthetic.main.toolbar_details.*


class DetailsFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        imageViewArrowBack.setOnClickListener{
            findNavController().popBackStack()
        }
    }

}
