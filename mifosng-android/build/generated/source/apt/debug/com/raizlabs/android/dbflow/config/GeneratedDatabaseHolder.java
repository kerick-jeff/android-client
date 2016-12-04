package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.converter.BooleanConverter;
import com.raizlabs.android.dbflow.converter.CalendarConverter;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.SqlDateConverter;
import java.lang.Boolean;
import java.sql.Date;
import java.util.Calendar;

public final class GeneratedDatabaseHolder extends DatabaseHolder {
  public GeneratedDatabaseHolder() {
    typeConverters.put(Date.class, new SqlDateConverter());
    typeConverters.put(Calendar.class, new CalendarConverter());
    typeConverters.put(java.util.Date.class, new DateConverter());
    typeConverters.put(Boolean.class, new BooleanConverter());
    new MifosDatabaseMifos_Database(this);
  }
}
