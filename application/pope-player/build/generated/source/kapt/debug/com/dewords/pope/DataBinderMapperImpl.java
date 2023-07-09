package com.dewords.pope;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.databinding.AboutAuthorsActivityBindingImpl;
import com.dewords.pope.databinding.AboutAuthorsItemBindingImpl;
import com.dewords.pope.databinding.ActivityBetaWelcomeBindingImpl;
import com.dewords.pope.databinding.AudioAlbumTrackItemBindingImpl;
import com.dewords.pope.databinding.AudioBrowserCardItemBindingImpl;
import com.dewords.pope.databinding.AudioBrowserItemBindingImpl;
import com.dewords.pope.databinding.AudioBrowserSeparatorBindingImpl;
import com.dewords.pope.databinding.AudioPlayerBindingImpl;
import com.dewords.pope.databinding.AudioPlayerBindingLandImpl;
import com.dewords.pope.databinding.BookmarkItemBindingImpl;
import com.dewords.pope.databinding.BrowserItemBindingImpl;
import com.dewords.pope.databinding.BrowserItemSeparatorBindingImpl;
import com.dewords.pope.databinding.CardBrowserItemBindingImpl;
import com.dewords.pope.databinding.ChapterListItemBindingImpl;
import com.dewords.pope.databinding.ContextItemBindingImpl;
import com.dewords.pope.databinding.ContextualSheetBindingImpl;
import com.dewords.pope.databinding.CoverMediaSwitcherItemBindingImpl;
import com.dewords.pope.databinding.CoverMediaSwitcherItemBindingLandImpl;
import com.dewords.pope.databinding.DialogAboutVersionBindingImpl;
import com.dewords.pope.databinding.DialogAddToGroupBindingImpl;
import com.dewords.pope.databinding.DialogAudioControlsSettingsBindingImpl;
import com.dewords.pope.databinding.DialogDisplaySettingsBindingImpl;
import com.dewords.pope.databinding.DialogDuplicationWarningBindingImpl;
import com.dewords.pope.databinding.DialogExtDeviceBindingImpl;
import com.dewords.pope.databinding.DialogLicenseBindingImpl;
import com.dewords.pope.databinding.DialogNorificationPermissionBindingImpl;
import com.dewords.pope.databinding.DialogPlaylistBindingImpl;
import com.dewords.pope.databinding.DialogRenderersBindingImpl;
import com.dewords.pope.databinding.DialogVideoControlsSettingsBindingImpl;
import com.dewords.pope.databinding.DialogWidgetExplanationBindingImpl;
import com.dewords.pope.databinding.DialogWidgetMigrationBindingImpl;
import com.dewords.pope.databinding.DirectoryBrowserBindingImpl;
import com.dewords.pope.databinding.EqualizerBindingImpl;
import com.dewords.pope.databinding.GrantAccessBindingImpl;
import com.dewords.pope.databinding.HeaderMediaListActivityBindingImpl;
import com.dewords.pope.databinding.HistoryItemBindingImpl;
import com.dewords.pope.databinding.HistoryItemCardBindingImpl;
import com.dewords.pope.databinding.InfoActivityBindingImpl;
import com.dewords.pope.databinding.ItemPermissionBindingImpl;
import com.dewords.pope.databinding.ItemRendererBindingImpl;
import com.dewords.pope.databinding.LibraryItemBindingImpl;
import com.dewords.pope.databinding.LicenseActivityBindingImpl;
import com.dewords.pope.databinding.MlWizardActivityBindingImpl;
import com.dewords.pope.databinding.MrlCardItemBindingImpl;
import com.dewords.pope.databinding.MrlDummyItemBindingImpl;
import com.dewords.pope.databinding.MrlItemBindingImpl;
import com.dewords.pope.databinding.MrlPanelBindingImpl;
import com.dewords.pope.databinding.PlayerHudBindingImpl;
import com.dewords.pope.databinding.PlayerHudRightBindingImpl;
import com.dewords.pope.databinding.PlayerOptionItemBindingImpl;
import com.dewords.pope.databinding.PlayerOverlayTrackItemBindingImpl;
import com.dewords.pope.databinding.PlayerOverlayTracksBindingImpl;
import com.dewords.pope.databinding.PlayerOverlayTracksBindingLandImpl;
import com.dewords.pope.databinding.PlaylistItemBindingImpl;
import com.dewords.pope.databinding.PlaylistsFragmentBindingImpl;
import com.dewords.pope.databinding.PreferenceItemBindingImpl;
import com.dewords.pope.databinding.PreferencesSearchActivityBindingImpl;
import com.dewords.pope.databinding.SearchActivityBindingImpl;
import com.dewords.pope.databinding.SearchItemBindingImpl;
import com.dewords.pope.databinding.SimpleItemBindingImpl;
import com.dewords.pope.databinding.SubtitleDownloadItemBindingImpl;
import com.dewords.pope.databinding.SubtitleDownloaderDialogBindingImpl;
import com.dewords.pope.databinding.VideoGridBindingImpl;
import com.dewords.pope.databinding.VideoGridCardBindingImpl;
import com.dewords.pope.databinding.VideoListCardBindingImpl;
import com.dewords.pope.databinding.VideoScaleItemBindingImpl;
import com.dewords.pope.databinding.VideoTrackItemBindingImpl;
import com.dewords.pope.databinding.VlcLoginDialogBindingImpl;
import com.dewords.pope.databinding.VlcProgressDialogBindingImpl;
import com.dewords.pope.databinding.VlcQuestionDialogBindingImpl;
import com.dewords.pope.databinding.WidgetContentFullPlayerBindingImpl;
import com.dewords.pope.databinding.WidgetMiniBindingImpl;
import com.dewords.pope.databinding.WidgetMiniInitialBindingImpl;
import com.dewords.pope.databinding.WidgetMiniPlayerConfigureBindingImpl;
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
  private static final int LAYOUT_ABOUTAUTHORSACTIVITY = 1;

  private static final int LAYOUT_ABOUTAUTHORSITEM = 2;

  private static final int LAYOUT_ACTIVITYBETAWELCOME = 3;

  private static final int LAYOUT_AUDIOALBUMTRACKITEM = 4;

  private static final int LAYOUT_AUDIOBROWSERCARDITEM = 5;

  private static final int LAYOUT_AUDIOBROWSERITEM = 6;

  private static final int LAYOUT_AUDIOBROWSERSEPARATOR = 7;

  private static final int LAYOUT_AUDIOPLAYER = 8;

  private static final int LAYOUT_BOOKMARKITEM = 9;

  private static final int LAYOUT_BROWSERITEM = 10;

  private static final int LAYOUT_BROWSERITEMSEPARATOR = 11;

  private static final int LAYOUT_CARDBROWSERITEM = 12;

  private static final int LAYOUT_CHAPTERLISTITEM = 13;

  private static final int LAYOUT_CONTEXTITEM = 14;

  private static final int LAYOUT_CONTEXTUALSHEET = 15;

  private static final int LAYOUT_COVERMEDIASWITCHERITEM = 16;

  private static final int LAYOUT_DIALOGABOUTVERSION = 17;

  private static final int LAYOUT_DIALOGADDTOGROUP = 18;

  private static final int LAYOUT_DIALOGAUDIOCONTROLSSETTINGS = 19;

  private static final int LAYOUT_DIALOGDISPLAYSETTINGS = 20;

  private static final int LAYOUT_DIALOGDUPLICATIONWARNING = 21;

  private static final int LAYOUT_DIALOGEXTDEVICE = 22;

  private static final int LAYOUT_DIALOGLICENSE = 23;

  private static final int LAYOUT_DIALOGNORIFICATIONPERMISSION = 24;

  private static final int LAYOUT_DIALOGPLAYLIST = 25;

  private static final int LAYOUT_DIALOGRENDERERS = 26;

  private static final int LAYOUT_DIALOGVIDEOCONTROLSSETTINGS = 27;

  private static final int LAYOUT_DIALOGWIDGETEXPLANATION = 28;

  private static final int LAYOUT_DIALOGWIDGETMIGRATION = 29;

  private static final int LAYOUT_DIRECTORYBROWSER = 30;

  private static final int LAYOUT_EQUALIZER = 31;

  private static final int LAYOUT_GRANTACCESS = 32;

  private static final int LAYOUT_HEADERMEDIALISTACTIVITY = 33;

  private static final int LAYOUT_HISTORYITEM = 34;

  private static final int LAYOUT_HISTORYITEMCARD = 35;

  private static final int LAYOUT_INFOACTIVITY = 36;

  private static final int LAYOUT_ITEMPERMISSION = 37;

  private static final int LAYOUT_ITEMRENDERER = 38;

  private static final int LAYOUT_LIBRARYITEM = 39;

  private static final int LAYOUT_LICENSEACTIVITY = 40;

  private static final int LAYOUT_MLWIZARDACTIVITY = 41;

  private static final int LAYOUT_MRLCARDITEM = 42;

  private static final int LAYOUT_MRLDUMMYITEM = 43;

  private static final int LAYOUT_MRLITEM = 44;

  private static final int LAYOUT_MRLPANEL = 45;

  private static final int LAYOUT_PLAYERHUD = 46;

  private static final int LAYOUT_PLAYERHUDRIGHT = 47;

  private static final int LAYOUT_PLAYEROPTIONITEM = 48;

  private static final int LAYOUT_PLAYEROVERLAYTRACKITEM = 49;

  private static final int LAYOUT_PLAYEROVERLAYTRACKS = 50;

  private static final int LAYOUT_PLAYLISTITEM = 51;

  private static final int LAYOUT_PLAYLISTSFRAGMENT = 52;

  private static final int LAYOUT_PREFERENCEITEM = 53;

  private static final int LAYOUT_PREFERENCESSEARCHACTIVITY = 54;

  private static final int LAYOUT_SEARCHACTIVITY = 55;

  private static final int LAYOUT_SEARCHITEM = 56;

  private static final int LAYOUT_SIMPLEITEM = 57;

  private static final int LAYOUT_SUBTITLEDOWNLOADITEM = 58;

  private static final int LAYOUT_SUBTITLEDOWNLOADERDIALOG = 59;

  private static final int LAYOUT_VIDEOGRID = 60;

  private static final int LAYOUT_VIDEOGRIDCARD = 61;

  private static final int LAYOUT_VIDEOLISTCARD = 62;

  private static final int LAYOUT_VIDEOSCALEITEM = 63;

  private static final int LAYOUT_VIDEOTRACKITEM = 64;

  private static final int LAYOUT_VLCLOGINDIALOG = 65;

  private static final int LAYOUT_VLCPROGRESSDIALOG = 66;

  private static final int LAYOUT_VLCQUESTIONDIALOG = 67;

  private static final int LAYOUT_WIDGETCONTENTFULLPLAYER = 68;

  private static final int LAYOUT_WIDGETMINI = 69;

  private static final int LAYOUT_WIDGETMINIINITIAL = 70;

  private static final int LAYOUT_WIDGETMINIPLAYERCONFIGURE = 71;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(71);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.about_authors_activity, LAYOUT_ABOUTAUTHORSACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.about_authors_item, LAYOUT_ABOUTAUTHORSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.activity_beta_welcome, LAYOUT_ACTIVITYBETAWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.audio_album_track_item, LAYOUT_AUDIOALBUMTRACKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.audio_browser_card_item, LAYOUT_AUDIOBROWSERCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.audio_browser_item, LAYOUT_AUDIOBROWSERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.audio_browser_separator, LAYOUT_AUDIOBROWSERSEPARATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.audio_player, LAYOUT_AUDIOPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.bookmark_item, LAYOUT_BOOKMARKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.browser_item, LAYOUT_BROWSERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.browser_item_separator, LAYOUT_BROWSERITEMSEPARATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.card_browser_item, LAYOUT_CARDBROWSERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.chapter_list_item, LAYOUT_CHAPTERLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.context_item, LAYOUT_CONTEXTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.contextual_sheet, LAYOUT_CONTEXTUALSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.cover_media_switcher_item, LAYOUT_COVERMEDIASWITCHERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_about_version, LAYOUT_DIALOGABOUTVERSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_add_to_group, LAYOUT_DIALOGADDTOGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_audio_controls_settings, LAYOUT_DIALOGAUDIOCONTROLSSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_display_settings, LAYOUT_DIALOGDISPLAYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_duplication_warning, LAYOUT_DIALOGDUPLICATIONWARNING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_ext_device, LAYOUT_DIALOGEXTDEVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_license, LAYOUT_DIALOGLICENSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_norification_permission, LAYOUT_DIALOGNORIFICATIONPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_playlist, LAYOUT_DIALOGPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_renderers, LAYOUT_DIALOGRENDERERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_video_controls_settings, LAYOUT_DIALOGVIDEOCONTROLSSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_widget_explanation, LAYOUT_DIALOGWIDGETEXPLANATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.dialog_widget_migration, LAYOUT_DIALOGWIDGETMIGRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.directory_browser, LAYOUT_DIRECTORYBROWSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.equalizer, LAYOUT_EQUALIZER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.grant_access, LAYOUT_GRANTACCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.header_media_list_activity, LAYOUT_HEADERMEDIALISTACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.history_item, LAYOUT_HISTORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.history_item_card, LAYOUT_HISTORYITEMCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.info_activity, LAYOUT_INFOACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.item_permission, LAYOUT_ITEMPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.item_renderer, LAYOUT_ITEMRENDERER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.library_item, LAYOUT_LIBRARYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.license_activity, LAYOUT_LICENSEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.ml_wizard_activity, LAYOUT_MLWIZARDACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.mrl_card_item, LAYOUT_MRLCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.mrl_dummy_item, LAYOUT_MRLDUMMYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.mrl_item, LAYOUT_MRLITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.mrl_panel, LAYOUT_MRLPANEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.player_hud, LAYOUT_PLAYERHUD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.player_hud_right, LAYOUT_PLAYERHUDRIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.player_option_item, LAYOUT_PLAYEROPTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.player_overlay_track_item, LAYOUT_PLAYEROVERLAYTRACKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.player_overlay_tracks, LAYOUT_PLAYEROVERLAYTRACKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.playlist_item, LAYOUT_PLAYLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.playlists_fragment, LAYOUT_PLAYLISTSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.preference_item, LAYOUT_PREFERENCEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.preferences_search_activity, LAYOUT_PREFERENCESSEARCHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.search_activity, LAYOUT_SEARCHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.search_item, LAYOUT_SEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.simple_item, LAYOUT_SIMPLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.subtitle_download_item, LAYOUT_SUBTITLEDOWNLOADITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.subtitle_downloader_dialog, LAYOUT_SUBTITLEDOWNLOADERDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.video_grid, LAYOUT_VIDEOGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.video_grid_card, LAYOUT_VIDEOGRIDCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.video_list_card, LAYOUT_VIDEOLISTCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.video_scale_item, LAYOUT_VIDEOSCALEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.video_track_item, LAYOUT_VIDEOTRACKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.vlc_login_dialog, LAYOUT_VLCLOGINDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.vlc_progress_dialog, LAYOUT_VLCPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.vlc_question_dialog, LAYOUT_VLCQUESTIONDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.widget_content_full_player, LAYOUT_WIDGETCONTENTFULLPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.widget_mini, LAYOUT_WIDGETMINI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.widget_mini_initial, LAYOUT_WIDGETMINIINITIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dewords.pope.R.layout.widget_mini_player_configure, LAYOUT_WIDGETMINIPLAYERCONFIGURE);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ABOUTAUTHORSACTIVITY: {
        if ("layout/about_authors_activity_0".equals(tag)) {
          return new AboutAuthorsActivityBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for about_authors_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_ABOUTAUTHORSITEM: {
        if ("layout/about_authors_item_0".equals(tag)) {
          return new AboutAuthorsItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for about_authors_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBETAWELCOME: {
        if ("layout/activity_beta_welcome_0".equals(tag)) {
          return new ActivityBetaWelcomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_beta_welcome is invalid. Received: " + tag);
      }
      case  LAYOUT_AUDIOALBUMTRACKITEM: {
        if ("layout/audio_album_track_item_0".equals(tag)) {
          return new AudioAlbumTrackItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for audio_album_track_item is invalid. Received: " + tag);
      }
      case  LAYOUT_AUDIOBROWSERCARDITEM: {
        if ("layout/audio_browser_card_item_0".equals(tag)) {
          return new AudioBrowserCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for audio_browser_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_AUDIOBROWSERITEM: {
        if ("layout/audio_browser_item_0".equals(tag)) {
          return new AudioBrowserItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for audio_browser_item is invalid. Received: " + tag);
      }
      case  LAYOUT_AUDIOBROWSERSEPARATOR: {
        if ("layout/audio_browser_separator_0".equals(tag)) {
          return new AudioBrowserSeparatorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for audio_browser_separator is invalid. Received: " + tag);
      }
      case  LAYOUT_AUDIOPLAYER: {
        if ("layout/audio_player_0".equals(tag)) {
          return new AudioPlayerBindingImpl(component, view);
        }
        if ("layout-land/audio_player_0".equals(tag)) {
          return new AudioPlayerBindingLandImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for audio_player is invalid. Received: " + tag);
      }
      case  LAYOUT_BOOKMARKITEM: {
        if ("layout/bookmark_item_0".equals(tag)) {
          return new BookmarkItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bookmark_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSERITEM: {
        if ("layout/browser_item_0".equals(tag)) {
          return new BrowserItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browser_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSERITEMSEPARATOR: {
        if ("layout/browser_item_separator_0".equals(tag)) {
          return new BrowserItemSeparatorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browser_item_separator is invalid. Received: " + tag);
      }
      case  LAYOUT_CARDBROWSERITEM: {
        if ("layout/card_browser_item_0".equals(tag)) {
          return new CardBrowserItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for card_browser_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CHAPTERLISTITEM: {
        if ("layout/chapter_list_item_0".equals(tag)) {
          return new ChapterListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chapter_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTEXTITEM: {
        if ("layout/context_item_0".equals(tag)) {
          return new ContextItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for context_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTEXTUALSHEET: {
        if ("layout/contextual_sheet_0".equals(tag)) {
          return new ContextualSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contextual_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_COVERMEDIASWITCHERITEM: {
        if ("layout/cover_media_switcher_item_0".equals(tag)) {
          return new CoverMediaSwitcherItemBindingImpl(component, view);
        }
        if ("layout-land/cover_media_switcher_item_0".equals(tag)) {
          return new CoverMediaSwitcherItemBindingLandImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cover_media_switcher_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTVERSION: {
        if ("layout/dialog_about_version_0".equals(tag)) {
          return new DialogAboutVersionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_version is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGADDTOGROUP: {
        if ("layout/dialog_add_to_group_0".equals(tag)) {
          return new DialogAddToGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_add_to_group is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGAUDIOCONTROLSSETTINGS: {
        if ("layout/dialog_audio_controls_settings_0".equals(tag)) {
          return new DialogAudioControlsSettingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_audio_controls_settings is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDISPLAYSETTINGS: {
        if ("layout/dialog_display_settings_0".equals(tag)) {
          return new DialogDisplaySettingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_display_settings is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDUPLICATIONWARNING: {
        if ("layout/dialog_duplication_warning_0".equals(tag)) {
          return new DialogDuplicationWarningBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_duplication_warning is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGEXTDEVICE: {
        if ("layout/dialog_ext_device_0".equals(tag)) {
          return new DialogExtDeviceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_ext_device is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGLICENSE: {
        if ("layout/dialog_license_0".equals(tag)) {
          return new DialogLicenseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_license is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGNORIFICATIONPERMISSION: {
        if ("layout/dialog_norification_permission_0".equals(tag)) {
          return new DialogNorificationPermissionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_norification_permission is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGPLAYLIST: {
        if ("layout/dialog_playlist_0".equals(tag)) {
          return new DialogPlaylistBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_playlist is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGRENDERERS: {
        if ("layout/dialog_renderers_0".equals(tag)) {
          return new DialogRenderersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_renderers is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGVIDEOCONTROLSSETTINGS: {
        if ("layout/dialog_video_controls_settings_0".equals(tag)) {
          return new DialogVideoControlsSettingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_video_controls_settings is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGWIDGETEXPLANATION: {
        if ("layout/dialog_widget_explanation_0".equals(tag)) {
          return new DialogWidgetExplanationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_widget_explanation is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGWIDGETMIGRATION: {
        if ("layout/dialog_widget_migration_0".equals(tag)) {
          return new DialogWidgetMigrationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_widget_migration is invalid. Received: " + tag);
      }
      case  LAYOUT_DIRECTORYBROWSER: {
        if ("layout/directory_browser_0".equals(tag)) {
          return new DirectoryBrowserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for directory_browser is invalid. Received: " + tag);
      }
      case  LAYOUT_EQUALIZER: {
        if ("layout/equalizer_0".equals(tag)) {
          return new EqualizerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for equalizer is invalid. Received: " + tag);
      }
      case  LAYOUT_GRANTACCESS: {
        if ("layout/grant_access_0".equals(tag)) {
          return new GrantAccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for grant_access is invalid. Received: " + tag);
      }
      case  LAYOUT_HEADERMEDIALISTACTIVITY: {
        if ("layout/header_media_list_activity_0".equals(tag)) {
          return new HeaderMediaListActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for header_media_list_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYITEM: {
        if ("layout/history_item_0".equals(tag)) {
          return new HistoryItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYITEMCARD: {
        if ("layout/history_item_card_0".equals(tag)) {
          return new HistoryItemCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_item_card is invalid. Received: " + tag);
      }
      case  LAYOUT_INFOACTIVITY: {
        if ("layout/info_activity_0".equals(tag)) {
          return new InfoActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for info_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPERMISSION: {
        if ("layout/item_permission_0".equals(tag)) {
          return new ItemPermissionBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for item_permission is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRENDERER: {
        if ("layout/item_renderer_0".equals(tag)) {
          return new ItemRendererBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_renderer is invalid. Received: " + tag);
      }
      case  LAYOUT_LIBRARYITEM: {
        if ("layout/library_item_0".equals(tag)) {
          return new LibraryItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for library_item is invalid. Received: " + tag);
      }
      case  LAYOUT_LICENSEACTIVITY: {
        if ("layout/license_activity_0".equals(tag)) {
          return new LicenseActivityBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for license_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_MLWIZARDACTIVITY: {
        if ("layout/ml_wizard_activity_0".equals(tag)) {
          return new MlWizardActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ml_wizard_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_MRLCARDITEM: {
        if ("layout/mrl_card_item_0".equals(tag)) {
          return new MrlCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for mrl_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MRLDUMMYITEM: {
        if ("layout/mrl_dummy_item_0".equals(tag)) {
          return new MrlDummyItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for mrl_dummy_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MRLITEM: {
        if ("layout/mrl_item_0".equals(tag)) {
          return new MrlItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for mrl_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MRLPANEL: {
        if ("layout-v21/mrl_panel_0".equals(tag)) {
          return new MrlPanelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for mrl_panel is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYERHUD: {
        if ("layout/player_hud_0".equals(tag)) {
          return new PlayerHudBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for player_hud is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYERHUDRIGHT: {
        if ("layout/player_hud_right_0".equals(tag)) {
          return new PlayerHudRightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for player_hud_right is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYEROPTIONITEM: {
        if ("layout/player_option_item_0".equals(tag)) {
          return new PlayerOptionItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for player_option_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYEROVERLAYTRACKITEM: {
        if ("layout/player_overlay_track_item_0".equals(tag)) {
          return new PlayerOverlayTrackItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for player_overlay_track_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYEROVERLAYTRACKS: {
        if ("layout-land/player_overlay_tracks_0".equals(tag)) {
          return new PlayerOverlayTracksBindingLandImpl(component, view);
        }
        if ("layout/player_overlay_tracks_0".equals(tag)) {
          return new PlayerOverlayTracksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for player_overlay_tracks is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_PLAYLISTITEM: {
        if ("layout/playlist_item_0".equals(tag)) {
          return new PlaylistItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for playlist_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PLAYLISTSFRAGMENT: {
        if ("layout/playlists_fragment_0".equals(tag)) {
          return new PlaylistsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for playlists_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PREFERENCEITEM: {
        if ("layout/preference_item_0".equals(tag)) {
          return new PreferenceItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for preference_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PREFERENCESSEARCHACTIVITY: {
        if ("layout/preferences_search_activity_0".equals(tag)) {
          return new PreferencesSearchActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for preferences_search_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHACTIVITY: {
        if ("layout/search_activity_0".equals(tag)) {
          return new SearchActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHITEM: {
        if ("layout/search_item_0".equals(tag)) {
          return new SearchItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SIMPLEITEM: {
        if ("layout/simple_item_0".equals(tag)) {
          return new SimpleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for simple_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBTITLEDOWNLOADITEM: {
        if ("layout/subtitle_download_item_0".equals(tag)) {
          return new SubtitleDownloadItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subtitle_download_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBTITLEDOWNLOADERDIALOG: {
        if ("layout/subtitle_downloader_dialog_0".equals(tag)) {
          return new SubtitleDownloaderDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subtitle_downloader_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_VIDEOGRID: {
        if ("layout/video_grid_0".equals(tag)) {
          return new VideoGridBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for video_grid is invalid. Received: " + tag);
      }
      case  LAYOUT_VIDEOGRIDCARD: {
        if ("layout/video_grid_card_0".equals(tag)) {
          return new VideoGridCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for video_grid_card is invalid. Received: " + tag);
      }
      case  LAYOUT_VIDEOLISTCARD: {
        if ("layout/video_list_card_0".equals(tag)) {
          return new VideoListCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for video_list_card is invalid. Received: " + tag);
      }
      case  LAYOUT_VIDEOSCALEITEM: {
        if ("layout/video_scale_item_0".equals(tag)) {
          return new VideoScaleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for video_scale_item is invalid. Received: " + tag);
      }
      case  LAYOUT_VIDEOTRACKITEM: {
        if ("layout/video_track_item_0".equals(tag)) {
          return new VideoTrackItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for video_track_item is invalid. Received: " + tag);
      }
      case  LAYOUT_VLCLOGINDIALOG: {
        if ("layout/vlc_login_dialog_0".equals(tag)) {
          return new VlcLoginDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for vlc_login_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_VLCPROGRESSDIALOG: {
        if ("layout/vlc_progress_dialog_0".equals(tag)) {
          return new VlcProgressDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for vlc_progress_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_VLCQUESTIONDIALOG: {
        if ("layout/vlc_question_dialog_0".equals(tag)) {
          return new VlcQuestionDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for vlc_question_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETCONTENTFULLPLAYER: {
        if ("layout/widget_content_full_player_0".equals(tag)) {
          return new WidgetContentFullPlayerBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for widget_content_full_player is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETMINI: {
        if ("layout/widget_mini_0".equals(tag)) {
          return new WidgetMiniBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for widget_mini is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETMINIINITIAL: {
        if ("layout/widget_mini_initial_0".equals(tag)) {
          return new WidgetMiniInitialBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for widget_mini_initial is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETMINIPLAYERCONFIGURE: {
        if ("layout/widget_mini_player_configure_0".equals(tag)) {
          return new WidgetMiniPlayerConfigureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for widget_mini_player_configure is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
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
        case LAYOUT_ABOUTAUTHORSACTIVITY: {
          if("layout/about_authors_activity_0".equals(tag)) {
            return new AboutAuthorsActivityBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for about_authors_activity is invalid. Received: " + tag);
        }
        case LAYOUT_ITEMPERMISSION: {
          if("layout/item_permission_0".equals(tag)) {
            return new ItemPermissionBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for item_permission is invalid. Received: " + tag);
        }
        case LAYOUT_LICENSEACTIVITY: {
          if("layout/license_activity_0".equals(tag)) {
            return new LicenseActivityBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for license_activity is invalid. Received: " + tag);
        }
        case LAYOUT_WIDGETCONTENTFULLPLAYER: {
          if("layout/widget_content_full_player_0".equals(tag)) {
            return new WidgetContentFullPlayerBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for widget_content_full_player is invalid. Received: " + tag);
        }
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new org.videolan.medialibrary.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(75);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "ab_repeat_a");
      sKeys.put(2, "ab_repeat_b");
      sKeys.put(3, "author");
      sKeys.put(4, "bgColor");
      sKeys.put(5, "bookmark");
      sKeys.put(6, "can_shuffle");
      sKeys.put(7, "category");
      sKeys.put(8, "chapter");
      sKeys.put(9, "checkEnabled");
      sKeys.put(10, "clicHandler");
      sKeys.put(11, "contentDescription");
      sKeys.put(12, "cover");
      sKeys.put(13, "coverWidth");
      sKeys.put(14, "description");
      sKeys.put(15, "dialog");
      sKeys.put(16, "empty");
      sKeys.put(17, "extraTitleText");
      sKeys.put(18, "extraValueText");
      sKeys.put(19, "favorite");
      sKeys.put(20, "filename");
      sKeys.put(21, "filesText");
      sKeys.put(22, "fragment");
      sKeys.put(23, "handler");
      sKeys.put(24, "hasContextMenu");
      sKeys.put(25, "holder");
      sKeys.put(26, "imageWidth");
      sKeys.put(27, "inError");
      sKeys.put(28, "inSelection");
      sKeys.put(29, "isBanned");
      sKeys.put(30, "isBannedParent");
      sKeys.put(31, "isFavorite");
      sKeys.put(32, "isLoading");
      sKeys.put(33, "isNetwork");
      sKeys.put(34, "isOTG");
      sKeys.put(35, "isPresent");
      sKeys.put(36, "isSD");
      sKeys.put(37, "isSquare");
      sKeys.put(38, "isTv");
      sKeys.put(39, "item");
      sKeys.put(40, "length");
      sKeys.put(41, "library");
      sKeys.put(42, "masked");
      sKeys.put(43, "max");
      sKeys.put(44, "media");
      sKeys.put(45, "option");
      sKeys.put(46, "path");
      sKeys.put(47, "player");
      sKeys.put(48, "playlist");
      sKeys.put(49, "progress");
      sKeys.put(50, "protocol");
      sKeys.put(51, "query");
      sKeys.put(52, "releaseYear");
      sKeys.put(53, "renderer");
      sKeys.put(54, "resolution");
      sKeys.put(55, "scaleName");
      sKeys.put(56, "scaleType");
      sKeys.put(57, "scanned");
      sKeys.put(58, "searchAggregate");
      sKeys.put(59, "seen");
      sKeys.put(60, "selected");
      sKeys.put(61, "showFavorites");
      sKeys.put(62, "showTranslation");
      sKeys.put(63, "sizeTitleText");
      sKeys.put(64, "sizeValueContentDescription");
      sKeys.put(65, "sizeValueText");
      sKeys.put(66, "state");
      sKeys.put(67, "subTitle");
      sKeys.put(68, "subtitleItem");
      sKeys.put(69, "time");
      sKeys.put(70, "title");
      sKeys.put(71, "topmargin");
      sKeys.put(72, "totalDuration");
      sKeys.put(73, "track");
      sKeys.put(74, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(74);

    static {
      sKeys.put("layout/about_authors_activity_0", com.dewords.pope.R.layout.about_authors_activity);
      sKeys.put("layout/about_authors_item_0", com.dewords.pope.R.layout.about_authors_item);
      sKeys.put("layout/activity_beta_welcome_0", com.dewords.pope.R.layout.activity_beta_welcome);
      sKeys.put("layout/audio_album_track_item_0", com.dewords.pope.R.layout.audio_album_track_item);
      sKeys.put("layout/audio_browser_card_item_0", com.dewords.pope.R.layout.audio_browser_card_item);
      sKeys.put("layout/audio_browser_item_0", com.dewords.pope.R.layout.audio_browser_item);
      sKeys.put("layout/audio_browser_separator_0", com.dewords.pope.R.layout.audio_browser_separator);
      sKeys.put("layout/audio_player_0", com.dewords.pope.R.layout.audio_player);
      sKeys.put("layout-land/audio_player_0", com.dewords.pope.R.layout.audio_player);
      sKeys.put("layout/bookmark_item_0", com.dewords.pope.R.layout.bookmark_item);
      sKeys.put("layout/browser_item_0", com.dewords.pope.R.layout.browser_item);
      sKeys.put("layout/browser_item_separator_0", com.dewords.pope.R.layout.browser_item_separator);
      sKeys.put("layout/card_browser_item_0", com.dewords.pope.R.layout.card_browser_item);
      sKeys.put("layout/chapter_list_item_0", com.dewords.pope.R.layout.chapter_list_item);
      sKeys.put("layout/context_item_0", com.dewords.pope.R.layout.context_item);
      sKeys.put("layout/contextual_sheet_0", com.dewords.pope.R.layout.contextual_sheet);
      sKeys.put("layout/cover_media_switcher_item_0", com.dewords.pope.R.layout.cover_media_switcher_item);
      sKeys.put("layout-land/cover_media_switcher_item_0", com.dewords.pope.R.layout.cover_media_switcher_item);
      sKeys.put("layout/dialog_about_version_0", com.dewords.pope.R.layout.dialog_about_version);
      sKeys.put("layout/dialog_add_to_group_0", com.dewords.pope.R.layout.dialog_add_to_group);
      sKeys.put("layout/dialog_audio_controls_settings_0", com.dewords.pope.R.layout.dialog_audio_controls_settings);
      sKeys.put("layout/dialog_display_settings_0", com.dewords.pope.R.layout.dialog_display_settings);
      sKeys.put("layout/dialog_duplication_warning_0", com.dewords.pope.R.layout.dialog_duplication_warning);
      sKeys.put("layout/dialog_ext_device_0", com.dewords.pope.R.layout.dialog_ext_device);
      sKeys.put("layout/dialog_license_0", com.dewords.pope.R.layout.dialog_license);
      sKeys.put("layout/dialog_norification_permission_0", com.dewords.pope.R.layout.dialog_norification_permission);
      sKeys.put("layout/dialog_playlist_0", com.dewords.pope.R.layout.dialog_playlist);
      sKeys.put("layout/dialog_renderers_0", com.dewords.pope.R.layout.dialog_renderers);
      sKeys.put("layout/dialog_video_controls_settings_0", com.dewords.pope.R.layout.dialog_video_controls_settings);
      sKeys.put("layout/dialog_widget_explanation_0", com.dewords.pope.R.layout.dialog_widget_explanation);
      sKeys.put("layout/dialog_widget_migration_0", com.dewords.pope.R.layout.dialog_widget_migration);
      sKeys.put("layout/directory_browser_0", com.dewords.pope.R.layout.directory_browser);
      sKeys.put("layout/equalizer_0", com.dewords.pope.R.layout.equalizer);
      sKeys.put("layout/grant_access_0", com.dewords.pope.R.layout.grant_access);
      sKeys.put("layout/header_media_list_activity_0", com.dewords.pope.R.layout.header_media_list_activity);
      sKeys.put("layout/history_item_0", com.dewords.pope.R.layout.history_item);
      sKeys.put("layout/history_item_card_0", com.dewords.pope.R.layout.history_item_card);
      sKeys.put("layout/info_activity_0", com.dewords.pope.R.layout.info_activity);
      sKeys.put("layout/item_permission_0", com.dewords.pope.R.layout.item_permission);
      sKeys.put("layout/item_renderer_0", com.dewords.pope.R.layout.item_renderer);
      sKeys.put("layout/library_item_0", com.dewords.pope.R.layout.library_item);
      sKeys.put("layout/license_activity_0", com.dewords.pope.R.layout.license_activity);
      sKeys.put("layout/ml_wizard_activity_0", com.dewords.pope.R.layout.ml_wizard_activity);
      sKeys.put("layout/mrl_card_item_0", com.dewords.pope.R.layout.mrl_card_item);
      sKeys.put("layout/mrl_dummy_item_0", com.dewords.pope.R.layout.mrl_dummy_item);
      sKeys.put("layout/mrl_item_0", com.dewords.pope.R.layout.mrl_item);
      sKeys.put("layout-v21/mrl_panel_0", com.dewords.pope.R.layout.mrl_panel);
      sKeys.put("layout/player_hud_0", com.dewords.pope.R.layout.player_hud);
      sKeys.put("layout/player_hud_right_0", com.dewords.pope.R.layout.player_hud_right);
      sKeys.put("layout/player_option_item_0", com.dewords.pope.R.layout.player_option_item);
      sKeys.put("layout/player_overlay_track_item_0", com.dewords.pope.R.layout.player_overlay_track_item);
      sKeys.put("layout-land/player_overlay_tracks_0", com.dewords.pope.R.layout.player_overlay_tracks);
      sKeys.put("layout/player_overlay_tracks_0", com.dewords.pope.R.layout.player_overlay_tracks);
      sKeys.put("layout/playlist_item_0", com.dewords.pope.R.layout.playlist_item);
      sKeys.put("layout/playlists_fragment_0", com.dewords.pope.R.layout.playlists_fragment);
      sKeys.put("layout/preference_item_0", com.dewords.pope.R.layout.preference_item);
      sKeys.put("layout/preferences_search_activity_0", com.dewords.pope.R.layout.preferences_search_activity);
      sKeys.put("layout/search_activity_0", com.dewords.pope.R.layout.search_activity);
      sKeys.put("layout/search_item_0", com.dewords.pope.R.layout.search_item);
      sKeys.put("layout/simple_item_0", com.dewords.pope.R.layout.simple_item);
      sKeys.put("layout/subtitle_download_item_0", com.dewords.pope.R.layout.subtitle_download_item);
      sKeys.put("layout/subtitle_downloader_dialog_0", com.dewords.pope.R.layout.subtitle_downloader_dialog);
      sKeys.put("layout/video_grid_0", com.dewords.pope.R.layout.video_grid);
      sKeys.put("layout/video_grid_card_0", com.dewords.pope.R.layout.video_grid_card);
      sKeys.put("layout/video_list_card_0", com.dewords.pope.R.layout.video_list_card);
      sKeys.put("layout/video_scale_item_0", com.dewords.pope.R.layout.video_scale_item);
      sKeys.put("layout/video_track_item_0", com.dewords.pope.R.layout.video_track_item);
      sKeys.put("layout/vlc_login_dialog_0", com.dewords.pope.R.layout.vlc_login_dialog);
      sKeys.put("layout/vlc_progress_dialog_0", com.dewords.pope.R.layout.vlc_progress_dialog);
      sKeys.put("layout/vlc_question_dialog_0", com.dewords.pope.R.layout.vlc_question_dialog);
      sKeys.put("layout/widget_content_full_player_0", com.dewords.pope.R.layout.widget_content_full_player);
      sKeys.put("layout/widget_mini_0", com.dewords.pope.R.layout.widget_mini);
      sKeys.put("layout/widget_mini_initial_0", com.dewords.pope.R.layout.widget_mini_initial);
      sKeys.put("layout/widget_mini_player_configure_0", com.dewords.pope.R.layout.widget_mini_player_configure);
    }
  }
}
