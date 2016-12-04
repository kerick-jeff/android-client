package com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement;

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
public final class LoanAccountDisbursementPresenter_Factory
    implements Factory<LoanAccountDisbursementPresenter> {
  private final MembersInjector<LoanAccountDisbursementPresenter>
      loanAccountDisbursementPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanAccountDisbursementPresenter_Factory(
      MembersInjector<LoanAccountDisbursementPresenter>
          loanAccountDisbursementPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanAccountDisbursementPresenterMembersInjector != null;
    this.loanAccountDisbursementPresenterMembersInjector =
        loanAccountDisbursementPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanAccountDisbursementPresenter get() {
    return MembersInjectors.injectMembers(
        loanAccountDisbursementPresenterMembersInjector,
        new LoanAccountDisbursementPresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanAccountDisbursementPresenter> create(
      MembersInjector<LoanAccountDisbursementPresenter>
          loanAccountDisbursementPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanAccountDisbursementPresenter_Factory(
        loanAccountDisbursementPresenterMembersInjector, dataManagerProvider);
  }
}
