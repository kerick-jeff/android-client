package com.mifos.mifosxdroid.online.loancharge;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanChargeFragment_MembersInjector
    implements MembersInjector<LoanChargeFragment> {
  private final Provider<LoanChargePresenter> mLoanChargePresenterProvider;

  public LoanChargeFragment_MembersInjector(
      Provider<LoanChargePresenter> mLoanChargePresenterProvider) {
    assert mLoanChargePresenterProvider != null;
    this.mLoanChargePresenterProvider = mLoanChargePresenterProvider;
  }

  public static MembersInjector<LoanChargeFragment> create(
      Provider<LoanChargePresenter> mLoanChargePresenterProvider) {
    return new LoanChargeFragment_MembersInjector(mLoanChargePresenterProvider);
  }

  @Override
  public void injectMembers(LoanChargeFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanChargePresenter = mLoanChargePresenterProvider.get();
  }

  public static void injectMLoanChargePresenter(
      LoanChargeFragment instance, Provider<LoanChargePresenter> mLoanChargePresenterProvider) {
    instance.mLoanChargePresenter = mLoanChargePresenterProvider.get();
  }
}
