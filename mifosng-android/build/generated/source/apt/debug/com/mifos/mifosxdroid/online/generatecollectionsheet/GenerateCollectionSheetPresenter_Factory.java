package com.mifos.mifosxdroid.online.generatecollectionsheet;

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
public final class GenerateCollectionSheetPresenter_Factory
    implements Factory<GenerateCollectionSheetPresenter> {
  private final MembersInjector<GenerateCollectionSheetPresenter>
      generateCollectionSheetPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public GenerateCollectionSheetPresenter_Factory(
      MembersInjector<GenerateCollectionSheetPresenter>
          generateCollectionSheetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert generateCollectionSheetPresenterMembersInjector != null;
    this.generateCollectionSheetPresenterMembersInjector =
        generateCollectionSheetPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public GenerateCollectionSheetPresenter get() {
    return MembersInjectors.injectMembers(
        generateCollectionSheetPresenterMembersInjector,
        new GenerateCollectionSheetPresenter(dataManagerProvider.get()));
  }

  public static Factory<GenerateCollectionSheetPresenter> create(
      MembersInjector<GenerateCollectionSheetPresenter>
          generateCollectionSheetPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new GenerateCollectionSheetPresenter_Factory(
        generateCollectionSheetPresenterMembersInjector, dataManagerProvider);
  }
}
