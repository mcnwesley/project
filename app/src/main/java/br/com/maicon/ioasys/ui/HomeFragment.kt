package br.com.maicon.ioasys.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone

import br.com.maicon.ioasys.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.search_bar.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        searchView.setOnSearchClickListener {
            imageViewIoasysHome.visibility = View.GONE
            searchView.maxWidth = Integer.MAX_VALUE
            textViewInformation.visibility = View.GONE
        }

        searchView.setOnCloseListener {
            imageViewIoasysHome.visibility = View.VISIBLE
            textViewInformation.visibility = View.VISIBLE
            false
        }

    }
}
