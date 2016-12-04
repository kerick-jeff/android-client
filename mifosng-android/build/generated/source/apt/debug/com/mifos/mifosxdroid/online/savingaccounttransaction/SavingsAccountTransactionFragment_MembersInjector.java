package com.mifos.mifosxdroid.online.savingaccounttransaction;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountTransactionFragment_MembersInjector
    implements MembersInjector<SavingsAccountTransactionFragment> {
  private final Provider<SavingsAccountTransactionPresenter>
      mSavingAccountTransactionPresenterProvider;

  public SavingsAccountTransactionFragment_MembersInjector(
      Provider<SavingsAccountTransactionPresenter> mSavingAccountTransactionPresenterProvider) {
    assert mSavingAccountTransactionPresenterProvider != null;
    this.mSavingAccountTransactionPresenterProvider = mSavingAccountTransactionPresenterProvider;
  }

  public static MembersInjector<SavingsAccountTransactionFragment> create(
      Provider<SavingsAccountTransactionPresenter> mSavingAccountTransactionPresenterProvider) {
    return new SavingsAccountTransactionFragment_MembersInjector(
        mSavingAccountTransactionPresenterProvider);
  }

  @Override
  public void injectMembers(SavingsAccountTransactionFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSavingAccountTransactionPresenter = mSavingAccountTransactionPresenterProvider.get();
  }

  public static void injectMSavingAccountTransactionPresenter(
      SavingsAccountTransactionFragment instance,
      Provider<SavingsAccountTransactionPresenter> mSavingAccountTransactionPresenterProvider) {
    instance.mSavingAccountTransactionPresenter = mSavingAccountTransactionPresenterProvider.get();
  }
}
