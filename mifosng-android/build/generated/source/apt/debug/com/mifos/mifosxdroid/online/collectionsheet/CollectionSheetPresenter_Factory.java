package com.mifos.mifosxdroid.online.collectionsheet;

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
public final class CollectionSheetPresenter_Factory implements Factory<CollectionSheetPresenter> {
  private final MembersInjector<CollectionSheetPresenter> collectionSheetPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public CollectionSheetPresenter_Factory(
      MembersInjector<CollectionSheetPresenter> collectionSheetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert collectionSheetPresenterMembersInjector != null;
    this.collectionSheetPresenterMembersInjector = collectionSheetPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public CollectionSheetPresenter get() {
    return MembersInjectors.injectMembers(
        collectionSheetPresenterMembersInjector,
        new CollectionSheetPresenter(dataManagerProvider.get()));
  }

  public static Factory<CollectionSheetPresenter> create(
      MembersInjector<CollectionSheetPresenter> collectionSheetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new CollectionSheetPresenter_Factory(
        collectionSheetPresenterMembersInjector, dataManagerProvider);
  }
}
