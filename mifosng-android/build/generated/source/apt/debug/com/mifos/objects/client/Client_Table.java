package com.mifos.objects.client;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Client_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.Client_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(Client.class, "id");

  public static final IntProperty groupId = new IntProperty(Client.class, "groupId");

  public static final Property<String> accountNo = new Property<String>(Client.class, "accountNo");

  public static final IntProperty status_id = new IntProperty(Client.class, "status_id");

  public static final Property<Boolean> sync = new Property<Boolean>(Client.class, "sync");

  public static final Property<Boolean> active = new Property<Boolean>(Client.class, "active");

  public static final LongProperty clientDate_clientId = new LongProperty(Client.class, "clientDate_clientId");

  public static final LongProperty clientDate_chargeId = new LongProperty(Client.class, "clientDate_chargeId");

  public static final Property<String> firstname = new Property<String>(Client.class, "firstname");

  public static final Property<String> middlename = new Property<String>(Client.class, "middlename");

  public static final Property<String> lastname = new Property<String>(Client.class, "lastname");

  public static final Property<String> displayName = new Property<String>(Client.class, "displayName");

  public static final IntProperty officeId = new IntProperty(Client.class, "officeId");

  public static final Property<String> officeName = new Property<String>(Client.class, "officeName");

  public static final IntProperty staffId = new IntProperty(Client.class, "staffId");

  public static final Property<String> staffName = new Property<String>(Client.class, "staffName");

  public static final Property<String> fullname = new Property<String>(Client.class, "fullname");

  public static final IntProperty imageId = new IntProperty(Client.class, "imageId");

  public static final Property<Boolean> imagePresent = new Property<Boolean>(Client.class, "imagePresent");

  public static final Property<String> externalId = new Property<String>(Client.class, "externalId");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,groupId,accountNo,status_id,sync,active,clientDate_clientId,clientDate_chargeId,firstname,middlename,lastname,displayName,officeId,officeName,staffId,staffName,fullname,imageId,imagePresent,externalId};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`groupId`":  {
        return groupId;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`status_id`":  {
        return status_id;
      }
      case "`sync`":  {
        return sync;
      }
      case "`active`":  {
        return active;
      }
      case "`clientDate_clientId`":  {
        return clientDate_clientId;
      }
      case "`clientDate_chargeId`":  {
        return clientDate_chargeId;
      }
      case "`firstname`":  {
        return firstname;
      }
      case "`middlename`":  {
        return middlename;
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
      case "`staffId`":  {
        return staffId;
      }
      case "`staffName`":  {
        return staffName;
      }
      case "`fullname`":  {
        return fullname;
      }
      case "`imageId`":  {
        return imageId;
      }
      case "`imagePresent`":  {
        return imagePresent;
      }
      case "`externalId`":  {
        return externalId;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
