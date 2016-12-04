package com.mifos.mifosxdroid.dialogfragments.loanchargedialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanChargeDialogFragment_MembersInjector
    implements MembersInjector<LoanChargeDialogFragment> {
  private final Provider<LoanChargeDialogPresenter> mLoanChargeDialogPresenterProvider;

  public LoanChargeDialogFragment_MembersInjector(
      Provider<LoanChargeDialogPresenter> mLoanChargeDialogPresenterProvider) {
    assert mLoanChargeDialogPresenterProvider != null;
    this.mLoanChargeDialogPresenterProvider = mLoanChargeDialogPresenterProvider;
  }

  public static MembersInjector<LoanChargeDialogFragment> create(
      Provider<LoanChargeDialogPresenter> mLoanChargeDialogPresenterProvider) {
    return new LoanChargeDialogFragment_MembersInjector(mLoanChargeDialogPresenterProvider);
  }

  @Override
  public void injectMembers(LoanChargeDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoanChargeDialogPresenter = mLoanChargeDialogPresenterProvider.get();
  }

  public static void injectMLoanChargeDialogPresenter(
      LoanChargeDialogFragment instance,
      Provider<LoanChargeDialogPresenter> mLoanChargeDialogPresenterProvider) {
    instance.mLoanChargeDialogPresenter = mLoanChargeDialogPresenterProvider.get();
  }
}
