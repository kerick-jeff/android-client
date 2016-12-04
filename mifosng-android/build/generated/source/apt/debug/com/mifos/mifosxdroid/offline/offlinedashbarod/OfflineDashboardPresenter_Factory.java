package com.mifos.mifosxdroid.offline.offlinedashbarod;

import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerGroups;
import com.mifos.api.datamanager.DataManagerLoan;
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
public final class OfflineDashboardPresenter_Factory implements Factory<OfflineDashboardPresenter> {
  private final MembersInjector<OfflineDashboardPresenter> offlineDashboardPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  private final Provider<DataManagerLoan> dataManagerLoanProvider;

  private final Provider<DataManagerSavings> dataManagerSavingsProvider;

  public OfflineDashboardPresenter_Factory(
      MembersInjector<OfflineDashboardPresenter> offlineDashboardPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    assert offlineDashboardPresenterMembersInjector != null;
    this.offlineDashboardPresenterMembersInjector = offlineDashboardPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
    assert dataManagerLoanProvider != null;
    this.dataManagerLoanProvider = dataManagerLoanProvider;
    assert dataManagerSavingsProvider != null;
    this.dataManagerSavingsProvider = dataManagerSavingsProvider;
  }

  @Override
  public OfflineDashboardPresenter get() {
    return MembersInjectors.injectMembers(
        offlineDashboardPresenterMembersInjector,
        new OfflineDashboardPresenter(
            dataManagerClientProvider.get(),
            dataManagerGroupsProvider.get(),
            dataManagerLoanProvider.get(),
            dataManagerSavingsProvider.get()));
  }

  public static Factory<OfflineDashboardPresenter> create(
      MembersInjector<OfflineDashboardPresenter> offlineDashboardPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerLoan> dataManagerLoanProvider,
      Provider<DataManagerSavings> dataManagerSavingsProvider) {
    return new OfflineDashboardPresenter_Factory(
        offlineDashboardPresenterMembersInjector,
        dataManagerClientProvider,
        dataManagerGroupsProvider,
        dataManagerLoanProvider,
        dataManagerSavingsProvider);
  }
}
