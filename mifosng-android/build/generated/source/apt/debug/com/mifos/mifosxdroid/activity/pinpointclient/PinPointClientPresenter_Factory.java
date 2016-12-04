package com.mifos.mifosxdroid.activity.pinpointclient;

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
public final class PinPointClientPresenter_Factory implements Factory<PinPointClientPresenter> {
  private final MembersInjector<PinPointClientPresenter> pinPointClientPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public PinPointClientPresenter_Factory(
      MembersInjector<PinPointClientPresenter> pinPointClientPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert pinPointClientPresenterMembersInjector != null;
    this.pinPointClientPresenterMembersInjector = pinPointClientPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public PinPointClientPresenter get() {
    return MembersInjectors.injectMembers(
        pinPointClientPresenterMembersInjector,
        new PinPointClientPresenter(dataManagerProvider.get()));
  }

  public static Factory<PinPointClientPresenter> create(
      MembersInjector<PinPointClientPresenter> pinPointClientPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new PinPointClientPresenter_Factory(
        pinPointClientPresenterMembersInjector, dataManagerProvider);
  }
}
