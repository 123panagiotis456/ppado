package com.example.supermarketmanager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/supermarketmanager/MyApplication;", "Landroid/app/Application;", "()V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application {
    public static com.example.supermarketmanager.AppDatabase database;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope appScope = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.supermarketmanager.MyApplication.Companion Companion = null;
    
    public MyApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/supermarketmanager/MyApplication$Companion;", "", "()V", "database", "Lcom/example/supermarketmanager/AppDatabase;", "getDatabase", "()Lcom/example/supermarketmanager/AppDatabase;", "setDatabase", "(Lcom/example/supermarketmanager/AppDatabase;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.supermarketmanager.AppDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.NotNull
        com.example.supermarketmanager.AppDatabase p0) {
        }
    }
}