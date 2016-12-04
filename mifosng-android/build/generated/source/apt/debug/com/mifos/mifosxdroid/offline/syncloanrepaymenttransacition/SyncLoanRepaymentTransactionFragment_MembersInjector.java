package com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition;

import com.mifos.mifosxdroid.adapters.SyncLoanRepaymentAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncLoanRepaymentTransactionFragment_MembersInjector
    implements MembersInjector<SyncLoanRepaymentTransactionFragment> {
  private final Provider<SyncLoanRepaymentTransactionPresenter>
      mSyncLoanRepaymentTransactionPresenterProvider;

  private final Provider<SyncLoanRepaymentAdapter> mSyncLoanRepaymentAdapterProvider;

  public SyncLoanRepaymentTransactionFragment_MembersInjector(
      Provider<SyncLoanRepaymentTransactionPresenter>
          mSyncLoanRepaymentTransactionPresenterProvider,
      Provider<SyncLoanRepaymentAdapter> mSyncLoanRepaymentAdapterProvider) {
    assert mSyncLoanRepaymentTransactionPresenterProvider != null;
    this.mSyncLoanRepaymentTransactionPresenterProvider =
        mSyncLoanRepaymentTransactionPresenterProvider;
    assert mSyncLoanRepaymentAdapterProvider != null;
    this.mSyncLoanRepaymentAdapterProvider = mSyncLoanRepaymentAdapterProvider;
  }

  public static MembersInjector<SyncLoanRepaymentTransactionFragment> create(
      Provider<SyncLoanRepaymentTransactionPresenter>
          mSyncLoanRepaymentTransactionPresenterProvider,
      Provider<SyncLoanRepaymentAdapter> mSyncLoanRepaymentAdapterProvider) {
    return new SyncLoanRepaymentTransactionFragment_MembersInjector(
        mSyncLoanRepaymentTransactionPresenterProvider, mSyncLoanRepaymentAdapterProvider);
  }

  @Override
  public void injectMembers(SyncLoanRepaymentTransactionFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSyncLoanRepaymentTransactionPresenter =
        mSyncLoanRepaymentTransactionPresenterProvider.get();
    instance.mSyncLoanRepaymentAdapter = mSyncLoanRepaymentAdapterProvider.get();
  }

  public static void injectMSyncLoanRepaymentTransactionPresenter(
      SyncLoanRepaymentTransactionFragment instance,
      Provider<SyncLoanRepaymentTransactionPresenter>
          mSyncLoanRepaymentTransactionPresenterProvider) {
    instance.mSyncLoanRepaymentTransactionPresenter =
        mSyncLoanRepaymentTransactionPresenterProvider.get();
  }

  public static void injectMSyncLoanRepaymentAdapter(
      SyncLoanRepaymentTransactionFragment instance,
      Provider<SyncLoanRepaymentAdapter> mSyncLoanRepaymentAdapterProvider) {
    instance.mSyncLoanRepaymentAdapter = mSyncLoanRepaymentAdapterProvider.get();
  }
}
