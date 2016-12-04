package com.mifos.mifosxdroid.online.createnewcenter;

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
public final class CreateNewCenterPresenter_Factory implements Factory<CreateNewCenterPresenter> {
  private final MembersInjector<CreateNewCenterPresenter> createNewCenterPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public CreateNewCenterPresenter_Factory(
      MembersInjector<CreateNewCenterPresenter> createNewCenterPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert createNewCenterPresenterMembersInjector != null;
    this.createNewCenterPresenterMembersInjector = createNewCenterPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public CreateNewCenterPresenter get() {
    return MembersInjectors.injectMembers(
        createNewCenterPresenterMembersInjector,
        new CreateNewCenterPresenter(dataManagerProvider.get()));
  }

  public static Factory<CreateNewCenterPresenter> create(
      MembersInjector<CreateNewCenterPresenter> createNewCenterPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new CreateNewCenterPresenter_Factory(
        createNewCenterPresenterMembersInjector, dataManagerProvider);
  }
}
