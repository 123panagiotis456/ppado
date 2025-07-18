package com.example.supermarketmanager;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.supermarketmanager.databinding.FragmentCategoryListBindingImpl;
import com.example.supermarketmanager.databinding.FragmentProductDetailBindingImpl;
import com.example.supermarketmanager.databinding.FragmentProductListBindingImpl;
import com.example.supermarketmanager.databinding.FragmentPurchaseHistoryBindingImpl;
import com.example.supermarketmanager.databinding.FragmentShoppingCartBindingImpl;
import com.example.supermarketmanager.databinding.ItemCategoryBindingImpl;
import com.example.supermarketmanager.databinding.ItemShoppingListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCATEGORYLIST = 1;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 2;

  private static final int LAYOUT_FRAGMENTPRODUCTLIST = 3;

  private static final int LAYOUT_FRAGMENTPURCHASEHISTORY = 4;

  private static final int LAYOUT_FRAGMENTSHOPPINGCART = 5;

  private static final int LAYOUT_ITEMCATEGORY = 6;

  private static final int LAYOUT_ITEMSHOPPINGLISTITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.fragment_category_list, LAYOUT_FRAGMENTCATEGORYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.fragment_product_list, LAYOUT_FRAGMENTPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.fragment_purchase_history, LAYOUT_FRAGMENTPURCHASEHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.fragment_shopping_cart, LAYOUT_FRAGMENTSHOPPINGCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.supermarketmanager.R.layout.item_shopping_list_item, LAYOUT_ITEMSHOPPINGLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCATEGORYLIST: {
          if ("layout/fragment_category_list_0".equals(tag)) {
            return new FragmentCategoryListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTLIST: {
          if ("layout/fragment_product_list_0".equals(tag)) {
            return new FragmentProductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPURCHASEHISTORY: {
          if ("layout/fragment_purchase_history_0".equals(tag)) {
            return new FragmentPurchaseHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_purchase_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOPPINGCART: {
          if ("layout/fragment_shopping_cart_0".equals(tag)) {
            return new FragmentShoppingCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shopping_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSHOPPINGLISTITEM: {
          if ("layout/item_shopping_list_item_0".equals(tag)) {
            return new ItemShoppingListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_shopping_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_category_list_0", com.example.supermarketmanager.R.layout.fragment_category_list);
      sKeys.put("layout/fragment_product_detail_0", com.example.supermarketmanager.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_product_list_0", com.example.supermarketmanager.R.layout.fragment_product_list);
      sKeys.put("layout/fragment_purchase_history_0", com.example.supermarketmanager.R.layout.fragment_purchase_history);
      sKeys.put("layout/fragment_shopping_cart_0", com.example.supermarketmanager.R.layout.fragment_shopping_cart);
      sKeys.put("layout/item_category_0", com.example.supermarketmanager.R.layout.item_category);
      sKeys.put("layout/item_shopping_list_item_0", com.example.supermarketmanager.R.layout.item_shopping_list_item);
    }
  }
}
