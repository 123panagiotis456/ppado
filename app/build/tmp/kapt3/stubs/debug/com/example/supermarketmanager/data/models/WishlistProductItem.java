package com.example.supermarketmanager.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/supermarketmanager/data/models/WishlistProductItem;", "", "wishlist", "Lcom/example/supermarketmanager/data/entities/WishlistItemEntity;", "product", "Lcom/example/supermarketmanager/data/entities/ProductEntity;", "(Lcom/example/supermarketmanager/data/entities/WishlistItemEntity;Lcom/example/supermarketmanager/data/entities/ProductEntity;)V", "getProduct", "()Lcom/example/supermarketmanager/data/entities/ProductEntity;", "getWishlist", "()Lcom/example/supermarketmanager/data/entities/WishlistItemEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class WishlistProductItem {
    @androidx.room.Embedded(prefix = "wishlist_")
    @org.jetbrains.annotations.NotNull
    private final com.example.supermarketmanager.data.entities.WishlistItemEntity wishlist = null;
    @androidx.room.Embedded(prefix = "product_")
    @org.jetbrains.annotations.NotNull
    private final com.example.supermarketmanager.data.entities.ProductEntity product = null;
    
    public WishlistProductItem(@org.jetbrains.annotations.NotNull
    com.example.supermarketmanager.data.entities.WishlistItemEntity wishlist, @org.jetbrains.annotations.NotNull
    com.example.supermarketmanager.data.entities.ProductEntity product) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.supermarketmanager.data.entities.WishlistItemEntity getWishlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.supermarketmanager.data.entities.ProductEntity getProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.supermarketmanager.data.entities.WishlistItemEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.supermarketmanager.data.entities.ProductEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.supermarketmanager.data.models.WishlistProductItem copy(@org.jetbrains.annotations.NotNull
    com.example.supermarketmanager.data.entities.WishlistItemEntity wishlist, @org.jetbrains.annotations.NotNull
    com.example.supermarketmanager.data.entities.ProductEntity product) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}