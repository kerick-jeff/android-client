package com.mifos.mifosxdroid.online.surveylist;

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
public final class SurveyListPresenter_Factory implements Factory<SurveyListPresenter> {
  private final MembersInjector<SurveyListPresenter> surveyListPresenterMembersInjector;

  private final Provider<DataManagerSurveys> dataManagerSurveysProvider;

  public SurveyListPresenter_Factory(
      MembersInjector<SurveyListPresenter> surveyListPresenterMembersInjector,
      Provider<DataManagerSurveys> dataManagerSurveysProvider) {
    assert surveyListPresenterMembersInjector != null;
    this.surveyListPresenterMembersInjector = surveyListPresenterMembersInjector;
    assert dataManagerSurveysProvider != null;
    this.dataManagerSurveysProvider = dataManagerSurveysProvider;
  }

  @Override
  public SurveyListPresenter get() {
    return MembersInjectors.injectMembers(
        surveyListPresenterMembersInjector,
        new SurveyListPresenter(dataManagerSurveysProvider.get()));
  }

  public static Factory<SurveyListPresenter> create(
      MembersInjector<SurveyListPresenter> surveyListPresenterMembersInjector,
      Provider<DataManagerSurveys> dataManagerSurveysProvider) {
    return new SurveyListPresenter_Factory(
        surveyListPresenterMembersInjector, dataManagerSurveysProvider);
  }
}
