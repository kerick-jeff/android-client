package com.mifos.mifosxdroid.online.loanrepaymentschedule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanRepaymentScheduleFragment_MembersInjector
    implements MembersInjector<LoanRepaymentScheduleFragment> {
  private final Provider<LoanRepaymentSchedulePresenter> mLoanRepaymentSchedulePresenterProvider;

  public LoanRepaymentScheduleFragment_MembersInjector(
      Provider<LoanRepaymentSchedulePresenter> mLoanRepaymentSchedulePresenterProvider) {
    assert mLoanRepaymentSchedulePresenterProvider != null;
    this.mLoanRepaymentSchedulePresenterProvider = mLoanRepaymentSchedulePresenterProvider;
  }

  public static MembersInjector<LoanRepaymentScheduleFragment> create(
      Provider<LoanRepaymentSchedulePresenter> mLoanRepaymentSchedulePresenterProvider) {
    return new LoanRepaymentScheduleFragment_MembersInjector(
        mLoanRepaymentSchedulePresenterProvider);
  }

  @Override
  public void injectMembers(LoanRepaymentScheduleFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanRepaymentSchedulePresenter = mLoanRepaymentSchedulePresenterProvider.get();
  }

  public static void injectMLoanRepaymentSchedulePresenter(
      LoanRepaymentScheduleFragment instance,
      Provider<LoanRepaymentSchedulePresenter> mLoanRepaymentSchedulePresenterProvider) {
    instance.mLoanRepaymentSchedulePresenter = mLoanRepaymentSchedulePresenterProvider.get();
  }
}
