package com.mifos.mifosxdroid.activity.pinpointclient;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PinpointClientActivity_MembersInjector
    implements MembersInjector<PinpointClientActivity> {
  private final Provider<PinPointClientPresenter> mPinPointClientPresenterProvider;

  public PinpointClientActivity_MembersInjector(
      Provider<PinPointClientPresenter> mPinPointClientPresenterProvider) {
    assert mPinPointClientPresenterProvider != null;
    this.mPinPointClientPresenterProvider = mPinPointClientPresenterProvider;
  }

  public static MembersInjector<PinpointClientActivity> create(
      Provider<PinPointClientPresenter> mPinPointClientPresenterProvider) {
    return new PinpointClientActivity_MembersInjector(mPinPointClientPresenterProvider);
  }

  @Override
  public void injectMembers(PinpointClientActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPinPointClientPresenter = mPinPointClientPresenterProvider.get();
  }

  public static void injectMPinPointClientPresenter(
      PinpointClientActivity instance,
      Provider<PinPointClientPresenter> mPinPointClientPresenterProvider) {
    instance.mPinPointClientPresenter = mPinPointClientPresenterProvider.get();
  }
}
