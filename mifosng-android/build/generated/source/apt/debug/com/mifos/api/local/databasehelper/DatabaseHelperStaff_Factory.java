package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperStaff_Factory implements Factory<DatabaseHelperStaff> {
  INSTANCE;

  @Override
  public DatabaseHelperStaff get() {
    return new DatabaseHelperStaff();
  }

  public static Factory<DatabaseHelperStaff> create() {
    return INSTANCE;
  }
}
