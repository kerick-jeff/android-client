package com.mifos.mifosxdroid.online.loanaccount;

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
public final class LoanAccountPresenter_Factory implements Factory<LoanAccountPresenter> {
  private final MembersInjector<LoanAccountPresenter> loanAccountPresenterMembersInjector;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  public LoanAccountPresenter_Factory(
      MembersInjector<LoanAccountPresenter> loanAccountPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    assert loanAccountPresenterMembersInjector != null;
    this.loanAccountPresenterMembersInjector = loanAccountPresenterMembersInjector;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
  }

  @Override
  public LoanAccountPresenter get() {
    return MembersInjectors.injectMembers(
        loanAccountPresenterMembersInjector,
        new LoanAccountPresenter(dataManagerLoanProvider.get()));
  }

  public static Factory<LoanAccountPresenter> create(
      MembersInjector<LoanAccountPresenter> loanAccountPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider) {
    return new LoanAccountPresenter_Factory(
        loanAccountPresenterMembersInjector, dataManagerLoanProvider);
  }
}
