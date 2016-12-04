package com.mifos.mifosxdroid.dialogfragments.documentdialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DocumentDialogFragment_MembersInjector
    implements MembersInjector<DocumentDialogFragment> {
  private final Provider<DocumentDialogPresenter> mDocumentDialogPresenterProvider;

  public DocumentDialogFragment_MembersInjector(
      Provider<DocumentDialogPresenter> mDocumentDialogPresenterProvider) {
    assert mDocumentDialogPresenterProvider != null;
    this.mDocumentDialogPresenterProvider = mDocumentDialogPresenterProvider;
  }

  public static MembersInjector<DocumentDialogFragment> create(
      Provider<DocumentDialogPresenter> mDocumentDialogPresenterProvider) {
    return new DocumentDialogFragment_MembersInjector(mDocumentDialogPresenterProvider);
  }

  @Override
  public void injectMembers(DocumentDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDocumentDialogPresenter = mDocumentDialogPresenterProvider.get();
  }

  public static void injectMDocumentDialogPresenter(
      DocumentDialogFragment instance,
      Provider<DocumentDialogPresenter> mDocumentDialogPresenterProvider) {
    instance.mDocumentDialogPresenter = mDocumentDialogPresenterProvider.get();
  }
}
