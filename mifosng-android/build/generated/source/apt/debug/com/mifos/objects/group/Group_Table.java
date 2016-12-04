package com.mifos.objects.group;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Group_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.group.Group_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Group.class, "id");

  public static final Property<String> accountNo = new Property<String>(Group.class, "accountNo");

  public static final Property<Boolean> sync = new Property<Boolean>(Group.class, "sync");

  public static final Property<String> name = new Property<String>(Group.class, "name");

  public static final Property<Boolean> active = new Property<Boolean>(Group.class, "active");

  public static final LongProperty groupDate_groupId = new LongProperty(Group.class, "groupDate_groupId");

  public static final LongProperty groupDate_chargeId = new LongProperty(Group.class, "groupDate_chargeId");

  public static final Property<Integer> officeId = new Property<Integer>(Group.class, "officeId");

  public static final Property<String> officeName = new Property<String>(Group.class, "officeName");

  public static final IntProperty centerId = new IntProperty(Group.class, "centerId");

  public static final Property<String> centerName = new Property<String>(Group.class, "centerName");

  public static final Property<Integer> staffId = new Property<Integer>(Group.class, "staffId");

  public static final Property<String> staffName = new Property<String>(Group.class, "staffName");

  public static final Property<String> hierarchy = new Property<String>(Group.class, "hierarchy");

  public static final IntProperty groupLevel = new IntProperty(Group.class, "groupLevel");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,accountNo,sync,name,active,groupDate_groupId,groupDate_chargeId,officeId,officeName,centerId,centerName,staffId,staffName,hierarchy,groupLevel};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`sync`":  {
        return sync;
      }
      case "`name`":  {
        return name;
      }
      case "`active`":  {
        return active;
      }
      case "`groupDate_groupId`":  {
        return groupDate_groupId;
      }
      case "`groupDate_chargeId`":  {
        return groupDate_chargeId;
      }
      case "`officeId`":  {
        return officeId;
      }
      case "`officeName`":  {
        return officeName;
      }
      case "`centerId`":  {
        return centerId;
      }
      case "`centerName`":  {
        return centerName;
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
      case "`groupLevel`":  {
        return groupLevel;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
