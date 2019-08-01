package com.example.healthyworker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victorx64.officerpersonalarea.DoctorsContent
import com.victorx64.officerpersonalarea.MyDoctorRecyclerViewAdapter
import com.victorx64.officerpersonalarea.R
/**
 * Code for Doctor Fragment
 */
class DoctorsFragment : Fragment() {

    companion object {
        private val ARG_COLUMN_COUNT = "column-count"
        /**
         *for nav-bar
         */
        fun newInstance(columnCount: Int): DoctorsFragment {
            val args = Bundle()
            val fragment = DoctorsFragment()
            args.putInt(ARG_COLUMN_COUNT, columnCount)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
                    mColumnCount = (((arguments?.get(ARG_COLUMN_COUNT))as? Int )?: 0)
        }
    }

    private var mColumnCount : Int = 1
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.doctors_fragment_layout, container, false)
        //set adapter
        val context = view.context
        val recyclerView = view.findViewById<RecyclerView>(R.id.doctors_list)
        if (mColumnCount <= 1) {
            recyclerView.layoutManager = LinearLayoutManager(context)
        } else {
            recyclerView.layoutManager = GridLayoutManager(context, mColumnCount)
        }
        recyclerView.adapter = MyDoctorRecyclerViewAdapter(DoctorsContent.ITEMS, mListener = null)
        return view
    }
    /**
     *for recycleView
     */
    interface OnListFragmentInteractionListener {

        fun onListFragmentsInteraction(item: Int?)
    }
}
