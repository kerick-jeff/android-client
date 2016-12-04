package com.mifos.mifosxdroid.online.loanrepayment;

import com.mifos.api.datamanager.DataManagerLoan;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanRepaymentPresenter_Factory implements Factory<LoanRepaymentPresenter> {
  private final MembersInjector<LoanRepaymentPresenter> loanRepaymentPresenterMembersInjector;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  public LoanRepaymentPresenter_Factory(
      MembersInjector<LoanRepaymentPresenter> loanRepaymentPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    assert loanRepaymentPresenterMembersInjector != null;
    this.loanRepaymentPresenterMembersInjector = loanRepaymentPresenterMembersInjector;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
  }

  @Override
  public LoanRepaymentPresenter get() {
    return MembersInjectors.injectMembers(
        loanRepaymentPresenterMembersInjector,
        new LoanRepaymentPresenter(dataManagerLoanProvider.get()));
  }

  public static Factory<LoanRepaymentPresenter> create(
      MembersInjector<LoanRepaymentPresenter> loanRepaymentPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    return new LoanRepaymentPresenter_Factory(
        loanRepaymentPresenterMembersInjector, dataManagerLoanProvider);
  }
}
