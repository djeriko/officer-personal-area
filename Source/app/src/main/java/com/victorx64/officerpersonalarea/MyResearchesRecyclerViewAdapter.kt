package com.victorx64.officerpersonalarea

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthyworker.MyResearcheslFragment

class MyResearchesRecyclerViewAdapter(private val mValues: List<ResearchesContent.ResearchItem>, private val mListener: MyResearcheslFragment.OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyResearchesRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyResearchesRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_researches_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    override fun onBindViewHolder(holder: MyResearchesRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mTitle.text = mValues[position].title
        holder.mImage.setImageResource(mValues[position].imageUrl)
        holder.mCabinet.text = mValues[position].cabinet

//        holder.mView.setOnClickListener {
//            mListener?.onListFragmentsInteraction(holder.mItem!!)
//        }
    }

    class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mTitle: TextView
        val mImage: ImageView
        val mCabinet: TextView
        var mItem: ResearchesContent.ResearchItem? = null
        var mCardView: CardView

        init {
            mTitle = mView.findViewById(R.id.researches_title)
            mImage = mView.findViewById(R.id.researches_image)
            mCabinet = mView.findViewById(R.id.floor_and_cabinet)
            mCardView = mView.findViewById(R.id.Researches_cardView)
        }

    }


}