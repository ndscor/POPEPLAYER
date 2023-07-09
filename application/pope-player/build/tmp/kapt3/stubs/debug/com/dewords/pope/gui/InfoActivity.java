package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0001J\b\u0010\"\u001a\u00020\u0000H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0011\u0010%\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\b\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0014J\u0012\u00101\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020,H\u0014J\u0011\u00104\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\u0011\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001aH\u0096\u0001J\u0013\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u00010!H\u0096\u0001J\b\u00109\u001a\u00020$H\u0016J\b\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/dewords/pope/gui/InfoActivity;", "Lcom/dewords/pope/gui/AudioPlayerContainerActivity;", "Landroid/view/View$OnClickListener;", "Lcom/dewords/pope/gui/browser/PathAdapterListener;", "Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "()V", "adapter", "Lcom/dewords/pope/gui/video/MediaInfoAdapter;", "binding", "Lcom/dewords/pope/databinding/InfoActivityBinding;", "getBinding$pope_player_debug", "()Lcom/dewords/pope/databinding/InfoActivityBinding;", "setBinding$pope_player_debug", "(Lcom/dewords/pope/databinding/InfoActivityBinding;)V", "insetListener", "Lkotlin/Function1;", "Landroidx/core/graphics/Insets;", "", "getInsetListener", "()Lkotlin/jvm/functions/Function1;", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "model", "Lcom/dewords/pope/gui/InfoModel;", "appendPathToUri", "path", "", "uri", "Landroid/net/Uri$Builder;", "backTo", "tag", "currentContext", "getAndRemoveDestination", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getPathOperationDelegate", "isTransparent", "", "makePathSafe", "noCoverFallback", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPlayerStateChanged", "bottomSheet", "newState", "", "onPostCreate", "onSaveInstanceState", "outState", "replaceStoragePath", "retrieveSafePath", "encoded", "setDestination", "media", "showRoot", "updateMeta", "Lkotlinx/coroutines/Job;", "pope-player_debug"})
public final class InfoActivity extends com.dewords.pope.gui.AudioPlayerContainerActivity implements android.view.View.OnClickListener, com.dewords.pope.gui.browser.PathAdapterListener, com.dewords.pope.viewmodels.browser.IPathOperationDelegate {
    private org.videolan.medialibrary.media.MediaLibraryItem item;
    private com.dewords.pope.gui.video.MediaInfoAdapter adapter;
    private com.dewords.pope.gui.InfoModel model;
    public com.dewords.pope.databinding.InfoActivityBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<androidx.core.graphics.Insets, kotlin.Unit> insetListener = null;
    
    public InfoActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.InfoActivityBinding getBinding$pope_player_debug() {
        return null;
    }
    
    public final void setBinding$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.InfoActivityBinding p0) {
    }
    
    @java.lang.Override()
    public boolean isTransparent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<androidx.core.graphics.Insets, kotlin.Unit> getInsetListener() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job updateMeta() {
        return null;
    }
    
    @java.lang.Override()
    public void backTo(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.InfoActivity currentContext() {
        return null;
    }
    
    @java.lang.Override()
    public boolean showRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.InfoActivity getPathOperationDelegate() {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void noCoverFallback() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void onPlayerStateChanged(@org.jetbrains.annotations.NotNull()
    android.view.View bottomSheet, int newState) {
    }
    
    /**
     * Append a path to the Uri from a String
     * It takes care of substituting paths stored in [storages] and splitting if the substituted path contains file separators
     *
     * @param path the path to append
     * @param uri the uri the path should be appended to
     */
    @java.lang.Override()
    public void appendPathToUri(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.net.Uri.Builder uri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.MediaWrapper getAndRemoveDestination() {
        return null;
    }
    
    /**
     * Encodes a String to avoid false positive substitusions
     *
     * @param path the path to encode
     * @return the encoded path
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String makePathSafe(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Substitutes the [storages]keys by the [storages] values
     *
     * @param path the real path string
     * @return the path string with substitutions
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String replaceStoragePath(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Decodes a string previously encoded with [makePathSafe]
     *
     * @param encoded the encoded path string
     * @return the decoded path string
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String retrieveSafePath(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded) {
        return null;
    }
    
    @java.lang.Override()
    public void setDestination(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
}