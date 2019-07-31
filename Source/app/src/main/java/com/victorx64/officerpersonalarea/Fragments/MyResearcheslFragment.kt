package com.example.healthyworker

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victorx64.officerpersonalarea.*

class MyResearcheslFragment : Fragment(){
    /**
     *Researches fragment code
     */
    companion object {
        private val ARG_COLUMN_COUNT= "column-count"
        fun newInstance(columnCount: Int): DoctorsFragment{
            /**
             *for nav-bar
             */
            val args = Bundle()
            val fragment = DoctorsFragment()
            args.putInt(ARG_COLUMN_COUNT, columnCount)
            fragment.arguments =args
            return  fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null ) {

             mColumnCount = ((arguments?.get(ARG_COLUMN_COUNT))as Int?) ?: 0
                     //did it worked?
        }
    }

    private var mColumnCount = 1
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.researches_fragment_layout,container,false)
        //set adapter
        val context = view.context
        val recyclerView = view.findViewById<RecyclerView>(R.id.researches_list)
        if (mColumnCount <= 1) {
            recyclerView.layoutManager = LinearLayoutManager(context)
        } else {
            recyclerView.layoutManager = GridLayoutManager(context, mColumnCount)
        }
        recyclerView.adapter = MyResearchesRecyclerViewAdapter(ResearchesContent.ITEMS,mListener = null)
        return view
    }
    interface OnListFragmentInteractionListener {
        /**
         *for recycle-view
         */
        fun onListFragmentsInteraction(item: ResearchesContent.ResearchItem)
    }
}