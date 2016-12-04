package com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval;

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
public final class SavingsAccountApprovalPresenter_Factory
    implements Factory<SavingsAccountApprovalPresenter> {
  private final MembersInjector<SavingsAccountApprovalPresenter>
      savingsAccountApprovalPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public SavingsAccountApprovalPresenter_Factory(
      MembersInjector<SavingsAccountApprovalPresenter>
          savingsAccountApprovalPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert savingsAccountApprovalPresenterMembersInjector != null;
    this.savingsAccountApprovalPresenterMembersInjector =
        savingsAccountApprovalPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public SavingsAccountApprovalPresenter get() {
    return MembersInjectors.injectMembers(
        savingsAccountApprovalPresenterMembersInjector,
        new SavingsAccountApprovalPresenter(dataManagerProvider.get()));
  }

  public static Factory<SavingsAccountApprovalPresenter> create(
      MembersInjector<SavingsAccountApprovalPresenter>
          savingsAccountApprovalPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new SavingsAccountApprovalPresenter_Factory(
        savingsAccountApprovalPresenterMembersInjector, dataManagerProvider);
  }
}
