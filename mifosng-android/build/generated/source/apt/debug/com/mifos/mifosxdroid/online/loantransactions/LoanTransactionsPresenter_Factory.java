package com.mifos.mifosxdroid.online.loantransactions;

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
public final class LoanTransactionsPresenter_Factory implements Factory<LoanTransactionsPresenter> {
  private final MembersInjector<LoanTransactionsPresenter> loanTransactionsPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public LoanTransactionsPresenter_Factory(
      MembersInjector<LoanTransactionsPresenter> loanTransactionsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert loanTransactionsPresenterMembersInjector != null;
    this.loanTransactionsPresenterMembersInjector = loanTransactionsPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoanTransactionsPresenter get() {
    return MembersInjectors.injectMembers(
        loanTransactionsPresenterMembersInjector,
        new LoanTransactionsPresenter(dataManagerProvider.get()));
  }

  public static Factory<LoanTransactionsPresenter> create(
      MembersInjector<LoanTransactionsPresenter> loanTransactionsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new LoanTransactionsPresenter_Factory(
        loanTransactionsPresenterMembersInjector, dataManagerProvider);
  }
}
