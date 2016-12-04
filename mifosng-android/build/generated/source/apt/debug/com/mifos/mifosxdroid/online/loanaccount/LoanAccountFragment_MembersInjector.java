package com.mifos.mifosxdroid.online.loanaccount;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanAccountFragment_MembersInjector
    implements MembersInjector<LoanAccountFragment> {
  private final Provider<LoanAccountPresenter> mLoanAccountPresenterProvider;

  public LoanAccountFragment_MembersInjector(
      Provider<LoanAccountPresenter> mLoanAccountPresenterProvider) {
    assert mLoanAccountPresenterProvider != null;
    this.mLoanAccountPresenterProvider = mLoanAccountPresenterProvider;
  }

  public static MembersInjector<LoanAccountFragment> create(
      Provider<LoanAccountPresenter> mLoanAccountPresenterProvider) {
    return new LoanAccountFragment_MembersInjector(mLoanAccountPresenterProvider);
  }

  @Override
  public void injectMembers(LoanAccountFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanAccountPresenter = mLoanAccountPresenterProvider.get();
  }

  public static void injectMLoanAccountPresenter(
      LoanAccountFragment instance, Provider<LoanAccountPresenter> mLoanAccountPresenterProvider) {
    instance.mLoanAccountPresenter = mLoanAccountPresenterProvider.get();
  }
}
