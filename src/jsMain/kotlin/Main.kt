package com.boiler.plate.js

import kotlinx.browser.document
import csstype.Position
import csstype.px
import kotlinx.serialization.Serializable
import react.*
import react.createElement
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.server.rawRenderToString

fun main() {
    val App = FC<Props> {
        h1 {
            +"Hello, React+Kotlin/JS!"
        }
    }
    val appRoot = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(appRoot).render(App.create())

}