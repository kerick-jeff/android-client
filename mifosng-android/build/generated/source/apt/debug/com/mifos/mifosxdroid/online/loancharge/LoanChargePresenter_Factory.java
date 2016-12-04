package com.mifos.mifosxdroid.online.loancharge;

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
public final class LoanChargePresenter_Factory implements Factory<LoanChargePresenter> {
  private final MembersInjector<LoanChargePresenter> loanChargePresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanChargePresenter_Factory(
      MembersInjector<LoanChargePresenter> loanChargePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanChargePresenterMembersInjector != null;
    this.loanChargePresenterMembersInjector = loanChargePresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanChargePresenter get() {
    return MembersInjectors.injectMembers(
        loanChargePresenterMembersInjector, new LoanChargePresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanChargePresenter> create(
      MembersInjector<LoanChargePresenter> loanChargePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanChargePresenter_Factory(loanChargePresenterMembersInjector, dataManagerProvider);
  }
}
