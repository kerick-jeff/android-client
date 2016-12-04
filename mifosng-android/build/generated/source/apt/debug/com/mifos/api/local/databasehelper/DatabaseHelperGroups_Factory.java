package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperGroups_Factory implements Factory<DatabaseHelperGroups> {
  INSTANCE;

  @Override
  public DatabaseHelperGroups get() {
    return new DatabaseHelperGroups();
  }

  public static Factory<DatabaseHelperGroups> create() {
    return INSTANCE;
  }
}
