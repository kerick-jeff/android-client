package com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition;

import com.mifos.api.datamanager.DataManagerLoan;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncLoanRepaymentTransactionPresenter_Factory
    implements Factory<SyncLoanRepaymentTransactionPresenter> {
  private final MembersInjector<SyncLoanRepaymentTransactionPresenter>
      syncLoanRepaymentTransactionPresenterMembersInjector;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  public SyncLoanRepaymentTransactionPresenter_Factory(
      MembersInjector<SyncLoanRepaymentTransactionPresenter>
          syncLoanRepaymentTransactionPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    assert syncLoanRepaymentTransactionPresenterMembersInjector != null;
    this.syncLoanRepaymentTransactionPresenterMembersInjector =
        syncLoanRepaymentTransactionPresenterMembersInjector;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
  }

  @Override
  public SyncLoanRepaymentTransactionPresenter get() {
    return MembersInjectors.injectMembers(
        syncLoanRepaymentTransactionPresenterMembersInjector,
        new SyncLoanRepaymentTransactionPresenter(dataManagerLoanProvider.get()));
  }

  public static Factory<SyncLoanRepaymentTransactionPresenter> create(
      MembersInjector<SyncLoanRepaymentTransactionPresenter>
          syncLoanRepaymentTransactionPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    return new SyncLoanRepaymentTransactionPresenter_Factory(
        syncLoanRepaymentTransactionPresenterMembersInjector, dataManagerLoanProvider);
  }
}
