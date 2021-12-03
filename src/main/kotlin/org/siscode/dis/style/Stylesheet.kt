package org.siscode.dis.style

import net.minecraft.text.Style
import net.minecraft.util.Formatting

class Stylesheet {
    companion object {
        val EMPTY : Style = Style.EMPTY
        val BLURPLE : Style = EMPTY.withColor(0x7289DA)
        val FALSE : Style = EMPTY.withColor(Formatting.RED)
        val INFO : Style = EMPTY.withColor(Formatting.GRAY)
        val TIP : Style = EMPTY.withColor(Formatting.GOLD).withFormatting(Formatting.ITALIC)
        val TRUE : Style = EMPTY.withColor(Formatting.GREEN)
    }
}