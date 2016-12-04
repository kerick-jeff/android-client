package com.mifos.mifosxdroid.online.loanrepaymentschedule;

import com.mifos.api.DataManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanRepaymentSchedulePresenter_Factory
    implements Factory<LoanRepaymentSchedulePresenter> {
  private final MembersInjector<LoanRepaymentSchedulePresenter>
      loanRepaymentSchedulePresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanRepaymentSchedulePresenter_Factory(
      MembersInjector<LoanRepaymentSchedulePresenter> loanRepaymentSchedulePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanRepaymentSchedulePresenterMembersInjector != null;
    this.loanRepaymentSchedulePresenterMembersInjector =
        loanRepaymentSchedulePresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanRepaymentSchedulePresenter get() {
    return MembersInjectors.injectMembers(
        loanRepaymentSchedulePresenterMembersInjector,
        new LoanRepaymentSchedulePresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanRepaymentSchedulePresenter> create(
      MembersInjector<LoanRepaymentSchedulePresenter> loanRepaymentSchedulePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanRepaymentSchedulePresenter_Factory(
        loanRepaymentSchedulePresenterMembersInjector, dataManagerProvider);
  }
}
