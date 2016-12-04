package com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanAccountDisbursement_MembersInjector
    implements MembersInjector<LoanAccountDisbursement> {
  private final Provider<LoanAccountDisbursementPresenter>
      mLoanAccountDisbursementPresenterProvider;

  public LoanAccountDisbursement_MembersInjector(
      Provider<LoanAccountDisbursementPresenter> mLoanAccountDisbursementPresenterProvider) {
    assert mLoanAccountDisbursementPresenterProvider != null;
    this.mLoanAccountDisbursementPresenterProvider = mLoanAccountDisbursementPresenterProvider;
  }

  public static MembersInjector<LoanAccountDisbursement> create(
      Provider<LoanAccountDisbursementPresenter> mLoanAccountDisbursementPresenterProvider) {
    return new LoanAccountDisbursement_MembersInjector(mLoanAccountDisbursementPresenterProvider);
  }

  @Override
  public void injectMembers(LoanAccountDisbursement instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanAccountDisbursementPresenter = mLoanAccountDisbursementPresenterProvider.get();
  }

  public static void injectMLoanAccountDisbursementPresenter(
      LoanAccountDisbursement instance,
      Provider<LoanAccountDisbursementPresenter> mLoanAccountDisbursementPresenterProvider) {
    instance.mLoanAccountDisbursementPresenter = mLoanAccountDisbursementPresenterProvider.get();
  }
}
