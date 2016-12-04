package com.mifos.objects.client;

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
public final class ClientPayload_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.ClientPayload_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(ClientPayload.class, "id");

  public static final Property<String> errorMessage = new Property<String>(ClientPayload.class, "errorMessage");

  public static final Property<String> firstname = new Property<String>(ClientPayload.class, "firstname");

  public static final Property<String> lastname = new Property<String>(ClientPayload.class, "lastname");

  public static final Property<String> middlename = new Property<String>(ClientPayload.class, "middlename");

  public static final IntProperty officeId = new IntProperty(ClientPayload.class, "officeId");

  public static final IntProperty staffId = new IntProperty(ClientPayload.class, "staffId");

  public static final IntProperty genderId = new IntProperty(ClientPayload.class, "genderId");

  public static final Property<Boolean> active = new Property<Boolean>(ClientPayload.class, "active");

  public static final Property<String> activationDate = new Property<String>(ClientPayload.class, "activationDate");

  public static final Property<String> submittedOnDate = new Property<String>(ClientPayload.class, "submittedOnDate");

  public static final Property<String> dateOfBirth = new Property<String>(ClientPayload.class, "dateOfBirth");

  public static final Property<String> mobileNo = new Property<String>(ClientPayload.class, "mobileNo");

  public static final Property<String> externalId = new Property<String>(ClientPayload.class, "externalId");

  public static final IntProperty clientTypeId = new IntProperty(ClientPayload.class, "clientTypeId");

  public static final IntProperty clientClassificationId = new IntProperty(ClientPayload.class, "clientClassificationId");

  public static final Property<String> dateFormat = new Property<String>(ClientPayload.class, "dateFormat");

  public static final Property<String> locale = new Property<String>(ClientPayload.class, "locale");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,errorMessage,firstname,lastname,middlename,officeId,staffId,genderId,active,activationDate,submittedOnDate,dateOfBirth,mobileNo,externalId,clientTypeId,clientClassificationId,dateFormat,locale};
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
      case "`firstname`":  {
        return firstname;
      }
      case "`lastname`":  {
        return lastname;
      }
      case "`middlename`":  {
        return middlename;
      }
      case "`officeId`":  {
        return officeId;
      }
      case "`staffId`":  {
        return staffId;
      }
      case "`genderId`":  {
        return genderId;
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
      case "`dateOfBirth`":  {
        return dateOfBirth;
      }
      case "`mobileNo`":  {
        return mobileNo;
      }
      case "`externalId`":  {
        return externalId;
      }
      case "`clientTypeId`":  {
        return clientTypeId;
      }
      case "`clientClassificationId`":  {
        return clientClassificationId;
      }
      case "`dateFormat`":  {
        return dateFormat;
      }
      case "`locale`":  {
        return locale;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
