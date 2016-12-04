package com.mifos.mifosxdroid.online.savingsaccount;

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
public final class SavingsAccountPresenter_Factory implements Factory<SavingsAccountPresenter> {
  private final MembersInjector<SavingsAccountPresenter> savingsAccountPresenterMembersInjector;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  public SavingsAccountPresenter_Factory(
      MembersInjector<SavingsAccountPresenter> savingsAccountPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    assert savingsAccountPresenterMembersInjector != null;
    this.savingsAccountPresenterMembersInjector = savingsAccountPresenterMembersInjector;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
  }

  @Override
  public SavingsAccountPresenter get() {
    return MembersInjectors.injectMembers(
        savingsAccountPresenterMembersInjector,
        new SavingsAccountPresenter(dataManagerSavingsProvider.get()));
  }

  public static Factory<SavingsAccountPresenter> create(
      MembersInjector<SavingsAccountPresenter> savingsAccountPresenterMembersInjector,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    return new SavingsAccountPresenter_Factory(
        savingsAccountPresenterMembersInjector, dataManagerSavingsProvider);
  }
}
