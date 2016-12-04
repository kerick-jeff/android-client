package com.mifos.mifosxdroid.online.centerlist;

import com.mifos.api.datamanager.DataManagerCenter;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CenterListPresenter_Factory implements Factory<CenterListPresenter> {
  private final MembersInjector<CenterListPresenter> centerListPresenterMembersInjector;

  private final Provider<DataManagerCenter> dataManagerCenterProvider;

  public CenterListPresenter_Factory(
      MembersInjector<CenterListPresenter> centerListPresenterMembersInjector,
      Provider<DataManagerCenter> dataManagerCenterProvider) {
    assert centerListPresenterMembersInjector != null;
    this.centerListPresenterMembersInjector = centerListPresenterMembersInjector;
    assert dataManagerCenterProvider != null;
    this.dataManagerCenterProvider = dataManagerCenterProvider;
  }

  @Override
  public CenterListPresenter get() {
    return MembersInjectors.injectMembers(
        centerListPresenterMembersInjector,
        new CenterListPresenter(dataManagerCenterProvider.get()));
  }

  public static Factory<CenterListPresenter> create(
      MembersInjector<CenterListPresenter> centerListPresenterMembersInjector,
      Provider<DataManagerCenter> dataManagerCenterProvider) {
    return new CenterListPresenter_Factory(
        centerListPresenterMembersInjector, dataManagerCenterProvider);
  }
}
