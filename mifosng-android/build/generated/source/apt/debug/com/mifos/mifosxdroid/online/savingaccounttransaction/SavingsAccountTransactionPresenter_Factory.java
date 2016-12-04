package com.mifos.mifosxdroid.online.savingaccounttransaction;

import com.mifos.api.datamanager.DataManagerSavings;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountTransactionPresenter_Factory
    implements Factory<SavingsAccountTransactionPresenter> {
  private final MembersInjector<SavingsAccountTransactionPresenter>
      savingsAccountTransactionPresenterMembersInjector;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  public SavingsAccountTransactionPresenter_Factory(
      MembersInjector<SavingsAccountTransactionPresenter>
          savingsAccountTransactionPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    assert savingsAccountTransactionPresenterMembersInjector != null;
    this.savingsAccountTransactionPresenterMembersInjector =
        savingsAccountTransactionPresenterMembersInjector;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
  }

  @Override
  public SavingsAccountTransactionPresenter get() {
    return MembersInjectors.injectMembers(
        savingsAccountTransactionPresenterMembersInjector,
        new SavingsAccountTransactionPresenter(dataManagerSavingsProvider.get()));
  }

  public static Factory<SavingsAccountTransactionPresenter> create(
      MembersInjector<SavingsAccountTransactionPresenter>
          savingsAccountTransactionPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    return new SavingsAccountTransactionPresenter_Factory(
        savingsAccountTransactionPresenterMembersInjector, dataManagerSavingsProvider);
  }
}
