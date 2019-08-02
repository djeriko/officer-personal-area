package com.victorx64.officerpersonalarea

object DoctorsContent {
    val ITEMS: MutableList<DoctorItem> = ArrayList()

    class DoctorItem(val id: String, val text: String, val imageUrl: Int) {
        override fun toString(): String {
            return text
        }
    }

    init {
        val doctorItem = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        val doctorItem2 = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        val doctorItem3 = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        val doctorItem4 = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        val doctorItem5 = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        val doctorItem6 = DoctorItem("1", "Иванов Иван Иванович", R.drawable.doctor_image)
        ITEMS.add(doctorItem)
        ITEMS.add(doctorItem2)
        ITEMS.add(doctorItem3)
        ITEMS.add(doctorItem4)
        ITEMS.add(doctorItem5)
        ITEMS.add(doctorItem6)
    }
}