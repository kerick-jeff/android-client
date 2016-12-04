package com.mifos.objects.organisation;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Office_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.organisation.Office_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Office.class, "id");

  public static final Property<String> externalId = new Property<String>(Office.class, "externalId");

  public static final Property<String> name = new Property<String>(Office.class, "name");

  public static final Property<String> nameDecorated = new Property<String>(Office.class, "nameDecorated");

  public static final IntProperty officeOpeningDate_officeId = new IntProperty(Office.class, "officeOpeningDate_officeId");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,externalId,name,nameDecorated,officeOpeningDate_officeId};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`externalId`":  {
        return externalId;
      }
      case "`name`":  {
        return name;
      }
      case "`nameDecorated`":  {
        return nameDecorated;
      }
      case "`officeOpeningDate_officeId`":  {
        return officeOpeningDate_officeId;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
