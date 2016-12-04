package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncSavingsAccountTransactionAdapter_Factory
    implements Factory<SyncSavingsAccountTransactionAdapter> {
  private final MembersInjector<SyncSavingsAccountTransactionAdapter>
      syncSavingsAccountTransactionAdapterMembersInjector;

  public SyncSavingsAccountTransactionAdapter_Factory(
      MembersInjector<SyncSavingsAccountTransactionAdapter>
          syncSavingsAccountTransactionAdapterMembersInjector) {
    assert syncSavingsAccountTransactionAdapterMembersInjector != null;
    this.syncSavingsAccountTransactionAdapterMembersInjector =
        syncSavingsAccountTransactionAdapterMembersInjector;
  }

  @Override
  public SyncSavingsAccountTransactionAdapter get() {
    return MembersInjectors.injectMembers(
        syncSavingsAccountTransactionAdapterMembersInjector,
        new SyncSavingsAccountTransactionAdapter());
  }

  public static Factory<SyncSavingsAccountTransactionAdapter> create(
      MembersInjector<SyncSavingsAccountTransactionAdapter>
          syncSavingsAccountTransactionAdapterMembersInjector) {
    return new SyncSavingsAccountTransactionAdapter_Factory(
        syncSavingsAccountTransactionAdapterMembersInjector);
  }
}
