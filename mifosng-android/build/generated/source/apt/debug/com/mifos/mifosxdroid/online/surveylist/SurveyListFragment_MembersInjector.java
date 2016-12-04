package com.mifos.mifosxdroid.online.surveylist;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SurveyListFragment_MembersInjector
    implements MembersInjector<SurveyListFragment> {
  private final Provider<SurveyListPresenter> mSurveyListPresenterProvider;

  public SurveyListFragment_MembersInjector(
      Provider<SurveyListPresenter> mSurveyListPresenterProvider) {
    assert mSurveyListPresenterProvider != null;
    this.mSurveyListPresenterProvider = mSurveyListPresenterProvider;
  }

  public static MembersInjector<SurveyListFragment> create(
      Provider<SurveyListPresenter> mSurveyListPresenterProvider) {
    return new SurveyListFragment_MembersInjector(mSurveyListPresenterProvider);
  }

  @Override
  public void injectMembers(SurveyListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSurveyListPresenter = mSurveyListPresenterProvider.get();
  }

  public static void injectMSurveyListPresenter(
      SurveyListFragment instance, Provider<SurveyListPresenter> mSurveyListPresenterProvider) {
    instance.mSurveyListPresenter = mSurveyListPresenterProvider.get();
  }
}
