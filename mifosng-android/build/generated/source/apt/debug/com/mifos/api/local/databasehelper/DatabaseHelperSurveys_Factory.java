package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperSurveys_Factory implements Factory<DatabaseHelperSurveys> {
  INSTANCE;

  @Override
  public DatabaseHelperSurveys get() {
    return new DatabaseHelperSurveys();
  }

  public static Factory<DatabaseHelperSurveys> create() {
    return INSTANCE;
  }
}
