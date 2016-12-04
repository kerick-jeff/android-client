package com.mifos.objects.group;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class GroupPayload_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.group.GroupPayload_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(GroupPayload.class, "id");

  public static final Property<String> errorMessage = new Property<String>(GroupPayload.class, "errorMessage");

  public static final IntProperty officeId = new IntProperty(GroupPayload.class, "officeId");

  public static final Property<Boolean> active = new Property<Boolean>(GroupPayload.class, "active");

  public static final Property<String> activationDate = new Property<String>(GroupPayload.class, "activationDate");

  public static final Property<String> submittedOnDate = new Property<String>(GroupPayload.class, "submittedOnDate");

  public static final Property<String> externalId = new Property<String>(GroupPayload.class, "externalId");

  public static final Property<String> name = new Property<String>(GroupPayload.class, "name");

  public static final Property<String> locale = new Property<String>(GroupPayload.class, "locale");

  public static final Property<String> dateFormat = new Property<String>(GroupPayload.class, "dateFormat");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,errorMessage,officeId,active,activationDate,submittedOnDate,externalId,name,locale,dateFormat};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`errorMessage`":  {
        return errorMessage;
      }
      case "`officeId`":  {
        return officeId;
      }
      case "`active`":  {
        return active;
      }
      case "`activationDate`":  {
        return activationDate;
      }
      case "`submittedOnDate`":  {
        return submittedOnDate;
      }
      case "`externalId`":  {
        return externalId;
      }
      case "`name`":  {
        return name;
      }
      case "`locale`":  {
        return locale;
      }
      case "`dateFormat`":  {
        return dateFormat;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
