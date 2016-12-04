package com.mifos.objects.client;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class ClientDate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.ClientDate_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty clientId = new LongProperty(ClientDate.class, "clientId");

  public static final LongProperty chargeId = new LongProperty(ClientDate.class, "chargeId");

  public static final IntProperty day = new IntProperty(ClientDate.class, "day");

  public static final IntProperty month = new IntProperty(ClientDate.class, "month");

  public static final IntProperty year = new IntProperty(ClientDate.class, "year");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{clientId,chargeId,day,month,year};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`clientId`":  {
        return clientId;
      }
      case "`chargeId`":  {
        return chargeId;
      }
      case "`day`":  {
        return day;
      }
      case "`month`":  {
        return month;
      }
      case "`year`":  {
        return year;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
