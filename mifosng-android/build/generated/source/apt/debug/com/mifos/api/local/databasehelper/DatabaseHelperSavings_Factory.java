package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperSavings_Factory implements Factory<DatabaseHelperSavings> {
  INSTANCE;

  @Override
  public DatabaseHelperSavings get() {
    return new DatabaseHelperSavings();
  }

  public static Factory<DatabaseHelperSavings> create() {
    return INSTANCE;
  }
}
