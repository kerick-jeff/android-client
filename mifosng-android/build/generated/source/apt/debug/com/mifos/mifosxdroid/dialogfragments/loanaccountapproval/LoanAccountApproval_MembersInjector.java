package com.mifos.mifosxdroid.dialogfragments.loanaccountapproval;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanAccountApproval_MembersInjector
    implements MembersInjector<LoanAccountApproval> {
  private final Provider<LoanAccountApprovalPresenter> mLoanAccountApprovalPresenterProvider;

  public LoanAccountApproval_MembersInjector(
      Provider<LoanAccountApprovalPresenter> mLoanAccountApprovalPresenterProvider) {
    assert mLoanAccountApprovalPresenterProvider != null;
    this.mLoanAccountApprovalPresenterProvider = mLoanAccountApprovalPresenterProvider;
  }

  public static MembersInjector<LoanAccountApproval> create(
      Provider<LoanAccountApprovalPresenter> mLoanAccountApprovalPresenterProvider) {
    return new LoanAccountApproval_MembersInjector(mLoanAccountApprovalPresenterProvider);
  }

  @Override
  public void injectMembers(LoanAccountApproval instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanAccountApprovalPresenter = mLoanAccountApprovalPresenterProvider.get();
  }

  public static void injectMLoanAccountApprovalPresenter(
      LoanAccountApproval instance,
      Provider<LoanAccountApprovalPresenter> mLoanAccountApprovalPresenterProvider) {
    instance.mLoanAccountApprovalPresenter = mLoanAccountApprovalPresenterProvider.get();
  }
}
