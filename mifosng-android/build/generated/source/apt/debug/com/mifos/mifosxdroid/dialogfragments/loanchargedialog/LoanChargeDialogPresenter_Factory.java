package com.mifos.mifosxdroid.dialogfragments.loanchargedialog;

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
public final class LoanChargeDialogPresenter_Factory implements Factory<LoanChargeDialogPresenter> {
  private final MembersInjector<LoanChargeDialogPresenter> loanChargeDialogPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanChargeDialogPresenter_Factory(
      MembersInjector<LoanChargeDialogPresenter> loanChargeDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanChargeDialogPresenterMembersInjector != null;
    this.loanChargeDialogPresenterMembersInjector = loanChargeDialogPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanChargeDialogPresenter get() {
    return MembersInjectors.injectMembers(
        loanChargeDialogPresenterMembersInjector,
        new LoanChargeDialogPresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanChargeDialogPresenter> create(
      MembersInjector<LoanChargeDialogPresenter> loanChargeDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanChargeDialogPresenter_Factory(
        loanChargeDialogPresenterMembersInjector, dataManagerProvider);
  }
}
