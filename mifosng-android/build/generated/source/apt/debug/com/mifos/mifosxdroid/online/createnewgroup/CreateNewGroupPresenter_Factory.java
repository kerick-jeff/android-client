package com.mifos.mifosxdroid.online.createnewgroup;

import com.mifos.api.datamanager.DataManagerGroups;
import com.mifos.api.datamanager.DataManagerOffices;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateNewGroupPresenter_Factory implements Factory<CreateNewGroupPresenter> {
  private final MembersInjector<CreateNewGroupPresenter> createNewGroupPresenterMembersInjector;

  private final Provider<DataManagerOffices> dataManagerOfficesProvider;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  public CreateNewGroupPresenter_Factory(
      MembersInjector<CreateNewGroupPresenter> createNewGroupPresenterMembersInjector,
      Provider<DataManagerOffices> dataManagerOfficesProvider,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    assert createNewGroupPresenterMembersInjector != null;
    this.createNewGroupPresenterMembersInjector = createNewGroupPresenterMembersInjector;
    assert dataManagerOfficesProvider != null;
    this.dataManagerOfficesProvider = dataManagerOfficesProvider;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
  }

  @Override
  public CreateNewGroupPresenter get() {
    return MembersInjectors.injectMembers(
        createNewGroupPresenterMembersInjector,
        new CreateNewGroupPresenter(
            dataManagerOfficesProvider.get(), dataManagerGroupsProvider.get()));
  }

  public static Factory<CreateNewGroupPresenter> create(
      MembersInjector<CreateNewGroupPresenter> createNewGroupPresenterMembersInjector,
      Provider<DataManagerOffices> dataManagerOfficesProvider,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    return new CreateNewGroupPresenter_Factory(
        createNewGroupPresenterMembersInjector,
        dataManagerOfficesProvider,
        dataManagerGroupsProvider);
  }
}
