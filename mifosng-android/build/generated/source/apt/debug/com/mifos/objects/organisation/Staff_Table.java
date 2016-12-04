package com.mifos.objects.organisation;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Staff_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.organisation.Staff_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Staff.class, "id");

  public static final Property<String> firstname = new Property<String>(Staff.class, "firstname");

  public static final Property<String> lastname = new Property<String>(Staff.class, "lastname");

  public static final Property<String> mobileNo = new Property<String>(Staff.class, "mobileNo");

  public static final Property<String> displayName = new Property<String>(Staff.class, "displayName");

  public static final Property<Integer> officeId = new Property<Integer>(Staff.class, "officeId");

  public static final Property<String> officeName = new Property<String>(Staff.class, "officeName");

  public static final Property<Boolean> isLoanOfficer = new Property<Boolean>(Staff.class, "isLoanOfficer");

  public static final Property<Boolean> isActive = new Property<Boolean>(Staff.class, "isActive");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,firstname,lastname,mobileNo,displayName,officeId,officeName,isLoanOfficer,isActive};
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
      case "`mobileNo`":  {
        return mobileNo;
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
      case "`isLoanOfficer`":  {
        return isLoanOfficer;
      }
      case "`isActive`":  {
        return isActive;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
