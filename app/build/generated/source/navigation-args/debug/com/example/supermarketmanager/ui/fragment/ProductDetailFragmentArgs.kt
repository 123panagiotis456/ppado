package com.example.supermarketmanager.ui.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ProductDetailFragmentArgs(
  public val productId: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("productId", this.productId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productId", this.productId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductDetailFragmentArgs {
      bundle.setClassLoader(ProductDetailFragmentArgs::class.java.classLoader)
      val __productId : Int
      if (bundle.containsKey("productId")) {
        __productId = bundle.getInt("productId")
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__productId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductDetailFragmentArgs {
      val __productId : Int?
      if (savedStateHandle.contains("productId")) {
        __productId = savedStateHandle["productId"]
        if (__productId == null) {
          throw IllegalArgumentException("Argument \"productId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__productId)
    }
  }
}
