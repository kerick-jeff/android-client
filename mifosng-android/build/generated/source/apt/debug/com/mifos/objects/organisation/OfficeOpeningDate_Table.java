package com.mifos.objects.organisation;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class OfficeOpeningDate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.organisation.OfficeOpeningDate_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty officeId = new IntProperty(OfficeOpeningDate.class, "officeId");

  public static final IntProperty year = new IntProperty(OfficeOpeningDate.class, "year");

  public static final IntProperty month = new IntProperty(OfficeOpeningDate.class, "month");

  public static final IntProperty day = new IntProperty(OfficeOpeningDate.class, "day");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{officeId,year,month,day};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`officeId`":  {
        return officeId;
      }
      case "`year`":  {
        return year;
      }
      case "`month`":  {
        return month;
      }
      case "`day`":  {
        return day;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
