package com.mifos.objects.group;

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
public final class GroupDate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.group.GroupDate_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty groupId = new LongProperty(GroupDate.class, "groupId");

  public static final LongProperty chargeId = new LongProperty(GroupDate.class, "chargeId");

  public static final IntProperty day = new IntProperty(GroupDate.class, "day");

  public static final IntProperty month = new IntProperty(GroupDate.class, "month");

  public static final IntProperty year = new IntProperty(GroupDate.class, "year");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{groupId,chargeId,day,month,year};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`groupId`":  {
        return groupId;
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
