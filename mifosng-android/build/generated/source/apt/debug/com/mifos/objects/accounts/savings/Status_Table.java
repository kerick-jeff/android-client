package com.mifos.objects.accounts.savings;

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
public final class Status_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.Status_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Status.class, "id");

  public static final Property<String> code = new Property<String>(Status.class, "code");

  public static final Property<String> value = new Property<String>(Status.class, "value");

  public static final Property<Boolean> submittedAndPendingApproval = new Property<Boolean>(Status.class, "submittedAndPendingApproval");

  public static final Property<Boolean> approved = new Property<Boolean>(Status.class, "approved");

  public static final Property<Boolean> rejected = new Property<Boolean>(Status.class, "rejected");

  public static final Property<Boolean> withdrawnByApplicant = new Property<Boolean>(Status.class, "withdrawnByApplicant");

  public static final Property<Boolean> active = new Property<Boolean>(Status.class, "active");

  public static final Property<Boolean> closed = new Property<Boolean>(Status.class, "closed");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,code,value,submittedAndPendingApproval,approved,rejected,withdrawnByApplicant,active,closed};
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
      case "`submittedAndPendingApproval`":  {
        return submittedAndPendingApproval;
      }
      case "`approved`":  {
        return approved;
      }
      case "`rejected`":  {
        return rejected;
      }
      case "`withdrawnByApplicant`":  {
        return withdrawnByApplicant;
      }
      case "`active`":  {
        return active;
      }
      case "`closed`":  {
        return closed;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
