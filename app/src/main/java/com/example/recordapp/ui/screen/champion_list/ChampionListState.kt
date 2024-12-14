package com.example.recordapp.ui.screen.champion_list

import com.example.recordapp.domain.model.ChampionModel

data class ChampionListState(
    val searchText: String = "",
    val champions: List<ChampionModel> = emptyList(),
    val filteredChampions: List<ChampionModel> = emptyList()
)
