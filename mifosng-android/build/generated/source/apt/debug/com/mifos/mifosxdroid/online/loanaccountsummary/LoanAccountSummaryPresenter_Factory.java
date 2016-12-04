package com.mifos.mifosxdroid.online.loanaccountsummary;

import com.mifos.api.datamanager.DataManagerDataTable;
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
public final class LoanAccountSummaryPresenter_Factory
    implements Factory<LoanAccountSummaryPresenter> {
  private final MembersInjector<LoanAccountSummaryPresenter>
      loanAccountSummaryPresenterMembersInjector;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  private final Provider<DataManagerDataTable> dataManagerDataTableProvider;

  public LoanAccountSummaryPresenter_Factory(
      MembersInjector<LoanAccountSummaryPresenter> loanAccountSummaryPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerDataTable> dataManagerDataTableProvider) {
    assert loanAccountSummaryPresenterMembersInjector != null;
    this.loanAccountSummaryPresenterMembersInjector = loanAccountSummaryPresenterMembersInjector;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
    assert dataManagerDataTableProvider != null;
    this.dataManagerDataTableProvider = dataManagerDataTableProvider;
  }

  @Override
  public LoanAccountSummaryPresenter get() {
    return MembersInjectors.injectMembers(
        loanAccountSummaryPresenterMembersInjector,
        new LoanAccountSummaryPresenter(
            dataManagerLoanProvider.get(), dataManagerDataTableProvider.get()));
  }

  public static Factory<LoanAccountSummaryPresenter> create(
      MembersInjector<LoanAccountSummaryPresenter> loanAccountSummaryPresenterMembersInjector,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerDataTable> dataManagerDataTableProvider) {
    return new LoanAccountSummaryPresenter_Factory(
        loanAccountSummaryPresenterMembersInjector,
        dataManagerLoanProvider,
        dataManagerDataTableProvider);
  }
}
