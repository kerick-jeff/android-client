package com.mifos.mifosxdroid.online.savingaccountsummary;

import com.mifos.api.datamanager.DataManagerDataTable;
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
public final class SavingsAccountSummaryPresenter_Factory
    implements Factory<SavingsAccountSummaryPresenter> {
  private final MembersInjector<SavingsAccountSummaryPresenter>
      savingsAccountSummaryPresenterMembersInjector;

  private final Provider<DataManagerDataTable> dataManagerDataTableProvider;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  public SavingsAccountSummaryPresenter_Factory(
      MembersInjector<SavingsAccountSummaryPresenter> savingsAccountSummaryPresenterMembersInjector,
      Provider<DataManagerDataTable> dataManagerDataTableProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    assert savingsAccountSummaryPresenterMembersInjector != null;
    this.savingsAccountSummaryPresenterMembersInjector =
        savingsAccountSummaryPresenterMembersInjector;
    assert dataManagerDataTableProvider != null;
    this.dataManagerDataTableProvider = dataManagerDataTableProvider;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
  }

  @Override
  public SavingsAccountSummaryPresenter get() {
    return MembersInjectors.injectMembers(
        savingsAccountSummaryPresenterMembersInjector,
        new SavingsAccountSummaryPresenter(
            dataManagerDataTableProvider.get(), dataManagerSavingsProvider.get()));
  }

  public static Factory<SavingsAccountSummaryPresenter> create(
      MembersInjector<SavingsAccountSummaryPresenter> savingsAccountSummaryPresenterMembersInjector,
      Provider<DataManagerDataTable> dataManagerDataTableProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    return new SavingsAccountSummaryPresenter_Factory(
        savingsAccountSummaryPresenterMembersInjector,
        dataManagerDataTableProvider,
        dataManagerSavingsProvider);
  }
}
