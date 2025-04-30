package com.wortise.ads.flutter.extensions

import com.wortise.ads.RevenueData

fun RevenueData.toMap(): Map<String, Any?> {
    return mapOf(
        "revenue" to revenue.toMap(),
        "source"  to source
    )
}
