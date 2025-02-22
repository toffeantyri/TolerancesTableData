package ru.tolerances.app.read_csv_repository

import kotlinx.coroutines.flow.StateFlow

interface ICsvReader {

    val intRanges: StateFlow<List<ClosedFloatingPointRange<Double>>>

    val tolerancesISOList: StateFlow<List<String>>

    val tolerancesGOSTList: StateFlow<List<String>>

    val tolerancesTable: StateFlow<List<List<UnitData>>>

    suspend fun init()

    data class UnitData(val minToler: Float?, val maxToler: Float?)

}
