package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SubtitleDownloaderDialogBindingImpl extends SubtitleDownloaderDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 15);
        sViewsWithIds.put(R.id.movieName, 16);
        sViewsWithIds.put(R.id.language_list_spinner, 17);
        sViewsWithIds.put(R.id.sub_download_search, 18);
        sViewsWithIds.put(R.id.sub_download_next, 19);
        sViewsWithIds.put(R.id.sub_download_loading, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener episodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.observableSearchEpisode.get()
            //         is viewmodel.observableSearchEpisode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(episode);
            // localize variables for thread safety
            // viewmodel.observableSearchEpisode
            androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchEpisode = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.observableSearchEpisode.get()
            java.lang.String viewmodelObservableSearchEpisodeGet = null;
            // viewmodel
            com.dewords.pope.viewmodels.SubtitlesModel viewmodel = mViewmodel;
            // viewmodel.observableSearchEpisode != null
            boolean viewmodelObservableSearchEpisodeJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelObservableSearchEpisode = viewmodel.getObservableSearchEpisode();

                viewmodelObservableSearchEpisodeJavaLangObjectNull = (viewmodelObservableSearchEpisode) != (null);
                if (viewmodelObservableSearchEpisodeJavaLangObjectNull) {




                    viewmodelObservableSearchEpisode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.observableSearchName.get()
            //         is viewmodel.observableSearchName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(name);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.observableSearchName
            androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchName = null;
            // viewmodel.observableSearchName.get()
            java.lang.String viewmodelObservableSearchNameGet = null;
            // viewmodel.observableSearchName != null
            boolean viewmodelObservableSearchNameJavaLangObjectNull = false;
            // viewmodel
            com.dewords.pope.viewmodels.SubtitlesModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelObservableSearchName = viewmodel.getObservableSearchName();

                viewmodelObservableSearchNameJavaLangObjectNull = (viewmodelObservableSearchName) != (null);
                if (viewmodelObservableSearchNameJavaLangObjectNull) {




                    viewmodelObservableSearchName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener seasonandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.observableSearchSeason.get()
            //         is viewmodel.observableSearchSeason.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(season);
            // localize variables for thread safety
            // viewmodel.observableSearchSeason.get()
            java.lang.String viewmodelObservableSearchSeasonGet = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.observableSearchSeason
            androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchSeason = null;
            // viewmodel.observableSearchSeason != null
            boolean viewmodelObservableSearchSeasonJavaLangObjectNull = false;
            // viewmodel
            com.dewords.pope.viewmodels.SubtitlesModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelObservableSearchSeason = viewmodel.getObservableSearchSeason();

                viewmodelObservableSearchSeasonJavaLangObjectNull = (viewmodelObservableSearchSeason) != (null);
                if (viewmodelObservableSearchSeasonJavaLangObjectNull) {




                    viewmodelObservableSearchSeason.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public SubtitleDownloaderDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private SubtitleDownloaderDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.dewords.pope.gui.view.LanguageSelector) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.Button) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[20]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            );
        this.cancelButton.setTag(null);
        this.episode.setTag(null);
        this.episodeContainer.setTag(null);
        this.message.setTag(null);
        this.name.setTag(null);
        this.nameContainer.setTag(null);
        this.resultDescription.setTag(null);
        this.retryButton.setTag(null);
        this.scrollView.setTag("nested");
        this.searchButton.setTag(null);
        this.season.setTag(null);
        this.seasonContainer.setTag(null);
        this.subDownloadHistory.setTag(null);
        this.subsDownloadList.setTag(null);
        this.subsHistoryList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.state == variableId) {
            setState((com.dewords.pope.gui.dialogs.SubDownloadDialogState) variable);
        }
        else if (BR.inError == variableId) {
            setInError((java.lang.Boolean) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.dewords.pope.viewmodels.SubtitlesModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable com.dewords.pope.gui.dialogs.SubDownloadDialogState State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }
    public void setInError(@Nullable java.lang.Boolean InError) {
        this.mInError = InError;
    }
    public void setViewmodel(@Nullable com.dewords.pope.viewmodels.SubtitlesModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelObservableSearchEpisode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelObservableSearchSeason((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelObservableMessage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelObservableResultDescription((androidx.databinding.ObservableField<android.text.Spanned>) object, fieldId);
            case 4 :
                return onChangeViewmodelObservableSearchName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelObservableError((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelObservableSearchEpisode(androidx.databinding.ObservableField<java.lang.String> ViewmodelObservableSearchEpisode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelObservableSearchSeason(androidx.databinding.ObservableField<java.lang.String> ViewmodelObservableSearchSeason, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelObservableMessage(androidx.databinding.ObservableField<java.lang.String> ViewmodelObservableMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelObservableResultDescription(androidx.databinding.ObservableField<android.text.Spanned> ViewmodelObservableResultDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelObservableSearchName(androidx.databinding.ObservableField<java.lang.String> ViewmodelObservableSearchName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelObservableError(androidx.databinding.ObservableField<java.lang.Boolean> ViewmodelObservableError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int stateStateSearchViewVISIBLEViewGONE = 0;
        int viewmodelObservableErrorViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewmodelObservableSearchNameGetTrim = false;
        java.lang.String viewmodelObservableMessageGet = null;
        boolean textUtilsIsEmptyViewmodelObservableMessage = false;
        int stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalseViewVISIBLEViewGONE = 0;
        int stateStateHistoryViewVISIBLEViewGONE = 0;
        int stateStateDownloadViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewmodelObservableErrorGet = null;
        boolean stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalse = false;
        com.dewords.pope.gui.dialogs.SubDownloadDialogState state = mState;
        java.lang.String viewmodelObservableSearchNameGet = null;
        boolean stateStateSearch = false;
        boolean TextUtilsIsEmptyViewmodelObservableSearchNameGetTrim1 = false;
        boolean stateStateDownload = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchEpisode = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchSeason = null;
        boolean TextUtilsIsEmptyViewmodelObservableMessage1 = false;
        boolean stateStateHistory = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelObservableErrorGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelObservableMessage = null;
        java.lang.String viewmodelObservableSearchNameGetTrim = null;
        java.lang.String viewmodelObservableSearchSeasonGet = null;
        androidx.databinding.ObservableField<android.text.Spanned> viewmodelObservableResultDescription = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelObservableSearchName = null;
        java.lang.String viewmodelObservableSearchEpisodeGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewmodelObservableError = null;
        android.text.Spanned viewmodelObservableResultDescriptionGet = null;
        com.dewords.pope.viewmodels.SubtitlesModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x344L) != 0) {


            if ((dirtyFlags & 0x240L) != 0) {

                    // read state == SubDownloadDialogState.Search
                    stateStateSearch = (state) == (com.dewords.pope.gui.dialogs.SubDownloadDialogState.Search);
                    // read state == SubDownloadDialogState.History
                    stateStateHistory = (state) == (com.dewords.pope.gui.dialogs.SubDownloadDialogState.History);
                if((dirtyFlags & 0x240L) != 0) {
                    if(stateStateSearch) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x240L) != 0) {
                    if(stateStateHistory) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read state == SubDownloadDialogState.Search ? View.VISIBLE : View.GONE
                    stateStateSearchViewVISIBLEViewGONE = ((stateStateSearch) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read state == SubDownloadDialogState.History ? View.VISIBLE : View.GONE
                    stateStateHistoryViewVISIBLEViewGONE = ((stateStateHistory) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                // read state == SubDownloadDialogState.Download
                stateStateDownload = (state) == (com.dewords.pope.gui.dialogs.SubDownloadDialogState.Download);
            if((dirtyFlags & 0x240L) != 0) {
                if(stateStateDownload) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0x344L) != 0) {
                if(stateStateDownload) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }

            if ((dirtyFlags & 0x240L) != 0) {

                    // read state == SubDownloadDialogState.Download ? View.VISIBLE : View.GONE
                    stateStateDownloadViewVISIBLEViewGONE = ((stateStateDownload) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x33fL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableSearchEpisode
                        viewmodelObservableSearchEpisode = viewmodel.getObservableSearchEpisode();
                    }
                    updateRegistration(0, viewmodelObservableSearchEpisode);


                    if (viewmodelObservableSearchEpisode != null) {
                        // read viewmodel.observableSearchEpisode.get()
                        viewmodelObservableSearchEpisodeGet = viewmodelObservableSearchEpisode.get();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableSearchSeason
                        viewmodelObservableSearchSeason = viewmodel.getObservableSearchSeason();
                    }
                    updateRegistration(1, viewmodelObservableSearchSeason);


                    if (viewmodelObservableSearchSeason != null) {
                        // read viewmodel.observableSearchSeason.get()
                        viewmodelObservableSearchSeasonGet = viewmodelObservableSearchSeason.get();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableMessage
                        viewmodelObservableMessage = viewmodel.getObservableMessage();
                    }
                    updateRegistration(2, viewmodelObservableMessage);


                    if (viewmodelObservableMessage != null) {
                        // read viewmodel.observableMessage.get()
                        viewmodelObservableMessageGet = viewmodelObservableMessage.get();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableResultDescription
                        viewmodelObservableResultDescription = viewmodel.getObservableResultDescription();
                    }
                    updateRegistration(3, viewmodelObservableResultDescription);


                    if (viewmodelObservableResultDescription != null) {
                        // read viewmodel.observableResultDescription.get()
                        viewmodelObservableResultDescriptionGet = viewmodelObservableResultDescription.get();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableSearchName
                        viewmodelObservableSearchName = viewmodel.getObservableSearchName();
                    }
                    updateRegistration(4, viewmodelObservableSearchName);


                    if (viewmodelObservableSearchName != null) {
                        // read viewmodel.observableSearchName.get()
                        viewmodelObservableSearchNameGet = viewmodelObservableSearchName.get();
                    }


                    if (viewmodelObservableSearchNameGet != null) {
                        // read viewmodel.observableSearchName.get().trim()
                        viewmodelObservableSearchNameGetTrim = viewmodelObservableSearchNameGet.trim();
                    }


                    // read TextUtils.isEmpty(viewmodel.observableSearchName.get().trim())
                    TextUtilsIsEmptyViewmodelObservableSearchNameGetTrim1 = android.text.TextUtils.isEmpty(viewmodelObservableSearchNameGetTrim);


                    // read !TextUtils.isEmpty(viewmodel.observableSearchName.get().trim())
                    textUtilsIsEmptyViewmodelObservableSearchNameGetTrim = !TextUtilsIsEmptyViewmodelObservableSearchNameGetTrim1;
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.observableError
                        viewmodelObservableError = viewmodel.getObservableError();
                    }
                    updateRegistration(5, viewmodelObservableError);


                    if (viewmodelObservableError != null) {
                        // read viewmodel.observableError.get()
                        viewmodelObservableErrorGet = viewmodelObservableError.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.observableError.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelObservableErrorGet = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelObservableErrorGet);
                if((dirtyFlags & 0x320L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelObservableErrorGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.observableError.get()) ? View.VISIBLE : View.GONE
                    viewmodelObservableErrorViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelObservableErrorGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200000L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.observableMessage
                    viewmodelObservableMessage = viewmodel.getObservableMessage();
                }
                updateRegistration(2, viewmodelObservableMessage);


                if (viewmodelObservableMessage != null) {
                    // read viewmodel.observableMessage.get()
                    viewmodelObservableMessageGet = viewmodelObservableMessage.get();
                }


                // read TextUtils.isEmpty(viewmodel.observableMessage.get())
                textUtilsIsEmptyViewmodelObservableMessage = android.text.TextUtils.isEmpty(viewmodelObservableMessageGet);


                // read !TextUtils.isEmpty(viewmodel.observableMessage.get())
                TextUtilsIsEmptyViewmodelObservableMessage1 = !textUtilsIsEmptyViewmodelObservableMessage;
        }

        if ((dirtyFlags & 0x344L) != 0) {

                // read state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false
                stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalse = ((stateStateDownload) ? (TextUtilsIsEmptyViewmodelObservableMessage1) : (false));
            if((dirtyFlags & 0x344L) != 0) {
                if(stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false ? View.VISIBLE : View.GONE
                stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalseViewVISIBLEViewGONE = ((stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.cancelButton.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.episode.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.episodeContainer.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.nameContainer.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.resultDescription.setVisibility(stateStateDownloadViewVISIBLEViewGONE);
            this.searchButton.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.season.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.seasonContainer.setVisibility(stateStateSearchViewVISIBLEViewGONE);
            this.subDownloadHistory.setSelected(stateStateHistory);
            this.subsDownloadList.setVisibility(stateStateDownloadViewVISIBLEViewGONE);
            this.subsHistoryList.setVisibility(stateStateHistoryViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.episode, viewmodelObservableSearchEpisodeGet);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.episode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, episodeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.name, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.season, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, seasonandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, viewmodelObservableMessageGet);
        }
        if ((dirtyFlags & 0x344L) != 0) {
            // api target 1

            this.message.setVisibility(stateStateDownloadTextUtilsIsEmptyViewmodelObservableMessageBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewmodelObservableSearchNameGet);
            this.searchButton.setEnabled(textUtilsIsEmptyViewmodelObservableSearchNameGetTrim);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.resultDescription, viewmodelObservableResultDescriptionGet);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            this.retryButton.setVisibility(viewmodelObservableErrorViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.season, viewmodelObservableSearchSeasonGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.observableSearchEpisode
        flag 1 (0x2L): viewmodel.observableSearchSeason
        flag 2 (0x3L): viewmodel.observableMessage
        flag 3 (0x4L): viewmodel.observableResultDescription
        flag 4 (0x5L): viewmodel.observableSearchName
        flag 5 (0x6L): viewmodel.observableError
        flag 6 (0x7L): state
        flag 7 (0x8L): inError
        flag 8 (0x9L): viewmodel
        flag 9 (0xaL): null
        flag 10 (0xbL): state == SubDownloadDialogState.Search ? View.VISIBLE : View.GONE
        flag 11 (0xcL): state == SubDownloadDialogState.Search ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.observableError.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.observableError.get()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): state == SubDownloadDialogState.History ? View.VISIBLE : View.GONE
        flag 17 (0x12L): state == SubDownloadDialogState.History ? View.VISIBLE : View.GONE
        flag 18 (0x13L): state == SubDownloadDialogState.Download ? View.VISIBLE : View.GONE
        flag 19 (0x14L): state == SubDownloadDialogState.Download ? View.VISIBLE : View.GONE
        flag 20 (0x15L): state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false
        flag 21 (0x16L): state == SubDownloadDialogState.Download ? !TextUtils.isEmpty(viewmodel.observableMessage.get()) : false
    flag mapping end*/
    //end
}