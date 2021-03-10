package com.example.dotawiki.model

import java.io.Serializable

data class hero(
    var name : String,
    var typeImage : String,
    var desc : String,
    var heroImage : String
) : Serializable
