package com.mifos.mifosxdroid.dialogfragments.chargedialog;

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
public final class ChargeDialogPresenter_Factory implements Factory<ChargeDialogPresenter> {
  private final MembersInjector<ChargeDialogPresenter> chargeDialogPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public ChargeDialogPresenter_Factory(
      MembersInjector<ChargeDialogPresenter> chargeDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert chargeDialogPresenterMembersInjector != null;
    this.chargeDialogPresenterMembersInjector = chargeDialogPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public ChargeDialogPresenter get() {
    return MembersInjectors.injectMembers(
        chargeDialogPresenterMembersInjector, new ChargeDialogPresenter(dataManagerProvider.get()));
  }

  public static Factory<ChargeDialogPresenter> create(
      MembersInjector<ChargeDialogPresenter> chargeDialogPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new ChargeDialogPresenter_Factory(
        chargeDialogPresenterMembersInjector, dataManagerProvider);
  }
}
