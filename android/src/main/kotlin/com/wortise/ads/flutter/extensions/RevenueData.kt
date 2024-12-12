package com.wortise.ads.flutter.interstitial

import com.wortise.ads.RevenueData

fun RevenueData.toMap(): Map<String, Any> {
    val revenue = mapOf(
        "currency"  to data.revenue.currency,
        "precision" to data.revenue.precision.name
        "value"     to data.revenue.value
    )

    return mapOf(
        "revenue" to revenue,
        "source"  to data.source
    )
}
