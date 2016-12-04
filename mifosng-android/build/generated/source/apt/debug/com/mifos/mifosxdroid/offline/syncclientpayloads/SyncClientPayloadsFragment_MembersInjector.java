package com.mifos.mifosxdroid.offline.syncclientpayloads;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncClientPayloadsFragment_MembersInjector
    implements MembersInjector<SyncClientPayloadsFragment> {
  private final Provider<SyncClientPayloadsPresenter> mSyncPayloadsPresenterProvider;

  public SyncClientPayloadsFragment_MembersInjector(
      Provider<SyncClientPayloadsPresenter> mSyncPayloadsPresenterProvider) {
    assert mSyncPayloadsPresenterProvider != null;
    this.mSyncPayloadsPresenterProvider = mSyncPayloadsPresenterProvider;
  }

  public static MembersInjector<SyncClientPayloadsFragment> create(
      Provider<SyncClientPayloadsPresenter> mSyncPayloadsPresenterProvider) {
    return new SyncClientPayloadsFragment_MembersInjector(mSyncPayloadsPresenterProvider);
  }

  @Override
  public void injectMembers(SyncClientPayloadsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSyncPayloadsPresenter = mSyncPayloadsPresenterProvider.get();
  }

  public static void injectMSyncPayloadsPresenter(
      SyncClientPayloadsFragment instance,
      Provider<SyncClientPayloadsPresenter> mSyncPayloadsPresenterProvider) {
    instance.mSyncPayloadsPresenter = mSyncPayloadsPresenterProvider.get();
  }
}
