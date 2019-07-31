package com.victorx64.officerpersonalarea

import android.content.ContentValues.TAG
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthyworker.DoctorsFragment

class MyDoctorRecyclerViewAdapter(private val mValues: List<DoctorsContent.DoctorItem>, private val mListener: DoctorsFragment.OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyDoctorRecyclerViewAdapter.ViewHolder>() {
    /**
     *Doctor RecyclerView Code
     */
    override fun getItemCount(): Int {
        return mValues.size
    }

    override fun onBindViewHolder(holder: MyDoctorRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mName.text = mValues[position].text
        holder.mImage.setImageResource(mValues[position].imageUrl)

        holder.mView.setOnClickListener {
            mListener?.onListFragmentsInteraction((holder.mItem) as? Int  )?: 0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDoctorRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_doctor_item, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView),View.OnClickListener {
        /**
         *items for recyclerview
         */
        val mName: TextView
        val mImage: ImageView
        val mCardView: CardView
        var mItem: DoctorsContent.DoctorItem? = null
        val  mAbout : TextView
        val mExpandButton : ImageButton
        val mCollapseButton : ImageButton

        init {
            mImage = mView.findViewById(R.id.doc_image)
            mName = mView.findViewById(R.id.doc_name)
            mCardView = mView.findViewById(R.id.PersonalAreaExpannableCardView)
            mAbout = mView.findViewById(R.id.doc_item_about)
            mExpandButton = mView.findViewById(R.id.doc_expand_button)
            mExpandButton.setOnClickListener(this)
            mCollapseButton = mView.findViewById(R.id.doc_collapse_button)
            mCollapseButton.setOnClickListener(this)
        }

        fun Visible_mAbout() {
            /**
             *visibility for about_title
             */
            mAbout.visibility = View.VISIBLE
        }

        override fun onClick(v: View) {
            val p = 150
            when (v.id) {
                R.id.doc_expand_button -> {
                    expand(mCardView)
                    val handler = Handler()
                    handler.postDelayed({ Visible_mAbout() }, 400)

                    mExpandButton.visibility = View.INVISIBLE
                    mCollapseButton.visibility = VISIBLE
                }
                R.id.doc_collapse_button -> {
                    mAbout.visibility = View.INVISIBLE
                    mExpandButton.visibility = VISIBLE
                    mCollapseButton.visibility = View.INVISIBLE
                    collapse(mCardView)
                }
            }
        }

        companion object {

            fun expand(v: View) {
                /**
                 *expand function
                 */
                v.measure(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                val targetHeight = v.measuredHeight
                val star = targetHeight
                v.visibility = VISIBLE
                val a = object : Animation() {
                    override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
                        val layoutParams = v.layoutParams as LinearLayout.LayoutParams
                        layoutParams.height = (targetHeight + (600 - targetHeight) * interpolatedTime).toInt()
                        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
                        v.layoutParams = layoutParams
                        Log.d(TAG, "$interpolatedTime interplotatedTime")
                    }

                    override fun willChangeBounds(): Boolean {
                        return true
                    }
                }
                a.duration = 400
                v.startAnimation(a)
            }

            fun collapse(v: View) {
                /**
                 *collapse function
                 */
                val initialHeight = v.measuredHeight

                val a = object : Animation() {

                    override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
                        val layoutParams = v.layoutParams
                        layoutParams.height = (initialHeight + (329 - initialHeight) * interpolatedTime).toInt()
                        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
                        v.layoutParams = layoutParams

                    }

                    override fun willChangeBounds(): Boolean {
                        return true
                    }
                }
                a.duration = (initialHeight / v.context.resources.displayMetrics.density).toInt().toLong()
                v.startAnimation(a)
            }
        }


    }
}