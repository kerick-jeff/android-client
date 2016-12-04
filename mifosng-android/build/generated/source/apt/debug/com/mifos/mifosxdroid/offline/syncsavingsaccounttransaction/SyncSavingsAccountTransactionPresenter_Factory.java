package com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction;

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
public final class SyncSavingsAccountTransactionPresenter_Factory
    implements Factory<SyncSavingsAccountTransactionPresenter> {
  private final MembersInjector<SyncSavingsAccountTransactionPresenter>
      syncSavingsAccountTransactionPresenterMembersInjector;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  public SyncSavingsAccountTransactionPresenter_Factory(
      MembersInjector<SyncSavingsAccountTransactionPresenter>
          syncSavingsAccountTransactionPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    assert syncSavingsAccountTransactionPresenterMembersInjector != null;
    this.syncSavingsAccountTransactionPresenterMembersInjector =
        syncSavingsAccountTransactionPresenterMembersInjector;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
  }

  @Override
  public SyncSavingsAccountTransactionPresenter get() {
    return MembersInjectors.injectMembers(
        syncSavingsAccountTransactionPresenterMembersInjector,
        new SyncSavingsAccountTransactionPresenter(
            dataManagerSavingsProvider.get(), dataManagerLoanProvider.get()));
  }

  public static Factory<SyncSavingsAccountTransactionPresenter> create(
      MembersInjector<SyncSavingsAccountTransactionPresenter>
          syncSavingsAccountTransactionPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    return new SyncSavingsAccountTransactionPresenter_Factory(
        syncSavingsAccountTransactionPresenterMembersInjector,
        dataManagerSavingsProvider,
        dataManagerLoanProvider);
  }
}
