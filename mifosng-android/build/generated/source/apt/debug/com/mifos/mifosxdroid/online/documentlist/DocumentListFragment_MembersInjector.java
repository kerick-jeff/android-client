package com.mifos.mifosxdroid.online.documentlist;

import com.mifos.mifosxdroid.adapters.DocumentListAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DocumentListFragment_MembersInjector
    implements MembersInjector<DocumentListFragment> {
  private final Provider<DocumentListPresenter> mDocumentListPresenterProvider;

  private final Provider<DocumentListAdapter> mDocumentListAdapterProvider;

  public DocumentListFragment_MembersInjector(
      Provider<DocumentListPresenter> mDocumentListPresenterProvider,
      Provider<DocumentListAdapter> mDocumentListAdapterProvider) {
    assert mDocumentListPresenterProvider != null;
    this.mDocumentListPresenterProvider = mDocumentListPresenterProvider;
    assert mDocumentListAdapterProvider != null;
    this.mDocumentListAdapterProvider = mDocumentListAdapterProvider;
  }

  public static MembersInjector<DocumentListFragment> create(
      Provider<DocumentListPresenter> mDocumentListPresenterProvider,
      Provider<DocumentListAdapter> mDocumentListAdapterProvider) {
    return new DocumentListFragment_MembersInjector(
        mDocumentListPresenterProvider, mDocumentListAdapterProvider);
  }

  @Override
  public void injectMembers(DocumentListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDocumentListPresenter = mDocumentListPresenterProvider.get();
    instance.mDocumentListAdapter = mDocumentListAdapterProvider.get();
  }

  public static void injectMDocumentListPresenter(
      DocumentListFragment instance,
      Provider<DocumentListPresenter> mDocumentListPresenterProvider) {
    instance.mDocumentListPresenter = mDocumentListPresenterProvider.get();
  }

  public static void injectMDocumentListAdapter(
      DocumentListFragment instance, Provider<DocumentListAdapter> mDocumentListAdapterProvider) {
    instance.mDocumentListAdapter = mDocumentListAdapterProvider.get();
  }
}
