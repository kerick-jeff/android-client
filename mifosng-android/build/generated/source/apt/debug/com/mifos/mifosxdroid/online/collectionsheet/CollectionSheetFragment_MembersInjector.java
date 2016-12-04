package com.mifos.mifosxdroid.online.collectionsheet;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CollectionSheetFragment_MembersInjector
    implements MembersInjector<CollectionSheetFragment> {
  private final Provider<CollectionSheetPresenter> mCollectionSheetPresenterProvider;

  public CollectionSheetFragment_MembersInjector(
      Provider<CollectionSheetPresenter> mCollectionSheetPresenterProvider) {
    assert mCollectionSheetPresenterProvider != null;
    this.mCollectionSheetPresenterProvider = mCollectionSheetPresenterProvider;
  }

  public static MembersInjector<CollectionSheetFragment> create(
      Provider<CollectionSheetPresenter> mCollectionSheetPresenterProvider) {
    return new CollectionSheetFragment_MembersInjector(mCollectionSheetPresenterProvider);
  }

  @Override
  public void injectMembers(CollectionSheetFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCollectionSheetPresenter = mCollectionSheetPresenterProvider.get();
  }

  public static void injectMCollectionSheetPresenter(
      CollectionSheetFragment instance,
      Provider<CollectionSheetPresenter> mCollectionSheetPresenterProvider) {
    instance.mCollectionSheetPresenter = mCollectionSheetPresenterProvider.get();
  }
}
