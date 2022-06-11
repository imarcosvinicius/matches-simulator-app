package io.myapps.simulator.domain

data class Matches(
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
)