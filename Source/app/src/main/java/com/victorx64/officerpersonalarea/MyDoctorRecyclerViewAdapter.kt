package com.victorx64.officerpersonalarea

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthyworker.DoctorsFragment
import org.w3c.dom.Text

class MyDoctorRecyclerViewAdapter(private val mValues: List<DoctorsContent.DoctorItem>, private val mListener: DoctorsFragment.OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyDoctorRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return mValues.size
    }

    override fun onBindViewHolder(holder: MyDoctorRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mName.text = mValues[position].text
        holder.mImage.setImageResource(mValues[position].imageUrl)

        holder.mView.setOnClickListener {
            mListener?.onListFragmentsInteraction(holder.mItem!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDoctorRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_doctor_item, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mName: TextView
        val mImage: ImageView
        val mCardView: CardView
        var mItem: DoctorsContent.DoctorItem? = null

        init {
            mImage = mView.findViewById<View>(R.id.doc_image) as ImageView
            mName = mView.findViewById<View>(R.id.doc_name) as TextView
            mCardView = mView.findViewById<View>(R.id.PersonalAreaExpannableCardView) as CardView
        }


    }


}