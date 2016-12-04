package com.mifos.mifosxdroid.online.createnewclient;

import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerOffices;
import com.mifos.api.datamanager.DataManagerStaff;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateNewClientPresenter_Factory implements Factory<CreateNewClientPresenter> {
  private final MembersInjector<CreateNewClientPresenter> createNewClientPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  private final Provider<DataManagerOffices> dataManagerOfficesProvider;

  private final Provider<DataManagerStaff> dataManagerStaffProvider;

  public CreateNewClientPresenter_Factory(
      MembersInjector<CreateNewClientPresenter> createNewClientPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerOffices> dataManagerOfficesProvider,
      Provider<DataManagerStaff> dataManagerStaffProvider) {
    assert createNewClientPresenterMembersInjector != null;
    this.createNewClientPresenterMembersInjector = createNewClientPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
    assert dataManagerOfficesProvider != null;
    this.dataManagerOfficesProvider = dataManagerOfficesProvider;
    assert dataManagerStaffProvider != null;
    this.dataManagerStaffProvider = dataManagerStaffProvider;
  }

  @Override
  public CreateNewClientPresenter get() {
    return MembersInjectors.injectMembers(
        createNewClientPresenterMembersInjector,
        new CreateNewClientPresenter(
            dataManagerClientProvider.get(),
            dataManagerOfficesProvider.get(),
            dataManagerStaffProvider.get()));
  }

  public static Factory<CreateNewClientPresenter> create(
      MembersInjector<CreateNewClientPresenter> createNewClientPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider,
      Provider<DataManagerOffices> dataManagerOfficesProvider,
      Provider<DataManagerStaff> dataManagerStaffProvider) {
    return new CreateNewClientPresenter_Factory(
        createNewClientPresenterMembersInjector,
        dataManagerClientProvider,
        dataManagerOfficesProvider,
        dataManagerStaffProvider);
  }
}
