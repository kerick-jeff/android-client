package com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction;

import com.mifos.mifosxdroid.adapters.SyncSavingsAccountTransactionAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncSavingsAccountTransactionFragment_MembersInjector
    implements MembersInjector<SyncSavingsAccountTransactionFragment> {
  private final Provider<SyncSavingsAccountTransactionPresenter>
      mSyncSavingsAccountTransactionPresenterProvider;

  private final Provider<SyncSavingsAccountTransactionAdapter>
      mSyncSavingsAccountTransactionAdapterProvider;

  public SyncSavingsAccountTransactionFragment_MembersInjector(
      Provider<SyncSavingsAccountTransactionPresenter>
          mSyncSavingsAccountTransactionPresenterProvider,
      Provider<SyncSavingsAccountTransactionAdapter>
          mSyncSavingsAccountTransactionAdapterProvider) {
    assert mSyncSavingsAccountTransactionPresenterProvider != null;
    this.mSyncSavingsAccountTransactionPresenterProvider =
        mSyncSavingsAccountTransactionPresenterProvider;
    assert mSyncSavingsAccountTransactionAdapterProvider != null;
    this.mSyncSavingsAccountTransactionAdapterProvider =
        mSyncSavingsAccountTransactionAdapterProvider;
  }

  public static MembersInjector<SyncSavingsAccountTransactionFragment> create(
      Provider<SyncSavingsAccountTransactionPresenter>
          mSyncSavingsAccountTransactionPresenterProvider,
      Provider<SyncSavingsAccountTransactionAdapter>
          mSyncSavingsAccountTransactionAdapterProvider) {
    return new SyncSavingsAccountTransactionFragment_MembersInjector(
        mSyncSavingsAccountTransactionPresenterProvider,
        mSyncSavingsAccountTransactionAdapterProvider);
  }

  @Override
  public void injectMembers(SyncSavingsAccountTransactionFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSyncSavingsAccountTransactionPresenter =
        mSyncSavingsAccountTransactionPresenterProvider.get();
    instance.mSyncSavingsAccountTransactionAdapter =
        mSyncSavingsAccountTransactionAdapterProvider.get();
  }

  public static void injectMSyncSavingsAccountTransactionPresenter(
      SyncSavingsAccountTransactionFragment instance,
      Provider<SyncSavingsAccountTransactionPresenter>
          mSyncSavingsAccountTransactionPresenterProvider) {
    instance.mSyncSavingsAccountTransactionPresenter =
        mSyncSavingsAccountTransactionPresenterProvider.get();
  }

  public static void injectMSyncSavingsAccountTransactionAdapter(
      SyncSavingsAccountTransactionFragment instance,
      Provider<SyncSavingsAccountTransactionAdapter>
          mSyncSavingsAccountTransactionAdapterProvider) {
    instance.mSyncSavingsAccountTransactionAdapter =
        mSyncSavingsAccountTransactionAdapterProvider.get();
  }
}
