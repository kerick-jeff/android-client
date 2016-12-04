package com.mifos.mifosxdroid.login;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginPresenter> mLoginPresenterProvider;

  public LoginActivity_MembersInjector(Provider<LoginPresenter> mLoginPresenterProvider) {
    assert mLoginPresenterProvider != null;
    this.mLoginPresenterProvider = mLoginPresenterProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginPresenter> mLoginPresenterProvider) {
    return new LoginActivity_MembersInjector(mLoginPresenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mLoginPresenter = mLoginPresenterProvider.get();
  }

  public static void injectMLoginPresenter(
      LoginActivity instance, Provider<LoginPresenter> mLoginPresenterProvider) {
    instance.mLoginPresenter = mLoginPresenterProvider.get();
  }
}
