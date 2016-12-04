package com.mifos.mifosxdroid.online.generatecollectionsheet;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenerateCollectionSheetFragment_MembersInjector
    implements MembersInjector<GenerateCollectionSheetFragment> {
  private final Provider<GenerateCollectionSheetPresenter>
      mGenerateCollectionSheetPresenterProvider;

  public GenerateCollectionSheetFragment_MembersInjector(
      Provider<GenerateCollectionSheetPresenter> mGenerateCollectionSheetPresenterProvider) {
    assert mGenerateCollectionSheetPresenterProvider != null;
    this.mGenerateCollectionSheetPresenterProvider = mGenerateCollectionSheetPresenterProvider;
  }

  public static MembersInjector<GenerateCollectionSheetFragment> create(
      Provider<GenerateCollectionSheetPresenter> mGenerateCollectionSheetPresenterProvider) {
    return new GenerateCollectionSheetFragment_MembersInjector(
        mGenerateCollectionSheetPresenterProvider);
  }

  @Override
  public void injectMembers(GenerateCollectionSheetFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGenerateCollectionSheetPresenter = mGenerateCollectionSheetPresenterProvider.get();
  }

  public static void injectMGenerateCollectionSheetPresenter(
      GenerateCollectionSheetFragment instance,
      Provider<GenerateCollectionSheetPresenter> mGenerateCollectionSheetPresenterProvider) {
    instance.mGenerateCollectionSheetPresenter = mGenerateCollectionSheetPresenterProvider.get();
  }
}
