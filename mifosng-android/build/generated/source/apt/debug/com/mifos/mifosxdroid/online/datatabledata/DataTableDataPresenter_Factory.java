package com.mifos.mifosxdroid.online.datatabledata;

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
public final class DataTableDataPresenter_Factory implements Factory<DataTableDataPresenter> {
  private final MembersInjector<DataTableDataPresenter> dataTableDataPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public DataTableDataPresenter_Factory(
      MembersInjector<DataTableDataPresenter> dataTableDataPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert dataTableDataPresenterMembersInjector != null;
    this.dataTableDataPresenterMembersInjector = dataTableDataPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public DataTableDataPresenter get() {
    return MembersInjectors.injectMembers(
        dataTableDataPresenterMembersInjector,
        new DataTableDataPresenter(dataManagerProvider.get()));
  }

  public static Factory<DataTableDataPresenter> create(
      MembersInjector<DataTableDataPresenter> dataTableDataPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new DataTableDataPresenter_Factory(
        dataTableDataPresenterMembersInjector, dataManagerProvider);
  }
}
