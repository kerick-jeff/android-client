package com.mifos.objects.client;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class ChargeTimeType_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.ChargeTimeType_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(ChargeTimeType.class, "id");

  public static final Property<String> code = new Property<String>(ChargeTimeType.class, "code");

  public static final Property<String> value = new Property<String>(ChargeTimeType.class, "value");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,code,value};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`code`":  {
        return code;
      }
      case "`value`":  {
        return value;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}