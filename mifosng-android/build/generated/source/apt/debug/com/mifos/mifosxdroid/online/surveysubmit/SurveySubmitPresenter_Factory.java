package com.mifos.mifosxdroid.online.surveysubmit;

import com.mifos.api.datamanager.DataManagerSurveys;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SurveySubmitPresenter_Factory implements Factory<SurveySubmitPresenter> {
  private final MembersInjector<SurveySubmitPresenter> surveySubmitPresenterMembersInjector;

  private final Provider<DataManagerSurveys> dataManagerSurveysProvider;

  public SurveySubmitPresenter_Factory(
      MembersInjector<SurveySubmitPresenter> surveySubmitPresenterMembersInjector,
      Provider<DataManagerSurveys> dataManagerSurveysProvider) {
    assert surveySubmitPresenterMembersInjector != null;
    this.surveySubmitPresenterMembersInjector = surveySubmitPresenterMembersInjector;
    assert dataManagerSurveysProvider != null;
    this.dataManagerSurveysProvider = dataManagerSurveysProvider;
  }

  @Override
  public SurveySubmitPresenter get() {
    return MembersInjectors.injectMembers(
        surveySubmitPresenterMembersInjector,
        new SurveySubmitPresenter(dataManagerSurveysProvider.get()));
  }

  public static Factory<SurveySubmitPresenter> create(
      MembersInjector<SurveySubmitPresenter> surveySubmitPresenterMembersInjector,
      Provider<DataManagerSurveys> dataManagerSurveysProvider) {
    return new SurveySubmitPresenter_Factory(
        surveySubmitPresenterMembersInjector, dataManagerSurveysProvider);
  }
}
