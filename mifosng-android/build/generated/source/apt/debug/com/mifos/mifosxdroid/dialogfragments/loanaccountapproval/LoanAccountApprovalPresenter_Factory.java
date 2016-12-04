package com.mifos.mifosxdroid.dialogfragments.loanaccountapproval;

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
public final class LoanAccountApprovalPresenter_Factory
    implements Factory<LoanAccountApprovalPresenter> {
  private final MembersInjector<LoanAccountApprovalPresenter>
      loanAccountApprovalPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanAccountApprovalPresenter_Factory(
      MembersInjector<LoanAccountApprovalPresenter> loanAccountApprovalPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanAccountApprovalPresenterMembersInjector != null;
    this.loanAccountApprovalPresenterMembersInjector = loanAccountApprovalPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanAccountApprovalPresenter get() {
    return MembersInjectors.injectMembers(
        loanAccountApprovalPresenterMembersInjector,
        new LoanAccountApprovalPresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanAccountApprovalPresenter> create(
      MembersInjector<LoanAccountApprovalPresenter> loanAccountApprovalPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanAccountApprovalPresenter_Factory(
        loanAccountApprovalPresenterMembersInjector, dataManagerProvider);
  }
}
