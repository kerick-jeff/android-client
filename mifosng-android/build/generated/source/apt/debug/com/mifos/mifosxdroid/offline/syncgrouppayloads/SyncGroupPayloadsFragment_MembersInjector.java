package com.mifos.mifosxdroid.offline.syncgrouppayloads;

import com.mifos.mifosxdroid.adapters.SyncGroupPayloadAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncGroupPayloadsFragment_MembersInjector
    implements MembersInjector<SyncGroupPayloadsFragment> {
  private final Provider<SyncGroupPayloadsPresenter> mSyncGroupPayloadsPresenterProvider;

  private final Provider<SyncGroupPayloadAdapter> mSyncGroupPayloadAdapterProvider;

  public SyncGroupPayloadsFragment_MembersInjector(
      Provider<SyncGroupPayloadsPresenter> mSyncGroupPayloadsPresenterProvider,
      Provider<SyncGroupPayloadAdapter> mSyncGroupPayloadAdapterProvider) {
    assert mSyncGroupPayloadsPresenterProvider != null;
    this.mSyncGroupPayloadsPresenterProvider = mSyncGroupPayloadsPresenterProvider;
    assert mSyncGroupPayloadAdapterProvider != null;
    this.mSyncGroupPayloadAdapterProvider = mSyncGroupPayloadAdapterProvider;
  }

  public static MembersInjector<SyncGroupPayloadsFragment> create(
      Provider<SyncGroupPayloadsPresenter> mSyncGroupPayloadsPresenterProvider,
      Provider<SyncGroupPayloadAdapter> mSyncGroupPayloadAdapterProvider) {
    return new SyncGroupPayloadsFragment_MembersInjector(
        mSyncGroupPayloadsPresenterProvider, mSyncGroupPayloadAdapterProvider);
  }

  @Override
  public void injectMembers(SyncGroupPayloadsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSyncGroupPayloadsPresenter = mSyncGroupPayloadsPresenterProvider.get();
    instance.mSyncGroupPayloadAdapter = mSyncGroupPayloadAdapterProvider.get();
  }

  public static void injectMSyncGroupPayloadsPresenter(
      SyncGroupPayloadsFragment instance,
      Provider<SyncGroupPayloadsPresenter> mSyncGroupPayloadsPresenterProvider) {
    instance.mSyncGroupPayloadsPresenter = mSyncGroupPayloadsPresenterProvider.get();
  }

  public static void injectMSyncGroupPayloadAdapter(
      SyncGroupPayloadsFragment instance,
      Provider<SyncGroupPayloadAdapter> mSyncGroupPayloadAdapterProvider) {
    instance.mSyncGroupPayloadAdapter = mSyncGroupPayloadAdapterProvider.get();
  }
}
