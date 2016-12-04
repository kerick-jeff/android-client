package com.mifos.mifosxdroid.online.loantransactions;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanTransactionsFragment_MembersInjector
    implements MembersInjector<LoanTransactionsFragment> {
  private final Provider<LoanTransactionsPresenter> mLoanTransactionsPresenterProvider;

  public LoanTransactionsFragment_MembersInjector(
      Provider<LoanTransactionsPresenter> mLoanTransactionsPresenterProvider) {
    assert mLoanTransactionsPresenterProvider != null;
    this.mLoanTransactionsPresenterProvider = mLoanTransactionsPresenterProvider;
  }

  public static MembersInjector<LoanTransactionsFragment> create(
      Provider<LoanTransactionsPresenter> mLoanTransactionsPresenterProvider) {
    return new LoanTransactionsFragment_MembersInjector(mLoanTransactionsPresenterProvider);
  }

  @Override
  public void injectMembers(LoanTransactionsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanTransactionsPresenter = mLoanTransactionsPresenterProvider.get();
  }

  public static void injectMLoanTransactionsPresenter(
      LoanTransactionsFragment instance,
      Provider<LoanTransactionsPresenter> mLoanTransactionsPresenterProvider) {
    instance.mLoanTransactionsPresenter = mLoanTransactionsPresenterProvider.get();
  }
}
