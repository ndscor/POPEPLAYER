package com.dewords.pope.providers.medialibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"checkIsNetwork", "", "videoGroup", "Lorg/videolan/medialibrary/interfaces/media/VideoGroup;", "sanitizeGroups", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "([Lorg/videolan/medialibrary/interfaces/media/VideoGroup;)[Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
public final class VideoGroupsProviderKt {
    
    /**
     * Extracts groups containing only one video and replace them by the video.
     *
     * Also checks if the group has network media and sets the [VideoGroup.isNetwork] field accordingly
     *
     * @return a list of [MediaLibraryItem] containing the groups and the lonely medias
     */
    private static final org.videolan.medialibrary.media.MediaLibraryItem[] sanitizeGroups(org.videolan.medialibrary.interfaces.media.VideoGroup[] $this$sanitizeGroups) {
        return null;
    }
    
    /**
     * Update the [VideoGroup.isNetwork] flag if needed (at least one media is a network one)
     */
    private static final void checkIsNetwork(org.videolan.medialibrary.interfaces.media.VideoGroup videoGroup) {
    }
}