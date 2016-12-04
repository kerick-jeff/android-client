package com.mifos.mifosxdroid.dialogfragments.datatablerowdialog;

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
public final class DataTableRowDialogPresenter_Factory
    implements Factory<DataTableRowDialogPresenter> {
  private final MembersInjector<DataTableRowDialogPresenter>
      dataTableRowDialogPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public DataTableRowDialogPresenter_Factory(
      MembersInjector<DataTableRowDialogPresenter> dataTableRowDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert dataTableRowDialogPresenterMembersInjector != null;
    this.dataTableRowDialogPresenterMembersInjector = dataTableRowDialogPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public DataTableRowDialogPresenter get() {
    return MembersInjectors.injectMembers(
        dataTableRowDialogPresenterMembersInjector,
        new DataTableRowDialogPresenter(dataManagerProvider.get()));
  }

  public static Factory<DataTableRowDialogPresenter> create(
      MembersInjector<DataTableRowDialogPresenter> dataTableRowDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new DataTableRowDialogPresenter_Factory(
        dataTableRowDialogPresenterMembersInjector, dataManagerProvider);
  }
}
