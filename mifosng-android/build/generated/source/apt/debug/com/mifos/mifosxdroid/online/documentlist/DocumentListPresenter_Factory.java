package com.mifos.mifosxdroid.online.documentlist;

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
public final class DocumentListPresenter_Factory implements Factory<DocumentListPresenter> {
  private final MembersInjector<DocumentListPresenter> documentListPresenterMembersInjector;

  private final Provider<DataManagerDocument> dataManagerDocumentProvider;

  public DocumentListPresenter_Factory(
      MembersInjector<DocumentListPresenter> documentListPresenterMembersInjector,
      Provider<DataManagerDocument> dataManagerDocumentProvider) {
    assert documentListPresenterMembersInjector != null;
    this.documentListPresenterMembersInjector = documentListPresenterMembersInjector;
    assert dataManagerDocumentProvider != null;
    this.dataManagerDocumentProvider = dataManagerDocumentProvider;
  }

  @Override
  public DocumentListPresenter get() {
    return MembersInjectors.injectMembers(
        documentListPresenterMembersInjector,
        new DocumentListPresenter(dataManagerDocumentProvider.get()));
  }

  public static Factory<DocumentListPresenter> create(
      MembersInjector<DocumentListPresenter> documentListPresenterMembersInjector,
      Provider<DataManagerDocument> dataManagerDocumentProvider) {
    return new DocumentListPresenter_Factory(
        documentListPresenterMembersInjector, dataManagerDocumentProvider);
  }
}
