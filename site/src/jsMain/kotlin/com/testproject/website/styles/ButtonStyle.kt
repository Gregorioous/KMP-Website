package com.testproject.website.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ButtonStyle = CssStyle {
    base {
        Modifier
            .padding(leftRight = 12.px)
            .transition(Transition.of(TransitionProperty.All, 300.ms))
    }
    hover {
        Modifier.padding(leftRight = 20.px)
    }
}
