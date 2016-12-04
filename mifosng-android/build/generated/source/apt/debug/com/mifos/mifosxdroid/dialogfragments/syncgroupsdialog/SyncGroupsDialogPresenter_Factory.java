package com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog;

import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerGroups;
import com.mifos.api.datamanager.DataManagerLoan;
import com.mifos.api.datamanager.DataManagerSavings;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncGroupsDialogPresenter_Factory implements Factory<SyncGroupsDialogPresenter> {
  private final MembersInjector<SyncGroupsDialogPresenter> syncGroupsDialogPresenterMembersInjector;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public SyncGroupsDialogPresenter_Factory(
      MembersInjector<SyncGroupsDialogPresenter> syncGroupsDialogPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert syncGroupsDialogPresenterMembersInjector != null;
    this.syncGroupsDialogPresenterMembersInjector = syncGroupsDialogPresenterMembersInjector;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public SyncGroupsDialogPresenter get() {
    return MembersInjectors.injectMembers(
        syncGroupsDialogPresenterMembersInjector,
        new SyncGroupsDialogPresenter(
            dataManagerGroupsProvider.get(),
            dataManagerLoanProvider.get(),
            dataManagerSavingsProvider.get(),
            dataManagerClientProvider.get()));
  }

  public static Factory<SyncGroupsDialogPresenter> create(
      MembersInjector<SyncGroupsDialogPresenter> syncGroupsDialogPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new SyncGroupsDialogPresenter_Factory(
        syncGroupsDialogPresenterMembersInjector,
        dataManagerGroupsProvider,
        dataManagerLoanProvider,
        dataManagerSavingsProvider,
        dataManagerClientProvider);
  }
}
