package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperSurveys;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerSurveys_Factory implements Factory<DataManagerSurveys> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperSurveys> databaseHelperSurveysProvider;

  public DataManagerSurveys_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperSurveys> databaseHelperSurveysProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperSurveysProvider != null;
    this.databaseHelperSurveysProvider = databaseHelperSurveysProvider;
  }

  @Override
  public DataManagerSurveys get() {
    return new DataManagerSurveys(
        baseApiManagerProvider.get(), databaseHelperSurveysProvider.get());
  }

  public static Factory<DataManagerSurveys> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperSurveys> databaseHelperSurveysProvider) {
    return new DataManagerSurveys_Factory(baseApiManagerProvider, databaseHelperSurveysProvider);
  }
}
