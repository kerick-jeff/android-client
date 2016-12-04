package com.mifos.mifosxdroid.dialogfragments.syncclientsdialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncClientsDialogFragment_MembersInjector
    implements MembersInjector<SyncClientsDialogFragment> {
  private final Provider<SyncClientsDialogPresenter> mSyncClientsDialogPresenterProvider;

  public SyncClientsDialogFragment_MembersInjector(
      Provider<SyncClientsDialogPresenter> mSyncClientsDialogPresenterProvider) {
    assert mSyncClientsDialogPresenterProvider != null;
    this.mSyncClientsDialogPresenterProvider = mSyncClientsDialogPresenterProvider;
  }

  public static MembersInjector<SyncClientsDialogFragment> create(
      Provider<SyncClientsDialogPresenter> mSyncClientsDialogPresenterProvider) {
    return new SyncClientsDialogFragment_MembersInjector(mSyncClientsDialogPresenterProvider);
  }

  @Override
  public void injectMembers(SyncClientsDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSyncClientsDialogPresenter = mSyncClientsDialogPresenterProvider.get();
  }

  public static void injectMSyncClientsDialogPresenter(
      SyncClientsDialogFragment instance,
      Provider<SyncClientsDialogPresenter> mSyncClientsDialogPresenterProvider) {
    instance.mSyncClientsDialogPresenter = mSyncClientsDialogPresenterProvider.get();
  }
}
