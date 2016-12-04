package com.mifos.mifosxdroid.online.loanrepayment;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanRepaymentFragment_MembersInjector
    implements MembersInjector<LoanRepaymentFragment> {
  private final Provider<LoanRepaymentPresenter> mLoanRepaymentPresenterProvider;

  public LoanRepaymentFragment_MembersInjector(
      Provider<LoanRepaymentPresenter> mLoanRepaymentPresenterProvider) {
    assert mLoanRepaymentPresenterProvider != null;
    this.mLoanRepaymentPresenterProvider = mLoanRepaymentPresenterProvider;
  }

  public static MembersInjector<LoanRepaymentFragment> create(
      Provider<LoanRepaymentPresenter> mLoanRepaymentPresenterProvider) {
    return new LoanRepaymentFragment_MembersInjector(mLoanRepaymentPresenterProvider);
  }

  @Override
  public void injectMembers(LoanRepaymentFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanRepaymentPresenter = mLoanRepaymentPresenterProvider.get();
  }

  public static void injectMLoanRepaymentPresenter(
      LoanRepaymentFragment instance,
      Provider<LoanRepaymentPresenter> mLoanRepaymentPresenterProvider) {
    instance.mLoanRepaymentPresenter = mLoanRepaymentPresenterProvider.get();
  }
}
