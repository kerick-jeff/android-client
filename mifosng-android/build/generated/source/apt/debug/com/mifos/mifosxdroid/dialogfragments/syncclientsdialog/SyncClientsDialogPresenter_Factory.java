package com.mifos.mifosxdroid.dialogfragments.syncclientsdialog;

import com.mifos.api.datamanager.DataManagerClient;
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
public final class SyncClientsDialogPresenter_Factory
    implements Factory<SyncClientsDialogPresenter> {
  private final MembersInjector<SyncClientsDialogPresenter>
      syncClientsDialogPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  public SyncClientsDialogPresenter_Factory(
      MembersInjector<SyncClientsDialogPresenter> syncClientsDialogPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    assert syncClientsDialogPresenterMembersInjector != null;
    this.syncClientsDialogPresenterMembersInjector = syncClientsDialogPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
  }

  @Override
  public SyncClientsDialogPresenter get() {
    return MembersInjectors.injectMembers(
        syncClientsDialogPresenterMembersInjector,
        new SyncClientsDialogPresenter(
            dataManagerClientProvider.get(),
            dataManagerLoanProvider.get(),
            dataManagerSavingsProvider.get()));
  }

  public static Factory<SyncClientsDialogPresenter> create(
      MembersInjector<SyncClientsDialogPresenter> syncClientsDialogPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    return new SyncClientsDialogPresenter_Factory(
        syncClientsDialogPresenterMembersInjector,
        dataManagerClientProvider,
        dataManagerLoanProvider,
        dataManagerSavingsProvider);
  }
}
