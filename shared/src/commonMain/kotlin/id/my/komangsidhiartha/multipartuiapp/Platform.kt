package id.my.komangsidhiartha.multipartuiapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform