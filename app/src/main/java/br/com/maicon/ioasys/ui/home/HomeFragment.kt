package br.com.maicon.ioasys.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone

import br.com.maicon.ioasys.R
import br.com.maicon.ioasys.app.BaseFragment
import br.com.maicon.ioasys.ui.home.adapter.EnterpriseAdapter
import br.com.maicon.ioasys.ui.home.adapter.OnItemClickListener
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.search_bar.*


class HomeFragment : BaseFragment(), OnItemClickListener<String> {
    private lateinit var adapter: EnterpriseAdapter

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
        setupRecyclerView()
    }

    private fun setupView() {
        searchView.setOnSearchClickListener {
            imageViewIoasysHome.visibility = View.GONE
            searchView.maxWidth = Integer.MAX_VALUE
            textViewInformation.visibility = View.GONE
            recyclerViewList.visibility = View.VISIBLE
        }

        searchView.setOnCloseListener {
            imageViewIoasysHome.visibility = View.VISIBLE
            textViewInformation.visibility = View.VISIBLE
            recyclerViewList.visibility = View.GONE
            false
        }
    }

    private fun setupRecyclerView() {
        adapter = EnterpriseAdapter(
            mutableListOf(
                "Google", "Facebook", "Insta", "Limão", "Jiló", "Figo", "Banana", "Maça", "Pineapple"
            ), this
        )
        recyclerViewList.adapter = adapter

    }

    override fun onItemClick(item: String, position: Int) {

    }
}
