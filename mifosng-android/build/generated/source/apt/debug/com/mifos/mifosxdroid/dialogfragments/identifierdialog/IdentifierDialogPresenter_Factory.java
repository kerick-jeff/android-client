package com.mifos.mifosxdroid.dialogfragments.identifierdialog;

import com.mifos.api.datamanager.DataManagerClient;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IdentifierDialogPresenter_Factory implements Factory<IdentifierDialogPresenter> {
  private final MembersInjector<IdentifierDialogPresenter> identifierDialogPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public IdentifierDialogPresenter_Factory(
      MembersInjector<IdentifierDialogPresenter> identifierDialogPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert identifierDialogPresenterMembersInjector != null;
    this.identifierDialogPresenterMembersInjector = identifierDialogPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public IdentifierDialogPresenter get() {
    return MembersInjectors.injectMembers(
        identifierDialogPresenterMembersInjector,
        new IdentifierDialogPresenter(dataManagerClientProvider.get()));
  }

  public static Factory<IdentifierDialogPresenter> create(
      MembersInjector<IdentifierDialogPresenter> identifierDialogPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new IdentifierDialogPresenter_Factory(
        identifierDialogPresenterMembersInjector, dataManagerClientProvider);
  }
}
