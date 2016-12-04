package com.mifos.objects.templates.clients;

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
public final class StaffOptions_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.templates.clients.StaffOptions_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(StaffOptions.class, "id");

  public static final Property<String> firstname = new Property<String>(StaffOptions.class, "firstname");

  public static final Property<String> lastname = new Property<String>(StaffOptions.class, "lastname");

  public static final Property<String> displayName = new Property<String>(StaffOptions.class, "displayName");

  public static final IntProperty officeId = new IntProperty(StaffOptions.class, "officeId");

  public static final Property<String> officeName = new Property<String>(StaffOptions.class, "officeName");

  public static final Property<Boolean> isLoan_officer = new Property<Boolean>(StaffOptions.class, "isLoan_officer");

  public static final Property<Boolean> is_Active = new Property<Boolean>(StaffOptions.class, "is_Active");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,firstname,lastname,displayName,officeId,officeName,isLoan_officer,is_Active};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`firstname`":  {
        return firstname;
      }
      case "`lastname`":  {
        return lastname;
      }
      case "`displayName`":  {
        return displayName;
      }
      case "`officeId`":  {
        return officeId;
      }
      case "`officeName`":  {
        return officeName;
      }
      case "`isLoan_officer`":  {
        return isLoan_officer;
      }
      case "`is_Active`":  {
        return is_Active;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
