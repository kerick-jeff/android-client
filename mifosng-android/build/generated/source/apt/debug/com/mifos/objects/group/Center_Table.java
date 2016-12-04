package com.mifos.objects.group;

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
public final class Center_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.group.Center_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Center.class, "id");

  public static final Property<Boolean> sync = new Property<Boolean>(Center.class, "sync");

  public static final Property<String> accountNo = new Property<String>(Center.class, "accountNo");

  public static final Property<String> name = new Property<String>(Center.class, "name");

  public static final Property<Integer> officeId = new Property<Integer>(Center.class, "officeId");

  public static final Property<String> officeName = new Property<String>(Center.class, "officeName");

  public static final Property<Integer> staffId = new Property<Integer>(Center.class, "staffId");

  public static final Property<String> staffName = new Property<String>(Center.class, "staffName");

  public static final Property<String> hierarchy = new Property<String>(Center.class, "hierarchy");

  public static final Property<Boolean> active = new Property<Boolean>(Center.class, "active");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,sync,accountNo,name,officeId,officeName,staffId,staffName,hierarchy,active};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`sync`":  {
        return sync;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`name`":  {
        return name;
      }
      case "`officeId`":  {
        return officeId;
      }
      case "`officeName`":  {
        return officeName;
      }
      case "`staffId`":  {
        return staffId;
      }
      case "`staffName`":  {
        return staffName;
      }
      case "`hierarchy`":  {
        return hierarchy;
      }
      case "`active`":  {
        return active;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
