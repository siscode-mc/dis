package org.siscode.dis.user

import java.util.*

sealed interface DUser

sealed class DDiscordUser(val id: ULong, val name: String) : DUser
sealed class DMinecraftUser(val uuid : UUID, val name: String) : DUser
sealed class DLinkedUser(val uuid: UUID, val discordId: ULong, val minecraftName : String, val discordName : String) : DUser {
    // Join-Kind constructor
    constructor(discordUser: DDiscordUser, minecraftUser: DMinecraftUser) : this(
        minecraftUser.uuid,
        discordUser.id,
        minecraftUser.name,
        discordUser.name
    )
}
