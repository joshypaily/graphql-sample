package com.graphql.sample

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component


@Component
class SampleQuery: Query {
    fun getPerson(): Person = Person(name = "Joshy", mobile = "9989898989")
}

data class Person(val name: String, val mobile: String?)