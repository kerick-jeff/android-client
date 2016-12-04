package com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncGroupsDialogFragment_MembersInjector
    implements MembersInjector<SyncGroupsDialogFragment> {
  private final Provider<SyncGroupsDialogPresenter> syncGroupsDialogPresenterProvider;

  public SyncGroupsDialogFragment_MembersInjector(
      Provider<SyncGroupsDialogPresenter> syncGroupsDialogPresenterProvider) {
    assert syncGroupsDialogPresenterProvider != null;
    this.syncGroupsDialogPresenterProvider = syncGroupsDialogPresenterProvider;
  }

  public static MembersInjector<SyncGroupsDialogFragment> create(
      Provider<SyncGroupsDialogPresenter> syncGroupsDialogPresenterProvider) {
    return new SyncGroupsDialogFragment_MembersInjector(syncGroupsDialogPresenterProvider);
  }

  @Override
  public void injectMembers(SyncGroupsDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.syncGroupsDialogPresenter = syncGroupsDialogPresenterProvider.get();
  }

  public static void injectSyncGroupsDialogPresenter(
      SyncGroupsDialogFragment instance,
      Provider<SyncGroupsDialogPresenter> syncGroupsDialogPresenterProvider) {
    instance.syncGroupsDialogPresenter = syncGroupsDialogPresenterProvider.get();
  }
}
