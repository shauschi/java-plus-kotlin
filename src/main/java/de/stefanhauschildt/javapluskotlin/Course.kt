package de.stefanhauschildt.javapluskotlin

import java.time.Instant
import java.util.Collections.emptyList

data class Course(
        val courseId: String,
        val start: Instant,
        val durationInMinutes: Int,
        val trainerId: String,
        val maximumParticipants: Int,
        val cancelled: Boolean,
        val participants: List<String> = emptyList(),
)
