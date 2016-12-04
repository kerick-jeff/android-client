package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncLoanRepaymentAdapter_Factory implements Factory<SyncLoanRepaymentAdapter> {
  private final MembersInjector<SyncLoanRepaymentAdapter> syncLoanRepaymentAdapterMembersInjector;

  public SyncLoanRepaymentAdapter_Factory(
      MembersInjector<SyncLoanRepaymentAdapter> syncLoanRepaymentAdapterMembersInjector) {
    assert syncLoanRepaymentAdapterMembersInjector != null;
    this.syncLoanRepaymentAdapterMembersInjector = syncLoanRepaymentAdapterMembersInjector;
  }

  @Override
  public SyncLoanRepaymentAdapter get() {
    return MembersInjectors.injectMembers(
        syncLoanRepaymentAdapterMembersInjector, new SyncLoanRepaymentAdapter());
  }

  public static Factory<SyncLoanRepaymentAdapter> create(
      MembersInjector<SyncLoanRepaymentAdapter> syncLoanRepaymentAdapterMembersInjector) {
    return new SyncLoanRepaymentAdapter_Factory(syncLoanRepaymentAdapterMembersInjector);
  }
}
