package com.mifos.mifosxdroid.dialogfragments.documentdialog;

import com.mifos.api.datamanager.DataManagerDocument;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DocumentDialogPresenter_Factory implements Factory<DocumentDialogPresenter> {
  private final MembersInjector<DocumentDialogPresenter> documentDialogPresenterMembersInjector;

  private final Provider<DataManagerDocument> dataManagerDocumentProvider;

  public DocumentDialogPresenter_Factory(
      MembersInjector<DocumentDialogPresenter> documentDialogPresenterMembersInjector,
      Provider<DataManagerDocument> dataManagerDocumentProvider) {
    assert documentDialogPresenterMembersInjector != null;
    this.documentDialogPresenterMembersInjector = documentDialogPresenterMembersInjector;
    assert dataManagerDocumentProvider != null;
    this.dataManagerDocumentProvider = dataManagerDocumentProvider;
  }

  @Override
  public DocumentDialogPresenter get() {
    return MembersInjectors.injectMembers(
        documentDialogPresenterMembersInjector,
        new DocumentDialogPresenter(dataManagerDocumentProvider.get()));
  }

  public static Factory<DocumentDialogPresenter> create(
      MembersInjector<DocumentDialogPresenter> documentDialogPresenterMembersInjector,
      Provider<DataManagerDocument> dataManagerDocumentProvider) {
    return new DocumentDialogPresenter_Factory(
        documentDialogPresenterMembersInjector, dataManagerDocumentProvider);
  }
}
