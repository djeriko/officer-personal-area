package com.victorx64.officerpersonalarea

/**
 *Content for Research Content
 */
object ResearchesContent {
    val ITEMS: MutableList<ResearchItem> = ArrayList()

    /**
     *for items
     */
    class ResearchItem(val id: String, val title: String, val cabinet: String, val imageUrl: Int) {
        override fun toString(): String {
            return title
        }
    }

    init {
        val researchItem = ResearchItem("1", "Анкетирование. антропометрия, Измерение артериального давления", "Этаж 1, каб. 1", R.drawable.research_image_1)
        val researchItem2 = ResearchItem("2", "Внутриглазное давление (от 60 и старше лет)", "Этаж 1, каб. 2", R.drawable.researches_image_2)
        val researchItem3 = ResearchItem("3", "Определение уровня холестерина (до 85 лет)", "Этаж 1, каб. 3", R.drawable.research_image_3)
        ITEMS.add(researchItem)
        ITEMS.add(researchItem2)
        ITEMS.add(researchItem3)
    }
}