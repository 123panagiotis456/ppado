// Generated by data binding compiler. Do not edit!
package com.example.supermarketmanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.supermarketmanager.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemShoppingListItemBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRemove;

  @NonNull
  public final TextView tvQuantity;

  protected ItemShoppingListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRemove, TextView tvQuantity) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRemove = btnRemove;
    this.tvQuantity = tvQuantity;
  }

  @NonNull
  public static ItemShoppingListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_shopping_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemShoppingListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemShoppingListItemBinding>inflateInternal(inflater, R.layout.item_shopping_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static ItemShoppingListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_shopping_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemShoppingListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemShoppingListItemBinding>inflateInternal(inflater, R.layout.item_shopping_list_item, null, false, component);
  }

  public static ItemShoppingListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemShoppingListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemShoppingListItemBinding)bind(component, view, R.layout.item_shopping_list_item);
  }
}
