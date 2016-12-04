package com.mifos.mifosxdroid.online.surveysubmit;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SurveySubmitFragment_MembersInjector
    implements MembersInjector<SurveySubmitFragment> {
  private final Provider<SurveySubmitPresenter> mSurveySubmitPresenterProvider;

  public SurveySubmitFragment_MembersInjector(
      Provider<SurveySubmitPresenter> mSurveySubmitPresenterProvider) {
    assert mSurveySubmitPresenterProvider != null;
    this.mSurveySubmitPresenterProvider = mSurveySubmitPresenterProvider;
  }

  public static MembersInjector<SurveySubmitFragment> create(
      Provider<SurveySubmitPresenter> mSurveySubmitPresenterProvider) {
    return new SurveySubmitFragment_MembersInjector(mSurveySubmitPresenterProvider);
  }

  @Override
  public void injectMembers(SurveySubmitFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSurveySubmitPresenter = mSurveySubmitPresenterProvider.get();
  }

  public static void injectMSurveySubmitPresenter(
      SurveySubmitFragment instance,
      Provider<SurveySubmitPresenter> mSurveySubmitPresenterProvider) {
    instance.mSurveySubmitPresenter = mSurveySubmitPresenterProvider.get();
  }
}
