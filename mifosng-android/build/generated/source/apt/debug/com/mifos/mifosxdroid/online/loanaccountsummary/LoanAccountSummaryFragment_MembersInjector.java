package com.mifos.mifosxdroid.online.loanaccountsummary;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanAccountSummaryFragment_MembersInjector
    implements MembersInjector<LoanAccountSummaryFragment> {
  private final Provider<LoanAccountSummaryPresenter> mLoanAccountSummaryPresenterProvider;

  public LoanAccountSummaryFragment_MembersInjector(
      Provider<LoanAccountSummaryPresenter> mLoanAccountSummaryPresenterProvider) {
    assert mLoanAccountSummaryPresenterProvider != null;
    this.mLoanAccountSummaryPresenterProvider = mLoanAccountSummaryPresenterProvider;
  }

  public static MembersInjector<LoanAccountSummaryFragment> create(
      Provider<LoanAccountSummaryPresenter> mLoanAccountSummaryPresenterProvider) {
    return new LoanAccountSummaryFragment_MembersInjector(mLoanAccountSummaryPresenterProvider);
  }

  @Override
  public void injectMembers(LoanAccountSummaryFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanAccountSummaryPresenter = mLoanAccountSummaryPresenterProvider.get();
  }

  public static void injectMLoanAccountSummaryPresenter(
      LoanAccountSummaryFragment instance,
      Provider<LoanAccountSummaryPresenter> mLoanAccountSummaryPresenterProvider) {
    instance.mLoanAccountSummaryPresenter = mLoanAccountSummaryPresenterProvider.get();
  }
}
