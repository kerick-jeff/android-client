package com.mifos.mifosxdroid.login;

import com.mifos.api.DataManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginPresenter_Factory implements Factory<LoginPresenter> {
  private final Provider<DataManager> dataManagerProvider;

  public LoginPresenter_Factory(Provider<DataManager> dataManagerProvider) {
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public LoginPresenter get() {
    return new LoginPresenter(dataManagerProvider.get());
  }

  public static Factory<LoginPresenter> create(Provider<DataManager> dataManagerProvider) {
    return new LoginPresenter_Factory(dataManagerProvider);
  }
}
