package com.erdemtsynduev.deviceuniquecode

import android.os.Build
import java.util.*

object DataUtils {

    /**
     * Return pseudo unique ID
     *
     * @return ID
     */
    val uniquePseudoID: String
        get() {
            val szDevIDShort = "27" + Build.BOARD.length % 10 + Build.BRAND.length % 10 +
                    Build.CPU_ABI.length % 10 + Build.DEVICE.length % 10 +
                    Build.MANUFACTURER.length % 10 + Build.MODEL.length % 10 +
                    Build.PRODUCT.length % 10
            var serial: String? = null
            try {
                serial = Build::class.java.getField("SERIAL").get(null).toString()
                return UUID(
                    szDevIDShort.hashCode().toLong(),
                    serial.hashCode().toLong()
                ).toString()
            } catch (exception: Exception) {
                serial = "serial"
            }

            return UUID(szDevIDShort.hashCode().toLong(), serial!!.hashCode().toLong()).toString()
        }
}