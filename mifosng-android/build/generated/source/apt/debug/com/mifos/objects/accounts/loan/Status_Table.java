package com.mifos.objects.accounts.loan;

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
  return com.mifos.objects.accounts.loan.Status_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Status.class, "id");

  public static final Property<String> code = new Property<String>(Status.class, "code");

  public static final Property<String> value = new Property<String>(Status.class, "value");

  public static final Property<Boolean> pendingApproval = new Property<Boolean>(Status.class, "pendingApproval");

  public static final Property<Boolean> waitingForDisbursal = new Property<Boolean>(Status.class, "waitingForDisbursal");

  public static final Property<Boolean> active = new Property<Boolean>(Status.class, "active");

  public static final Property<Boolean> closedObligationsMet = new Property<Boolean>(Status.class, "closedObligationsMet");

  public static final Property<Boolean> closedWrittenOff = new Property<Boolean>(Status.class, "closedWrittenOff");

  public static final Property<Boolean> closedRescheduled = new Property<Boolean>(Status.class, "closedRescheduled");

  public static final Property<Boolean> closed = new Property<Boolean>(Status.class, "closed");

  public static final Property<Boolean> overpaid = new Property<Boolean>(Status.class, "overpaid");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,code,value,pendingApproval,waitingForDisbursal,active,closedObligationsMet,closedWrittenOff,closedRescheduled,closed,overpaid};
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
      case "`pendingApproval`":  {
        return pendingApproval;
      }
      case "`waitingForDisbursal`":  {
        return waitingForDisbursal;
      }
      case "`active`":  {
        return active;
      }
      case "`closedObligationsMet`":  {
        return closedObligationsMet;
      }
      case "`closedWrittenOff`":  {
        return closedWrittenOff;
      }
      case "`closedRescheduled`":  {
        return closedRescheduled;
      }
      case "`closed`":  {
        return closed;
      }
      case "`overpaid`":  {
        return overpaid;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
